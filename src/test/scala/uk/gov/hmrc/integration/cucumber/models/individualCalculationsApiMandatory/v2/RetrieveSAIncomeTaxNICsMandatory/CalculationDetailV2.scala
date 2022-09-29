/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail._
import uk.gov.hmrc.integration.cucumber.models.individualCalculationsApiMandatory.v2.RetrieveSAIncomeTaxNICsMandatory.detail.pensionSavingsTaxCharges.PensionSavingsTaxChargesV2

case class CalculationDetailV2(incomeTax: IncomeTaxDetailV2,
                               studentLoans: Seq[StudentLoansV2],
                               marriageAllowanceTransferredIn: MarriageAllowanceTransferredInV2,
                               pensionSavingsTaxCharges: PensionSavingsTaxChargesV2,
                               nics: NicDetailV2,
                               taxDeductedAtSource: TaxDeductedAtSourceV2)

object CalculationDetailV2 {
  implicit val format: OFormat[CalculationDetailV2] = Json.format[CalculationDetailV2]
}
