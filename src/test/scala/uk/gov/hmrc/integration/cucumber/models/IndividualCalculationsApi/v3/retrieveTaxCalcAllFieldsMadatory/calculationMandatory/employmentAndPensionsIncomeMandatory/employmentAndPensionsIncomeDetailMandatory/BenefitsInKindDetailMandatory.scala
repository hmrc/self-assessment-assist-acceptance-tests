/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v3.retrieveTaxCalcAllFieldsMadatory.calculationMandatory.employmentAndPensionsIncomeMandatory.employmentAndPensionsIncomeDetailMandatory

import play.api.libs.json._

case class BenefitsInKindDetailMandatory(apportionedAccommodation: BigDecimal,
                                         apportionedAssets: BigDecimal,
                                         apportionedAssetTransfer: BigDecimal,
                                         apportionedBeneficialLoan: BigDecimal,
                                         apportionedCar: BigDecimal,
                                         apportionedCarFuel: BigDecimal,
                                         apportionedEducationalServices: BigDecimal,
                                         apportionedEntertaining: BigDecimal,
                                         apportionedExpenses: BigDecimal,
                                         apportionedMedicalInsurance: BigDecimal,
                                         apportionedTelephone: BigDecimal,
                                         apportionedService: BigDecimal,
                                         apportionedTaxableExpenses: BigDecimal,
                                         apportionedVan: BigDecimal,
                                         apportionedVanFuel: BigDecimal,
                                         apportionedMileage: BigDecimal,
                                         apportionedNonQualifyingRelocationExpenses: BigDecimal,
                                         apportionedNurseryPlaces: BigDecimal,
                                         apportionedOtherItems: BigDecimal,
                                         apportionedPaymentsOnEmployeesBehalf: BigDecimal,
                                         apportionedPersonalIncidentalExpenses: BigDecimal,
                                         apportionedQualifyingRelocationExpenses: BigDecimal,
                                         apportionedEmployerProvidedProfessionalSubscriptions: BigDecimal,
                                         apportionedEmployerProvidedServices: BigDecimal,
                                         apportionedIncomeTaxPaidByDirector: BigDecimal,
                                         apportionedTravelAndSubsistence: BigDecimal,
                                         apportionedVouchersAndCreditCards: BigDecimal,
                                         apportionedNonCash: BigDecimal)

object BenefitsInKindDetailMandatory {
  implicit val read: Reads[BenefitsInKindDetailMandatory] = for {
    apportionedAccommodation                             <- (JsPath \ "apportionedAccommodation").read[BigDecimal]
    apportionedAssets                                    <- (JsPath \ "apportionedAssets").read[BigDecimal]
    apportionedAssetTransfer                             <- (JsPath \ "apportionedAssetTransfer").read[BigDecimal]
    apportionedBeneficialLoan                            <- (JsPath \ "apportionedBeneficialLoan").read[BigDecimal]
    apportionedCar                                       <- (JsPath \ "apportionedCar").read[BigDecimal]
    apportionedCarFuel                                   <- (JsPath \ "apportionedCarFuel").read[BigDecimal]
    apportionedEducationalServices                       <- (JsPath \ "apportionedEducationalServices").read[BigDecimal]
    apportionedEntertaining                              <- (JsPath \ "apportionedEntertaining").read[BigDecimal]
    apportionedExpenses                                  <- (JsPath \ "apportionedExpenses").read[BigDecimal]
    apportionedMedicalInsurance                          <- (JsPath \ "apportionedMedicalInsurance").read[BigDecimal]
    apportionedTelephone                                 <- (JsPath \ "apportionedTelephone").read[BigDecimal]
    apportionedTaxableExpenses                           <- (JsPath \ "apportionedTaxableExpenses").read[BigDecimal]
    apportionedService                                   <- (JsPath \ "apportionedService").read[BigDecimal]
    apportionedVan                                       <- (JsPath \ "apportionedVan").read[BigDecimal]
    apportionedVanFuel                                   <- (JsPath \ "apportionedVanFuel").read[BigDecimal]
    apportionedMileage                                   <- (JsPath \ "apportionedMileage").read[BigDecimal]
    apportionedNonQualifyingRelocationExpenses           <- (JsPath \ "apportionedNonQualifyingRelocationExpenses").read[BigDecimal]
    apportionedNurseryPlaces                             <- (JsPath \ "apportionedNurseryPlaces").read[BigDecimal]
    apportionedOtherItems                                <- (JsPath \ "apportionedOtherItems").read[BigDecimal]
    apportionedPaymentsOnEmployeesBehalf                 <- (JsPath \ "apportionedPaymentsOnEmployeesBehalf").read[BigDecimal]
    apportionedPersonalIncidentalExpenses                <- (JsPath \ "apportionedPersonalIncidentalExpenses").read[BigDecimal]
    apportionedQualifyingRelocationExpenses              <- (JsPath \ "apportionedQualifyingRelocationExpenses").read[BigDecimal]
    apportionedEmployerProvidedProfessionalSubscriptions <- (JsPath \ "apportionedEmployerProvidedProfessionalSubscriptions").read[BigDecimal]
    apportionedEmployerProvidedServices                  <- (JsPath \ "apportionedEmployerProvidedServices").read[BigDecimal]
    apportionedIncomeTaxPaidByDirector                   <- (JsPath \ "apportionedIncomeTaxPaidByDirector").read[BigDecimal]
    apportionedTravelAndSubsistence                      <- (JsPath \ "apportionedTravelAndSubsistence").read[BigDecimal]
    apportionedVouchersAndCreditCards                    <- (JsPath \ "apportionedVouchersAndCreditCards").read[BigDecimal]
    apportionedNonCash                                   <- (JsPath \ "apportionedNonCash").read[BigDecimal]
  } yield {
    BenefitsInKindDetailMandatory(
      apportionedAccommodation = apportionedAccommodation,
      apportionedAssets = apportionedAssets,
      apportionedAssetTransfer = apportionedAssetTransfer,
      apportionedBeneficialLoan = apportionedBeneficialLoan,
      apportionedCar = apportionedCar,
      apportionedCarFuel = apportionedCarFuel,
      apportionedEducationalServices = apportionedEducationalServices,
      apportionedEntertaining = apportionedEntertaining,
      apportionedExpenses = apportionedExpenses,
      apportionedMedicalInsurance = apportionedMedicalInsurance,
      apportionedTelephone = apportionedTelephone,
      apportionedService = apportionedService,
      apportionedTaxableExpenses = apportionedTaxableExpenses,
      apportionedVan = apportionedVan,
      apportionedVanFuel = apportionedVanFuel,
      apportionedMileage = apportionedMileage,
      apportionedNonQualifyingRelocationExpenses = apportionedNonQualifyingRelocationExpenses,
      apportionedNurseryPlaces = apportionedNurseryPlaces,
      apportionedOtherItems = apportionedOtherItems,
      apportionedPaymentsOnEmployeesBehalf = apportionedPaymentsOnEmployeesBehalf,
      apportionedPersonalIncidentalExpenses = apportionedPersonalIncidentalExpenses,
      apportionedQualifyingRelocationExpenses = apportionedQualifyingRelocationExpenses,
      apportionedEmployerProvidedProfessionalSubscriptions = apportionedEmployerProvidedProfessionalSubscriptions,
      apportionedEmployerProvidedServices = apportionedEmployerProvidedServices,
      apportionedIncomeTaxPaidByDirector = apportionedIncomeTaxPaidByDirector,
      apportionedTravelAndSubsistence = apportionedTravelAndSubsistence,
      apportionedVouchersAndCreditCards = apportionedVouchersAndCreditCards,
      apportionedNonCash = apportionedNonCash
    )
  }

