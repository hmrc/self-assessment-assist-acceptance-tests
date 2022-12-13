/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.integration.cucumber.utils

import shapeless.labelled.FieldType
import shapeless.{::, HList, HNil, LabelledGeneric, Lazy, Witness}

import scala.annotation.nowarn
import scala.language.higherKinds

sealed abstract class ModelStructure

object ModelStructure {
  def structureOf[A: ModelStructureExtractor]: ModelStructure = ModelStructureExtractor[A].structure

  case class Obj(fields: Seq[(String, ModelStructure)]) extends ModelStructure
  case class Arr(structure: ModelStructure)             extends ModelStructure
  case object Primitive                                 extends ModelStructure

  def toPaths(structure: ModelStructure): Seq[String] = {
    def loop(path: String, jsValue: ModelStructure): Seq[String] =
      jsValue match {
        case ModelStructure.Obj(fields) =>
          fields.foldLeft(Seq.empty[String]) { case (acc, (name, jsValue)) =>
            acc ++ loop(s"$path/$name", jsValue)
          }
        case ModelStructure.Arr(inner) => loop(path + "[]", inner)
        case _                         => List(path)
      }

    loop("", structure)
  }

}

trait ModelStructureExtractor[A] {
  def structure: ModelStructure
}

// Internal specialization of ModelStructureExtractor for object instances so we can directly access its fields
private[utils] trait ObjModelStructureExtractor[A] extends ModelStructureExtractor[A] {
  def structure: ModelStructure.Obj
}

object ModelStructureExtractor {
  def apply[A](implicit aInstance: ModelStructureExtractor[A]): ModelStructureExtractor[A] = aInstance

  def instance[A](func: Unit => ModelStructure): ModelStructureExtractor[A] =
    new ModelStructureExtractor[A] {
      override def structure: ModelStructure = func(())
    }

  def instanceObj[A](func: Unit => ModelStructure.Obj): ObjModelStructureExtractor[A] =
    new ObjModelStructureExtractor[A] {
      override def structure: ModelStructure.Obj = func(())
    }

  def primitive[A]: ModelStructureExtractor[A] = instance[A](_ => ModelStructure.Primitive)

  implicit val stringInstance: ModelStructureExtractor[String]   = primitive
  implicit val intInstance: ModelStructureExtractor[Int]         = primitive
  implicit val doubleInstance: ModelStructureExtractor[Double]   = primitive
  implicit val booleanInstance: ModelStructureExtractor[Boolean] = primitive

  implicit val bigIntInstance: ModelStructureExtractor[BigInt]         = primitive
  implicit val bigDecimalInstance: ModelStructureExtractor[BigDecimal] = primitive

  implicit def optionInstance[A](implicit aInstance: ModelStructureExtractor[A]): ModelStructureExtractor[Option[A]] =
    instance(_ => aInstance.structure)

  implicit def seqInstance[T[_] <: Seq[_], A](implicit aInstance: ModelStructureExtractor[A]): ModelStructureExtractor[T[A]] =
    instance(_ => ModelStructure.Arr(aInstance.structure))

  implicit val hnilInstance: ObjModelStructureExtractor[HNil] = instanceObj(_ => ModelStructure.Obj(Nil))

  implicit def hlistInstance[K <: Symbol, H, T <: HList](implicit
      witness: Witness.Aux[K],
      hInstance: Lazy[ModelStructureExtractor[H]],
      tInstance: ObjModelStructureExtractor[T]
  ): ObjModelStructureExtractor[FieldType[K, H] :: T] =
    instanceObj { _ =>
      val hField  = witness.value.name -> hInstance.value.structure
      val tFields = tInstance.structure.fields
      ModelStructure.Obj(hField +: tFields)
    }

  implicit def genericInstance[A, R](implicit
      @nowarn gen: LabelledGeneric.Aux[A, R],
      enc: Lazy[ModelStructureExtractor[R]]
  ): ModelStructureExtractor[A] =
    instance(_ => enc.value.structure)

}
