/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.IndividualsReliefsApi.RetrieveReliefInvestments

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.integration.cucumber.models.hateoas.HateoasLink

case class RetrieveReliefInvestments(submittedOn: String,
                                     vctSubscription: Option[Seq[VctSubscriptions]],
                                     eisSubscription: Option[Seq[EisSubscriptions]],
                                     communityInvestment: Option[Seq[CommunityInvestment]],
                                     seedEnterpriseInvestment: Option[Seq[SeedEnterpriseInvestment]],
                                     socialEnterpriseInvestment: Option[Seq[SocialEnterpriseInvestment]],
                                     links: Seq[HateoasLink])

object RetrieveReliefInvestments {
  implicit val format: OFormat[RetrieveReliefInvestments] = Json.format[RetrieveReliefInvestments]
}
