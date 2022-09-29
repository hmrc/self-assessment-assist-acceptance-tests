/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail._
import uk.gov.hmrc.integration.cucumber.models.IndividualCalculationsApi.v2.RetrieveSAIncomeTaxNICs.detail.pensionSavingsTaxCharges.PensionSavingsTaxChargesV2

case class CalculationDetailV2(incomeTax: IncomeTaxDetailV2,
                               studentLoans: Option[Seq[StudentLoansV2]],
                               marriageAllowanceTransferredIn: Option[MarriageAllowanceTransferredInV2],
                               pensionSavingsTaxCharges: Option[PensionSavingsTaxChargesV2],
                               nics: Option[NicDetailV2],
                               taxDeductedAtSource: Option[TaxDeductedAtSourceV2],
                               capitalGainsTax: Option[CapitalGainsTaxDetail])

object CalculationDetailV2 {
  implicit val format: OFormat[CalculationDetailV2] = Json.format[CalculationDetailV2]
}
