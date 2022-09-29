/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import uk.gov.hmrc.integration.cucumber.endpoints.BasePage._

import java.time.LocalDateTime

object URLs {

  def getTaxYear: String = Seq(LocalDateTime.now.getYear.toString, LocalDateTime.now.plusYears(1).getYear.toString.takeRight(2)).mkString("-")

  def getNextTaxYear: String =
    Seq((LocalDateTime.now.getYear + 1).toString, LocalDateTime.now.plusYears(2).getYear.toString.takeRight(2)).mkString("-")

  def retrieveRequestUrl(url: String): String = {

    val saApiBaseUrl: String                                 = s"$saApiUrl/${taxPayer.nino}"
    val lossesApiBaseUrl: String                             = s"$individualLossesApiUrl/${taxPayer.nino}"
    val calcApiBaseUrl: String                               = s"$individualCalculationApiUrl/${taxPayer.nino}"
    val calcApiCrystallisationBaseUrl: String                = s"$individualCalculationApiUrl/crystallisation/${taxPayer.nino}"
    val bissApiBaseUrl: String                               = s"$saBissApiUrl/${taxPayer.nino}"
    val bsasApiBaseUrl: String                               = s"$saBsasApiUrl/${taxPayer.nino}"
    val accountsApiBaseUrl: String                           = s"$saAccountsApiUrl/${taxPayer.nino}"
    val businessDetailsApiBaseUrl: String                    = s"$businessDetailsApiUrl/${taxPayer.nino}"
    val individualsOtherExpensesApiBaseUrl: String           = s"$individualsExpensesApiUrl/other/${taxPayer.nino}"
    val individualsEmploymentExpensesApiBaseUrl: String      = s"$individualsExpensesApiUrl/employments/${taxPayer.nino}"
    val individualsReliefsInvestmentsApiBaseUrl: String      = s"$individualsReliefsApiUrl/investment/${taxPayer.nino}"
    val individualsOtherReliefsApiBaseUrl: String            = s"$individualsReliefsApiUrl/other/${taxPayer.nino}"
    val individualsForeignReliefsApiBaseUrl: String          = s"$individualsReliefsApiUrl/foreign/${taxPayer.nino}"
    val individualsPensionsReliefsApiBaseUrl: String         = s"$individualsReliefsApiUrl/pensions/${taxPayer.nino}"
    val individualsCharitableGivingReliefsApiBaseUrl: String = s"$individualsReliefsApiUrl/charitable-giving/${taxPayer.nino}"
    val individualIncomeReceivedApiBaseUrl: String           = s"$individualsIncomeReceivedApiUrl"
    val otherDeductionsApiBaseUrl: String                    = s"$otherDeductionsApiUrl/${taxPayer.nino}"
    val individualsDisclosuresApiBaseUrl: String             = s"$individualsDisclosuresApiUrl/${taxPayer.nino}"
    val individualsStateBenefitsApiBaseUrl: String           = individualsStateBenefitsApiUrl
    val propertyBusinessApiBaseUrl: String                   = s"$propertyBusinessApiUrl/${taxPayer.nino}"
    val propertyBusinessApiV2BaseUrl: String                 = s"$propertyBusinessApiUrl"
    val individualsChargesPensionsApiBaseUrl: String         = s"$individualsChargesApiUrl/pensions"
    val individualsBusinessEOPSSApiBaseUrl: String           = s"$individualsBusinessEOPSApiUrl"
    val obligationsApiBaseUrl: String                        = s"$obligationsApiUrl/${taxPayer.nino}"
    val selfEmploymentBusinessApiBaseUrl: String             = s"$selfEmploymentBusinessApiUrl"
    val cisDeductionsApiBaseUrl: String                      = s"$cisDeductionsApiUrl/${taxPayer.nino}"

    url match {

      // ░▒▓▓▓ CIS Deductions API ▓▓▓▒░
      case "cisCreateUrl"             => s"$cisDeductionsApiBaseUrl/amendments"
      case "cisRetrieveUrl"           => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05"
      case "cisRetrieveAllUrl"        => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05&source=all"
      case "cisRetrieveCustomerUrl"   => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05&source=customer"
      case "cisRetrieveContractorUrl" => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05&source=contractor"
      case "cisAmendOrDeleteUrl"      => s"$cisDeductionsApiBaseUrl/amendments/4557ecb5-fd32-48cc-81f5-e6acd1099f3c"

      // ░▒▓▓▓ Self Employment Business API ▓▓▓▒░
      case "SelfEmploymentBusinessAnnualSubmissionUrl" => s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/annual/$getTaxYear"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2019-01-25_2020-01-25"
      case "CreateOrListSelfEmploymentBusinessPeriodSummariesUrl" => s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period"

      // ░▒▓▓▓ Obligations API ▓▓▓▒░
      case "RetrievePeriodicObligationsUrl"                 => s"$obligationsApiBaseUrl/income-and-expenditure"
      case "RetrieveCrystallisationObligationsUrl"          => s"$obligationsApiBaseUrl/crystallisation?taxYear=2018-19"
      case "RetrieveCrystallisationObligationsIncorrectUrl" => s"$obligationsApiBaseUrl/crystallisationa?taxYear=2018-19"
      case "RetrieveEOPSUrl"                                => s"$obligationsApiBaseUrl/end-of-period-statement"
      case "RetrieveEOPSOpenUrl"                            => s"$obligationsApiBaseUrl/end-of-period-statement?status=Open"
      case "RetrieveEOPSFulfilledUrl"                       => s"$obligationsApiBaseUrl/end-of-period-statement?status=Fulfilled"
      case "RetrieveEOPSForeignPropertyUrl"                 => s"$obligationsApiBaseUrl/end-of-period-statement?typeOfBusiness=foreign-property"

      // ░▒▓▓▓ Individuals State Benefits API ▓▓▓▒░
      case "IndividualsStateBenefitsAmountsUrl"  => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/2019-20/$randomBenefitId/amounts"
      case "IndividualsStateBenefitsIgnoreUrl"   => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/2019-20/$randomBenefitId/ignore"
      case "IndividualsStateBenefitsUnignoreUrl" => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/2019-20/$randomBenefitId/unignore"
      case "IndividualsStateBenefitsPathIdUrl"   => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/2019-20/$randomBenefitId"
      case "IndividualsStateBenefitsQueryIdUrl"  => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/2019-20?benefitId=$randomBenefitId"
      case "IndividualsStateBenefitsUrl"         => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/2019-20"

      // ░▒▓▓▓ Individuals Disclosures API ▓▓▓▒░
      case "IndividualsDisclosuresUrl" => s"$individualsDisclosuresApiBaseUrl/$getNextTaxYear"
      case "MarriageAllowanceUrl"      => s"$individualsDisclosuresApiUrl/marriage-allowance/${taxPayer.nino}"

      // ░▒▓▓▓ Property Business API ▓▓▓▒░
      case "ForeignPropertyPeriodSummaryUrl"              => s"$propertyBusinessApiBaseUrl/$randomBusinessId/period/$randomSubmissionId"
      case "ForeignPropertyPeriodSummaryCreateAndListUrl" => s"$propertyBusinessApiBaseUrl/$randomBusinessId/period"
      case "ForeignPropertyAnnualSubmissionUrl"           => s"$propertyBusinessApiBaseUrl/$randomBusinessId/annual/2021-22"

      // ░▒▓▓▓ Property Business API V2 ▓▓▓▒░
      case "UKPropertyPeriodSummaryUrl" => s"$propertyBusinessApiV2BaseUrl/uk/${taxPayer.nino}/$randomBusinessId/period/2022-23/$randomSubmissionId"
      case "UKPropertyAnnualSubmissionUrl"     => s"$propertyBusinessApiV2BaseUrl/uk/${taxPayer.nino}/$randomBusinessId/annual/2022-23"
      case "DeletePropertyAnnualSubmissionUrl" => s"$propertyBusinessApiV2BaseUrl/${taxPayer.nino}/$randomBusinessId/annual/2022-23"
      case "UkPropertyPeriodSummaryUrl" => s"$propertyBusinessApiV2BaseUrl/uk/${taxPayer.nino}/$randomBusinessId/period/2022-23/$randomSubmissionId"
      case "CreateUKPropertyPeriodSummaryUrl" => s"$propertyBusinessApiV2BaseUrl/uk/${taxPayer.nino}/$randomBusinessId/period/2022-23"
      case "ForeignPropertyPeriodSummaryUrlV2" =>
        s"$propertyBusinessApiV2BaseUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/2021-22/$randomSubmissionId"
      case "ListPropertyPeriodSummariesUrl"          => s"$propertyBusinessApiBaseUrl/$randomBusinessId/period/2022-23"
      case "CreateForeignPropertyPeriodSummaryUrlV2" => s"$propertyBusinessApiV2BaseUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/2022-23"
      case "ForeignPropertyAnnualSubmissionUrlV2"    => s"$propertyBusinessApiV2BaseUrl/foreign/${taxPayer.nino}/$randomBusinessId/annual/2022-23"

      // ░▒▓▓▓ Historic endpoints within Property Business API V2 ▓▓▓▒░
      case "HistoricFhlUKPropertyAnnualSubmissionUrl" =>
        s"$propertyBusinessApiV2BaseUrl/uk/annual/furnished-holiday-lettings/${taxPayer.nino}/2021-22"
      case "HistoricNonFhlUKPropertyAnnualSubmissionUrl" =>
        s"$propertyBusinessApiV2BaseUrl/uk/annual/non-furnished-holiday-lettings/${taxPayer.nino}/2021-22"

      case "HistoricFhlUKPropertyPeriodSummaryUrl"    => s"$propertyBusinessApiV2BaseUrl/uk/period/furnished-holiday-lettings/${taxPayer.nino}"
      case "HistoricNonFhlUKPropertyPeriodSummaryUrl" => s"$propertyBusinessApiV2BaseUrl/uk/period/non-furnished-holiday-lettings/${taxPayer.nino}"

      case "HistoricFhlUKPropertyPeriodSummaryPeriodUrl" =>
        s"$propertyBusinessApiV2BaseUrl/uk/period/furnished-holiday-lettings/${taxPayer.nino}/2017-04-06_2017-07-04"
      case "HistoricNonFhlUKPropertyPeriodSummaryPeriodUrl" =>
        s"$propertyBusinessApiV2BaseUrl/uk/period/non-furnished-holiday-lettings/${taxPayer.nino}/2017-04-06_2017-07-04"

      // ░▒▓▓▓ Other Deductions API ▓▓▓▒░
      case "OtherDeductionsUrl" => s"$otherDeductionsApiBaseUrl/2021-22"

      // ░▒▓▓▓ Individual Income Received API ▓▓▓▒░
      // Additional Income
      case "IndividualsIncomeReceivedSavingsUrl"           => s"$individualIncomeReceivedApiBaseUrl/savings/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedInsurancePoliciesUrl" => s"$individualIncomeReceivedApiBaseUrl/insurance-policies/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedForeignUrl"           => s"$individualIncomeReceivedApiBaseUrl/foreign/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedPensionsUrl"          => s"$individualIncomeReceivedApiBaseUrl/pensions/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedOtherUrl"             => s"$individualIncomeReceivedApiBaseUrl/other/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedOtherEmploymentUrl"   => s"$individualIncomeReceivedApiBaseUrl/employments/other/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedDividendsUrl"         => s"$individualIncomeReceivedApiBaseUrl/dividends/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedUkDividendsUrl"       => s"$individualIncomeReceivedApiBaseUrl/uk-dividends/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedUkDividendsTysUrl"    => s"$individualIncomeReceivedApiBaseUrl/uk-dividends/${taxPayer.nino}/2023-24"
      case "IndividualsIncomeReceivedUkSavingsAccountsUrl" => s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}"
      case "IndividualsIncomeReceivedUkSavingsAccountsSingleRetrieveUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}?savingsAccountId=$randomSavingsAccountId"
      case "IndividualsIncomeReceivedUkSavingsAccountSummaryUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}/2019-20/$randomSavingsAccountId"

      // Employments
      case "IndividualsIncomeReceivedEmploymentsUrl" => s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20"
      case "IndividualsIncomeReceivedEmploymentsIgnoreUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20/$randomEmploymentId/ignore"
      case "IndividualsIncomeReceivedEmploymentsUnignoreUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20/$randomEmploymentId/unignore"
      case "IndividualsIncomeReceivedEmploymentsIdUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20/$randomEmploymentId"
      case "IndividualsIncomeReceivedFinancialDetailsUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20/$randomEmploymentId/financial-details"
      case "IndividualsIncomeReceivedFinancialDetailsLatestUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20/$randomEmploymentId/financial-details?source=latest"
      case "IndividualsIncomeReceivedFinancialDetailsUserUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20/$randomEmploymentId/financial-details?source=user"
      case "IndividualsIncomeReceivedFinancialDetailsHMRCHeldUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/2019-20/$randomEmploymentId/financial-details?source=hmrcHeld"

      // Capital Gains Tax
      case "IndividualsIncomeReceivedOtherCapitalGainsUrl" => s"$individualIncomeReceivedApiBaseUrl/disposals/other-gains/${taxPayer.nino}/2021-22"
      case "IndividualsIncomeReceivedPPDUrl"   => s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/2020-21/ppd"
      case "CgtRetrieveResidentialPropertyUrl" => s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/2020-21"
      case "CgtRetrieveResidentialPropertyUserUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/2020-21?source=user"
      case "CgtRetrieveResidentialPropertyHmrcHeldUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/2020-21?source=hmrcHeld"
      case "CgtRetrieveResidentialPropertyLatestUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/2020-21?source=latest"

      // Non-PAYE
      case "IndividualsIncomeReceivedNonPayeEmploymentIncomeUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/non-paye/${taxPayer.nino}/2020-21"
      case "IndividualsIncomeReceivedNonPayeUserUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/non-paye/${taxPayer.nino}/2020-21?source=user"
      case "IndividualsIncomeReceivedNonPayeHMRCHeldUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/non-paye/${taxPayer.nino}/2020-21?source=hmrcHeld"
      case "IndividualsIncomeReceivedNonPayeLatestUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/non-paye/${taxPayer.nino}/2020-21?source=latest"

      // ░▒▓▓▓ Individuals Reliefs API ▓▓▓▒░
      case "ReliefsInvestmentsUrl"      => s"$individualsReliefsInvestmentsApiBaseUrl/2020-21"
      case "OtherReliefsUrl"            => s"$individualsOtherReliefsApiBaseUrl/2020-21"
      case "ForeignReliefsUrl"          => s"$individualsForeignReliefsApiBaseUrl/2020-21"
      case "PensionReliefsUrl"          => s"$individualsPensionsReliefsApiBaseUrl/2020-21"
      case "CharitableGivingReliefsUrl" => s"$individualsCharitableGivingReliefsApiBaseUrl/2020-21"

      // ░▒▓▓▓ Individual Expenses API ▓▓▓▒░
      case "individualsOtherExpensesUrl" => s"$individualsOtherExpensesApiBaseUrl/2021-22"
      case "employmentExpensesUrl"       => s"$individualsEmploymentExpensesApiBaseUrl/2019-20"
      case "amendEmploymentExpensesUrl"  => s"$individualsEmploymentExpensesApiBaseUrl/2019-20"
      case "hmrcEmploymentExpensesUrl"   => s"$individualsEmploymentExpensesApiBaseUrl/2019-20?source=hmrcHeld"
      case "userEmploymentExpensesUrl"   => s"$individualsEmploymentExpensesApiBaseUrl/2019-20?source=user"
      case "ignoreEmploymentExpensesUrl" => s"$individualsEmploymentExpensesApiBaseUrl/2019-20/ignore"

      // ░▒▓▓▓ Business Details API ▓▓▓▒░
      case "ListAllBusinessesUrl"               => s"$businessDetailsApiBaseUrl/list"
      case "RetrieveBusinessDetailsUrlDefault"  => s"$businessDetailsApiBaseUrl/XBIS12345678901"
      case "RetrieveBusinessDetailsUrlProperty" => s"$businessDetailsApiBaseUrl/XPIS12345678901"
      case "RetrieveBusinessDetailsUrlForeign"  => s"$businessDetailsApiBaseUrl/XFIS12345678901"

      // ░▒▓▓▓ Self Assessment Accounts API ▓▓▓▒░
      //V1
      // Payments and Liabilities
      case "RetrieveBalanceUrl"            => s"$accountsApiBaseUrl/balance"
      case "ListTransactionsUrl"           => s"$accountsApiBaseUrl/transactions?from=2019-10-10&to=2019-11-10"
      case "RetrieveTransactionDetailsUrl" => s"$accountsApiBaseUrl/transactions/$randomTransactionId"
      case "ListPaymentsUrl"               => s"$accountsApiBaseUrl/payments?from=2019-10-10&to=2019-11-10"
      case "RetrieveAllocationsUrl"        => s"$accountsApiBaseUrl/payments/$randomPaymentId"
      case "ListChargesUrl"                => s"$accountsApiBaseUrl/charges?from=2019-10-10&to=2019-11-10"
      case "RetrieveChargeHistoryUrl"      => s"$accountsApiBaseUrl/charges/$randomTransactionId"

      // Coding Out Underpayments and Debts
      case "RetrieveCodingOutUnderpaymentsDefaultUrl"  => s"$accountsApiBaseUrl/2019-20/collection/tax-code"
      case "RetrieveCodingOutUnderpaymentsLatestUrl"   => s"$accountsApiBaseUrl/2019-20/collection/tax-code?source=latest"
      case "RetrieveCodingOutUnderpaymentsUserUrl"     => s"$accountsApiBaseUrl/2019-20/collection/tax-code?source=user"
      case "RetrieveCodingOutUnderpaymentsHmrcHeldUrl" => s"$accountsApiBaseUrl/2019-20/collection/tax-code?source=hmrcHeld"
      case "CodingOutUrl"                              => s"$accountsApiBaseUrl/2019-20/collection/tax-code"


      // ░▒▓▓▓ Self Assessment BISS API ▓▓▓▒░
      // V1
      case "RetrieveSEBissUrl"               => s"$bissApiBaseUrl/self-employment?selfEmploymentId=$randomSelfEmploymentId&taxYear=2017-18"
      case "RetrieveIncorrectSEBissUrl"      => s"$bissApiBaseUrl/self-employment/INCORRECT?selfEmploymentId=$randomSelfEmploymentId&taxYear=2017-18"
      case "RetrieveSEBissWithoutTaxYearUrl" => s"$bissApiBaseUrl/self-employment?selfEmploymentId=$randomSelfEmploymentId"
      case "RetrieveUkPropBissUrl"           => s"$bissApiBaseUrl/uk-property?typeOfBusiness=uk-property-fhl&taxYear=2017-18"
      case "RetrieveUkPropBissWithoutTaxYearUrl" => s"$bissApiBaseUrl/uk-property?typeOfBusiness=uk-property-fhl"
      case "RetrieveForeignPropFhlBissUrl" =>
        s"$bissApiBaseUrl/foreign-property?typeOfBusiness=foreign-property-fhl-eea&businessId=XAIS12345678910&taxYear=2019-20"
      case "RetrieveForeignPropFhlBissWithoutTaxYearUrl" =>
        s"$bissApiBaseUrl/foreign-property?typeOfBusiness=foreign-property-fhl-eea&businessId=XAIS12345678910"
      case "RetrieveForeignPropBissUrl" =>
        s"$bissApiBaseUrl/foreign-property?typeOfBusiness=foreign-property&businessId=XAIS12345678910&taxYear=2019-20"
      // V2
      case "RetrieveSEBissUrlV2"          => s"$bissApiBaseUrl/self-employment/2020-21/XAIS12345678910"
      case "RetrieveForeignPropBissUrlV2" => s"$bissApiBaseUrl/foreign-property/2020-21/XAIS12345678910"
      case "RetrieveUkPropBissUrlV2"      => s"$bissApiBaseUrl/uk-property-fhl/2020-21/XAIS12345678910"

      // ░▒▓▓▓ Self Assessment BSAS API ▓▓▓▒░
      // V2
      case "TriggerBsasUrl"                            => s"$bsasApiBaseUrl/trigger"
      case "SaBsasListUrl"                             => s"$bsasApiBaseUrl?taxYear=$getTaxYear"
      case "SubmitUkPropBsasAdjustmentUrl"             => s"$bsasApiBaseUrl/property/$randomCalcId/adjust"
      case "SubmitSEBsasAdjustmentUrl"                 => s"$bsasApiBaseUrl/self-employment/$randomCalcId/adjust"
      case "RetrieveUkPropBsasUrlNoParameters"         => s"$bsasApiBaseUrl/property/$randomBsasId"
      case "RetrieveUkPropBsasUrlReturnTrue"           => s"$bsasApiBaseUrl/property/$randomBsasId?adjustedStatus=true"
      case "RetrieveUkPropBsasUrlReturnFalse"          => s"$bsasApiBaseUrl/property/$randomBsasId?adjustedStatus=false"
      case "RetrieveSelfEmploymentBsasUrlNoParameters" => s"$bsasApiBaseUrl/self-employment/$randomBsasId"
      case "RetrieveSelfEmploymentBsasUrlReturnTrue"   => s"$bsasApiBaseUrl/self-employment/$randomBsasId?adjustedStatus=true"
      case "RetrieveSelfEmploymentBsasUrlReturnFalse"  => s"$bsasApiBaseUrl/self-employment/$randomBsasId?adjustedStatus=false"
      case "RetrieveForeignPropBsasUrlNoParameters"    => s"$bsasApiBaseUrl/foreign-property/$randomBsasId"
      case "RetrieveForeignPropBsasUrlReturnTrue"      => s"$bsasApiBaseUrl/foreign-property/$randomBsasId?adjustedStatus=true"
      case "RetrieveForeignPropBsasUrlReturnFalse"     => s"$bsasApiBaseUrl/foreign-property/$randomBsasId?adjustedStatus=false"
      case "RetrieveSelfEmploymentBsasAdjustmentsUrl"  => s"$bsasApiBaseUrl/self-employment/$randomBsasId/adjust"
      case "RetrieveUkPropBsasAdjustmentsUrl"          => s"$bsasApiBaseUrl/property/$randomBsasId/adjust"
      case "RetrieveForeignPropBsasAdjustmentsUrl"     => s"$bsasApiBaseUrl/foreign-property/$randomBsasId/adjust"

      // V3
      case "RetrieveUkPropBsasV3Url"            => s"$bsasApiBaseUrl/uk-property/$randomCalcId"
      case "RetrieveSelfEmploymentBsasUrlV3"    => s"$bsasApiBaseUrl/self-employment/$randomCalcId"
      case "SubmitForeignPropBsasAdjustmentUrl" => s"$bsasApiBaseUrl/foreign-property/$randomCalcId/adjust"
      case "SubmitUkPropBsasAdjustmentUrlV3"    => s"$bsasApiBaseUrl/uk-property/$randomCalcId/adjust"
      case "RetrieveForeignPropBsasV3Url"       => s"$bsasApiBaseUrl/foreign-property/$randomCalcId"
      case "SubmitSEBsasAdjustmentUrlV3"        => s"$bsasApiBaseUrl/self-employment/$randomCalcId/adjust"

      // ░▒▓▓▓ Individual Losses API ▓▓▓▒░
      // Brought Forward Losses
      case "AmendBFLossesUrl"    => s"$lossesApiBaseUrl/brought-forward-losses/$randomLossId/change-loss-amount"
      case "CreateBFLossesUrl"   => s"$lossesApiBaseUrl/brought-forward-losses"
      case "DeleteBFLossesUrl"   => s"$lossesApiBaseUrl/brought-forward-losses/$randomLossId"
      case "ListAllBFLossesUrl"  => s"$lossesApiBaseUrl/brought-forward-losses"
      case "RetrieveBFLossesUrl" => s"$lossesApiBaseUrl/brought-forward-losses/$randomLossId"

      // Loss Claims
      case "AmendLossClaimUrl"      => s"$lossesApiBaseUrl/loss-claims/$randomClaimId/change-type-of-claim"
      case "AmendLossClaimOrderUrl" => s"$lossesApiBaseUrl/loss-claims/order"
      case "CreateLossClaimUrl"     => s"$lossesApiBaseUrl/loss-claims"
      case "DeleteLossClaimUrl"     => s"$lossesApiBaseUrl/loss-claims/$randomClaimId"
      case "ListLossClaimUrl"       => s"$lossesApiBaseUrl/loss-claims"
      case "RetrieveLossClaimUrl"   => s"$lossesApiBaseUrl/loss-claims/$randomClaimId"

      case "AmendLossClaimsOrderV3Url" => s"$lossesApiBaseUrl/loss-claims/order/2021-22"

      // ░▒▓▓▓ Individual Charges API ▓▓▓▒░
      case "PensionChargesUrl"                           => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2021-22"
      case "PensionChargesInvalidNinoUrl"                => s"$individualsChargesPensionsApiBaseUrl/JX06739!D/2021-22"
      case "PensionChargesInvalidTaxYearUrl"             => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2021-2022"
      case "PensionChargesInvalidTaxYearRangeUrl"        => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2020-22"
      case "PensionChargesInvalidTaxYearNotSupportedUrl" => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2019-20"
      case "PensionChargesInvalidMultipleErrorsUrl"      => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2018-20"

      // ░▒▓▓▓ Individual Calculations API ▓▓▓▒░

      // V2
      case "ListSaTaxCalculationsUrl"                 => s"$calcApiBaseUrl/self-assessment"
      case "RetrieveSaAllowancesDeductionsReliefsUrl" => s"$calcApiBaseUrl/self-assessment/$randomCalcId/allowances-deductions-reliefs"
      case "RetrieveSaEOYEstimateUrl"                 => s"$calcApiBaseUrl/self-assessment/$randomCalcId/end-of-year-estimate"
      case "RetrieveSaIncomeTaxNICsCalculatedUrl"     => s"$calcApiBaseUrl/self-assessment/$randomCalcId/income-tax-nics-calculated"
      case "RetrieveSaMetadataUrl"                    => s"$calcApiBaseUrl/self-assessment/$randomCalcId"
      case "RetrieveSaMessagesUrl"                    => s"$calcApiBaseUrl/self-assessment/$randomCalcId/messages"
      case "RetrieveSaTaxableIncomeUrl"               => s"$calcApiBaseUrl/self-assessment/$randomCalcId/taxable-income"
      case "TriggerSaTaxCalculationUrl"               => s"$calcApiBaseUrl/self-assessment"
      case "CalcIntentToCrystallise"                  => s"$calcApiCrystallisationBaseUrl/2019-20/intent-to-crystallise"
      case "CalcCrystallisation"                      => s"$calcApiCrystallisationBaseUrl/2019-20/crystallise"
      // V3
      case "v3TriggerCalcUrl"                        => s"$calcApiBaseUrl/self-assessment/2019-20"
      case "v3TriggerCalcFinalDeclarationUrl"        => s"$calcApiBaseUrl/self-assessment/2019-20?finalDeclaration=true"
      case "SubmitSAFinalDeclarationUrl"             => s"$calcApiBaseUrl/self-assessment/2020-21/$randomCalcId/final-declaration"
      case "RetrieveSelfAssessmentTaxCalculationUrl" => s"$calcApiBaseUrl/self-assessment/2020-21/$randomCalcId"

      // ░▒▓▓▓ Self Assessment API ▓▓▓▒░
      // Self Assessment Legacy
      // Self-Employments
      case "SeAddBusiness"                 => s"$saApiBaseUrl/self-employments"
      case "SeListBusinesses"              => s"$saApiBaseUrl/self-employments"
      case "SeGetBusiness"                 => s"$saApiBaseUrl/self-employments/$selfEmploymentId"
      case "SeObligations"                 => s"$saApiBaseUrl/self-employments/$selfEmploymentId/obligations"
      case "SePeriods"                     => s"$saApiBaseUrl/self-employments/$selfEmploymentId/periods"
      case "SePeriodOne"                   => s"$saApiBaseUrl/self-employments/$selfEmploymentId/periods/2017-04-06_2017-07-05"
      case "SeAnnualSummary"               => s"$saApiBaseUrl/self-employments/$selfEmploymentId/2017-18"
      case "SeRetrieveEopsObligations"     => s"$saApiBaseUrl/self-employments/$selfEmploymentId/end-of-period-statements/obligations"
      case "SeBusinessIncomeSourceSummary" => s"$saApiBaseUrl/self-employments/$randomSelfEmploymentId/2017-18/income-summary"

      // Self-Employments 2nd business
      case "SeGetBusiness2nd"             => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd"
      case "SeObligations2nd"             => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/obligations"
      case "SePeriods2nd"                 => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/periods"
      case "SePeriodOne2nd"               => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/periods/2017-04-06_2017-07-05"
      case "SeAnnualSummary2nd"           => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/2017-18"
      case "SeRetrieveEopsObligations2nd" => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/end-of-period-statements/obligations"

      // UK Property
      case "UkpAddBusiness"                 => s"$saApiBaseUrl/uk-properties"
      case "UkpGetBusiness"                 => s"$saApiBaseUrl/uk-properties"
      case "UkpObligations"                 => s"$saApiBaseUrl/uk-properties/obligations"
      case "UkpNonFhlPeriods"               => s"$saApiBaseUrl/uk-properties/other/periods"
      case "UkpNonFhlPeriodOne"             => s"$saApiBaseUrl/uk-properties/other/periods/2017-04-06_2017-07-05"
      case "UkpFhlPeriods"                  => s"$saApiBaseUrl/uk-properties/furnished-holiday-lettings/periods"
      case "UkpFhlPeriodOne"                => s"$saApiBaseUrl/uk-properties/furnished-holiday-lettings/periods/2017-04-06_2017-07-05"
      case "UkpNonFhlAnnualSummary"         => s"$saApiBaseUrl/uk-properties/other/2017-18"
      case "UkpFhlAnnualSummary"            => s"$saApiBaseUrl/uk-properties/furnished-holiday-lettings/2017-18"
      case "UkpBusinessIncomeSourceSummary" => s"$saApiBaseUrl/uk-properties/2017-18/income-summary"

      // Tax Calculations
      case "TriggerTaxCalc" => s"$saApiBaseUrl/calculations"

      // MTD Charitable Giving
      case "AmendCharitableGiving"    => s"$saApiBaseUrl/charitable-giving/2018-19"
      case "RetrieveCharitableGiving" => s"$saApiBaseUrl/charitable-giving/2018-19"

      // MTD Crystallisation
      case "Crystallisation"         => s"$saApiBaseUrl/2018-19/crystallisation"
      case "IntentToCrystallise"     => s"$saApiBaseUrl/2018-19/intent-to-crystallise"
      case "RetrieveCrystallisation" => s"$saApiBaseUrl/crystallisation/obligations?from=2018-04-06&to=2019-04-05"

      // MTD Dividends Income
      case "AmendDividends"    => s"$saApiBaseUrl/dividends/2017-18"
      case "RetrieveDividends" => s"$saApiBaseUrl/dividends/2017-18"

      // MTD Property API
      case "PropRetrieveEopsObligations" => s"$saApiBaseUrl/uk-properties/end-of-period-statements/obligations?from=2017-04-19&to=2018-04-19"
      case "PropSubmitEopsDeclaration"   => s"$saApiBaseUrl/uk-properties/end-of-period-statements/from/2017-04-06/to/2018-04-05"

      // MTD Savings Accounts
      case "AddSavingsAccount"                   => s"$saApiBaseUrl/savings-accounts"
      case "AmendSavingsAccountAnnualSummary"    => s"$saApiBaseUrl/savings-accounts/SAVbDlYvnLS0GtZ/2017-18"
      case "ListAllSavingsAccounts"              => s"$saApiBaseUrl/savings-accounts"
      case "RetrieveSavingsAccount"              => s"$saApiBaseUrl/savings-accounts/SAVbDlYvnLS0GtZ"
      case "RetrieveSavingsAccountAnnualSummary" => s"$saApiBaseUrl/savings-accounts/SAVbDlYvnLS0GtZ/2017-18"

      // MTD Self Employment
      case "SeSubmitEopsDeclaration" =>
        s"$saApiBaseUrl/self-employments/$randomSelfEmploymentId/end-of-period-statements/from/2017-04-06/to/2018-04-05"

      // MTD Tax Calculation
      case "RetrieveTaxCalculation"            => s"$saApiBaseUrl/calculations/$randomCalcId"
      case "RetrieveTaxCalculationBvrMessages" => s"$saApiBaseUrl/calculations/$randomCalcId/validation-messages"

      // Individuals Business EOPS
      case "BusinessEOPSUrl"            => s"$individualsBusinessEOPSSApiBaseUrl/${taxPayer.nino}"
      case "BusinessEOPInvalidNINOSUrl" => s"$individualsBusinessEOPSSApiBaseUrl/${taxPayer.nino}!"

      case _ => s"$saApiBaseUrl/didnt-find-url"

    }
  }

}
