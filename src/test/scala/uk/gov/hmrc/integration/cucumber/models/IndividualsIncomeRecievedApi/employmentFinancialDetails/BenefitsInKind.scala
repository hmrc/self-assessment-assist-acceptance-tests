/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsIncomeRecievedApi.employmentFinancialDetails

import play.api.libs.functional.syntax._
import play.api.libs.json.{Format, JsPath, OFormat}

case class BenefitsInKind(accommodation: Option[BigDecimal],
                          assets: Option[BigDecimal],
                          assetTransfer: Option[BigDecimal],
                          beneficialLoan: Option[BigDecimal],
                          car: Option[BigDecimal],
                          carFuel: Option[BigDecimal],
                          educationalServices: Option[BigDecimal],
                          entertaining: Option[BigDecimal],
                          expenses: Option[BigDecimal],
                          medicalInsurance: Option[BigDecimal],
                          telephone: Option[BigDecimal],
                          service: Option[BigDecimal],
                          taxableExpenses: Option[BigDecimal],
                          van: Option[BigDecimal],
                          vanFuel: Option[BigDecimal],
                          mileage: Option[BigDecimal],
                          nonQualifyingRelocationExpenses: Option[BigDecimal],
                          nurseryPlaces: Option[BigDecimal],
                          otherItems: Option[BigDecimal],
                          paymentsOnEmployeesBehalf: Option[BigDecimal],
                          personalIncidentalExpenses: Option[BigDecimal],
                          qualifyingRelocationExpenses: Option[BigDecimal],
                          employerProvidedProfessionalSubscriptions: Option[BigDecimal],
                          employerProvidedServices: Option[BigDecimal],
                          incomeTaxPaidByDirector: Option[BigDecimal],
                          travelAndSubsistence: Option[BigDecimal],
                          vouchersAndCreditCards: Option[BigDecimal],
                          nonCash: Option[BigDecimal])

object BenefitsInKind {

  val firstSegment: OFormat[(
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal]
  )] =
    ((JsPath \ "accommodation").formatNullable[BigDecimal] and
      (JsPath \ "assets").formatNullable[BigDecimal] and
      (JsPath \ "assetTransfer").formatNullable[BigDecimal] and
      (JsPath \ "beneficialLoan").formatNullable[BigDecimal] and
      (JsPath \ "car").formatNullable[BigDecimal] and
      (JsPath \ "carFuel").formatNullable[BigDecimal] and
      (JsPath \ "educationalServices").formatNullable[BigDecimal] and
      (JsPath \ "entertaining").formatNullable[BigDecimal] and
      (JsPath \ "expenses").formatNullable[BigDecimal] and
      (JsPath \ "medicalInsurance").formatNullable[BigDecimal] and
      (JsPath \ "telephone").formatNullable[BigDecimal] and
      (JsPath \ "service").formatNullable[BigDecimal] and
      (JsPath \ "taxableExpenses").formatNullable[BigDecimal] and
      (JsPath \ "van").formatNullable[BigDecimal]).tupled

  val secondSegment: OFormat[(
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal],
      Option[BigDecimal]
  )] =
    ((JsPath \ "vanFuel").formatNullable[BigDecimal] and
      (JsPath \ "mileage").formatNullable[BigDecimal] and
      (JsPath \ "nonQualifyingRelocationExpenses").formatNullable[BigDecimal] and
      (JsPath \ "nurseryPlaces").formatNullable[BigDecimal] and
      (JsPath \ "otherItems").formatNullable[BigDecimal] and
      (JsPath \ "paymentsOnEmployeesBehalf").formatNullable[BigDecimal] and
      (JsPath \ "personalIncidentalExpenses").formatNullable[BigDecimal] and
      (JsPath \ "qualifyingRelocationExpenses").formatNullable[BigDecimal] and
      (JsPath \ "employerProvidedProfessionalSubscriptions").formatNullable[BigDecimal] and
      (JsPath \ "employerProvidedServices").formatNullable[BigDecimal] and
      (JsPath \ "incomeTaxPaidByDirector").formatNullable[BigDecimal] and
      (JsPath \ "travelAndSubsistence").formatNullable[BigDecimal] and
      (JsPath \ "vouchersAndCreditCards").formatNullable[BigDecimal] and
      (JsPath \ "nonCash").formatNullable[BigDecimal]).tupled

  implicit val format: Format[BenefitsInKind] = (firstSegment and secondSegment)(
    {
      case (
            (
              accommodation,
              assets,
              assetTransfer,
              beneficialLoan,
              car,
              carFuel,
              educationalServices,
              entertaining,
              expenses,
              medicalInsurance,
              telephone,
              service,
              taxableExpenses,
              van),
            (
              vanFuel,
              mileage,
              nonQualifyingRelocationExpenses,
              nurseryPlaces,
              otherItems,
              paymentsOnEmployeesBehalf,
              personalIncidentalExpenses,
              qualifyingRelocationExpenses,
              employerProvidedProfessionalSubscriptions,
              employerProvidedServices,
              incomeTaxPaidByDirector,
              travelAndSubsistence,
              vouchersAndCreditCards,
              nonCash)) =>
        BenefitsInKind(
          accommodation,
          assets,
          assetTransfer,
          beneficialLoan,
          car,
          carFuel,
          educationalServices,
          entertaining,
          expenses,
          medicalInsurance,
          telephone,
          service,
          taxableExpenses,
          van,
          vanFuel,
          mileage,
          nonQualifyingRelocationExpenses,
          nurseryPlaces,
          otherItems,
          paymentsOnEmployeesBehalf,
          personalIncidentalExpenses,
          qualifyingRelocationExpenses,
          employerProvidedProfessionalSubscriptions,
          employerProvidedServices,
          incomeTaxPaidByDirector,
          travelAndSubsistence,
          vouchersAndCreditCards,
          nonCash
        )
    },
    (benefitsInKind: BenefitsInKind) =>
      (
        (
          benefitsInKind.accommodation,
          benefitsInKind.assets,
          benefitsInKind.assetTransfer,
          benefitsInKind.beneficialLoan,
          benefitsInKind.car,
          benefitsInKind.carFuel,
          benefitsInKind.educationalServices,
          benefitsInKind.entertaining,
          benefitsInKind.expenses,
          benefitsInKind.medicalInsurance,
          benefitsInKind.telephone,
          benefitsInKind.service,
          benefitsInKind.taxableExpenses,
          benefitsInKind.van),
        (
          benefitsInKind.vanFuel,
          benefitsInKind.mileage,
          benefitsInKind.nonQualifyingRelocationExpenses,
          benefitsInKind.nurseryPlaces,
          benefitsInKind.otherItems,
          benefitsInKind.paymentsOnEmployeesBehalf,
          benefitsInKind.personalIncidentalExpenses,
          benefitsInKind.qualifyingRelocationExpenses,
          benefitsInKind.employerProvidedProfessionalSubscriptions,
          benefitsInKind.employerProvidedServices,
          benefitsInKind.incomeTaxPaidByDirector,
          benefitsInKind.travelAndSubsistence,
          benefitsInKind.vouchersAndCreditCards,
          benefitsInKind.nonCash)
      )
  )

}
