/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualChargesApi

import play.api.libs.functional.syntax._
import play.api.libs.json.{Json, OFormat, Reads, Writes, __, _}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class LifetimeAllowance(amount: BigDecimal, taxPaid: BigDecimal)

object LifetimeAllowance {
  implicit val format: OFormat[LifetimeAllowance] = Json.format[LifetimeAllowance]
}

case class PensionSavingsTaxCharges(pensionSchemeTaxReference: Seq[String],
                                    lumpSumBenefitTakenInExcessOfLifetimeAllowance: Option[LifetimeAllowance],
                                    benefitInExcessOfLifetimeAllowance: Option[LifetimeAllowance],
                                    isAnnualAllowanceReduced: Boolean,
                                    taperedAnnualAllowance: Option[Boolean],
                                    moneyPurchasedAllowance: Option[Boolean])

object PensionSavingsTaxCharges {

  implicit val writes: Writes[PensionSavingsTaxCharges] = Json.writes[PensionSavingsTaxCharges]

  implicit val reads: Reads[PensionSavingsTaxCharges] = (
    (__ \ "pensionSchemeTaxReference").read[Seq[String]] and
      (__ \ "lumpSumBenefitTakenInExcessOfLifetimeAllowance").readNullable[LifetimeAllowance] and
      (__ \ "benefitInExcessOfLifetimeAllowance").readNullable[LifetimeAllowance] and
      (__ \ "isAnnualAllowanceReduced").read[Boolean] and
      (__ \ "taperedAnnualAllowance").readNullable[Boolean] and
      (__ \ "moneyPurchasedAllowance").readNullable[Boolean]
  )(PensionSavingsTaxCharges.apply _)

  implicit val format: Format[PensionSavingsTaxCharges] = Format(reads, writes)
}

case class OverseasSchemeProvider(providerName: String,
                                  providerAddress: String,
                                  providerCountryCode: String,
                                  qualifyingRecognisedOverseasPensionScheme: Option[Seq[String]],
                                  pensionSchemeTaxReference: Option[Seq[String]])

object OverseasSchemeProvider {
  implicit val format: OFormat[OverseasSchemeProvider] = Json.format[OverseasSchemeProvider]
}

case class PensionSchemeOverseasTransfers(overseasSchemeProvider: Seq[OverseasSchemeProvider],
                                          transferCharge: BigDecimal,
                                          transferChargeTaxPaid: BigDecimal)

object PensionSchemeOverseasTransfers {
  implicit val format: OFormat[PensionSchemeOverseasTransfers] = Json.format[PensionSchemeOverseasTransfers]
}

case class Charge(amount: BigDecimal, foreignTaxPaid: BigDecimal)

object Charge {
  implicit val format: OFormat[Charge] = Json.format[Charge]
}

case class PensionSchemeUnauthorisedPayments(pensionSchemeTaxReference: Seq[String], surcharge: Option[Charge], noSurcharge: Option[Charge])

object PensionSchemeUnauthorisedPayments {
  implicit val format: OFormat[PensionSchemeUnauthorisedPayments] = Json.format[PensionSchemeUnauthorisedPayments]
}

case class PensionContributions(pensionSchemeTaxReference: Seq[String], inExcessOfTheAnnualAllowance: BigDecimal, annualAllowanceTaxPaid: BigDecimal)

object PensionContributions {
  implicit val format: OFormat[PensionContributions] = Json.format[PensionContributions]
}

case class OverseasPensionContributions(overseasSchemeProvider: Seq[OverseasSchemeProvider],
                                        shortServiceRefund: BigDecimal,
                                        shortServiceRefundTaxPaid: BigDecimal)

object OverseasPensionContributions {
  implicit val format: OFormat[OverseasPensionContributions] = Json.format[OverseasPensionContributions]
}

case class RetrievePensionChargesResponse(pensionSavingsTaxCharges: Option[PensionSavingsTaxCharges],
                                          pensionSchemeOverseasTransfers: Option[PensionSchemeOverseasTransfers],
                                          pensionSchemeUnauthorisedPayments: Option[PensionSchemeUnauthorisedPayments],
                                          pensionContributions: Option[PensionContributions],
                                          overseasPensionContributions: Option[OverseasPensionContributions],
                                          links: Seq[HateoasLink]) {}

object RetrievePensionChargesResponse {
  implicit val format: OFormat[RetrievePensionChargesResponse] = Json.format[RetrievePensionChargesResponse]
}
