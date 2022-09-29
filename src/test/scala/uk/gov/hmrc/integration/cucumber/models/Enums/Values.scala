/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import shapeless._

import scala.annotation.nowarn

// Based on code in https://github.com/milessabin/shapeless/blob/master/examples/src/main/scala/shapeless/examples/enum.scala
object Values {

  trait MkValues[E] {
    def values: List[E]
  }

  object MkValues {

    implicit def values[E, Impls <: Coproduct](implicit
        @nowarn("msg=parameter value gen") gen: Generic.Aux[E, Impls],
        v: Aux[E, Impls]): MkValues[E] =
      new MkValues[E] {
        def values: List[E] = v.values
      }

    trait Aux[E, Impls] {
      def values: List[E]
    }

    object Aux {

      implicit def cnilAux[E]: Aux[E, CNil] =
        new Aux[E, CNil] {
          def values: List[E] = Nil
        }

      implicit def cconsAux[E, L <: E, R <: Coproduct](implicit l: Witness.Aux[L], r: Aux[E, R]): Aux[E, L :+: R] =
        new Aux[E, L :+: R] {
          def values: List[E] = l.value :: r.values
        }

    }

  }

}