  implicit val writes: OWrites[BenefitsInKindDetailMandatory] = (o: BenefitsInKindDetailMandatory) => {
    JsObject(
      Map(
        "apportionedAccommodation"                             -> Json.toJson(o.apportionedAccommodation),
        "apportionedAssets"                                    -> Json.toJson(o.apportionedAssets),
        "apportionedAssetTransfer"                             -> Json.toJson(o.apportionedAssetTransfer),
        "apportionedBeneficialLoan"                            -> Json.toJson(o.apportionedBeneficialLoan),
        "apportionedCar"                                       -> Json.toJson(o.apportionedCar),
        "apportionedCarFuel"                                   -> Json.toJson(o.apportionedCarFuel),
        "apportionedEducationalServices"                       -> Json.toJson(o.apportionedEducationalServices),
        "apportionedEntertaining"                              -> Json.toJson(o.apportionedEntertaining),
        "apportionedExpenses"                                  -> Json.toJson(o.apportionedExpenses),
        "apportionedMedicalInsurance"                          -> Json.toJson(o.apportionedMedicalInsurance),
        "apportionedTelephone"                                 -> Json.toJson(o.apportionedTelephone),
        "apportionedService"                                   -> Json.toJson(o.apportionedService),
        "apportionedTaxableExpenses"                           -> Json.toJson(o.apportionedTaxableExpenses),
        "apportionedVan"                                       -> Json.toJson(o.apportionedVan),
        "apportionedVanFuel"                                   -> Json.toJson(o.apportionedVanFuel),
        "apportionedMileage"                                   -> Json.toJson(o.apportionedMileage),
        "apportionedNonQualifyingRelocationExpenses"           -> Json.toJson(o.apportionedNonQualifyingRelocationExpenses),
        "apportionedNurseryPlaces"                             -> Json.toJson(o.apportionedNurseryPlaces),
        "apportionedOtherItems"                                -> Json.toJson(o.apportionedOtherItems),
        "apportionedPaymentsOnEmployeesBehalf"                 -> Json.toJson(o.apportionedPaymentsOnEmployeesBehalf),
        "apportionedPersonalIncidentalExpenses"                -> Json.toJson(o.apportionedPersonalIncidentalExpenses),
        "apportionedQualifyingRelocationExpenses"              -> Json.toJson(o.apportionedQualifyingRelocationExpenses),
        "apportionedEmployerProvidedProfessionalSubscriptions" -> Json.toJson(o.apportionedEmployerProvidedProfessionalSubscriptions),
        "apportionedEmployerProvidedServices"                  -> Json.toJson(o.apportionedEmployerProvidedServices),
        "apportionedIncomeTaxPaidByDirector"                   -> Json.toJson(o.apportionedIncomeTaxPaidByDirector),
        "apportionedTravelAndSubsistence"                      -> Json.toJson(o.apportionedTravelAndSubsistence),
        "apportionedVouchersAndCreditCards"                    -> Json.toJson(o.apportionedVouchersAndCreditCards),
        "apportionedNonCash"                                   -> Json.toJson(o.apportionedNonCash)
      ).filterNot { case (_, value) =>
        value == JsNull
      }
    )
  }
}