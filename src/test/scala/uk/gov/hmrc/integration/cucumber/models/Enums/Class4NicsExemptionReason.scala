/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.Enums

import play.api.libs.json.Format
import uk.gov.hmrc.integration.cucumber.utils.ModelStructureExtractor

sealed trait Class4NicsExemptionReason

object Class4NicsExemptionReason {
  case object `non-resident`           extends Class4NicsExemptionReason
  case object `trustee`                extends Class4NicsExemptionReason
  case object `diver`                  extends Class4NicsExemptionReason
  case object `ITTOIA-2005`            extends Class4NicsExemptionReason
  case object `over-state-pension-age` extends Class4NicsExemptionReason
  case object `under-16`               extends Class4NicsExemptionReason

  implicit val structureExtractor: ModelStructureExtractor[Class4NicsExemptionReason] =
    ModelStructureExtractor.primitive

  implicit val format: Format[Class4NicsExemptionReason]         = Enums.format[Class4NicsExemptionReason]
  val parser: PartialFunction[String, Class4NicsExemptionReason] = Enums.parser[Class4NicsExemptionReason]
}
