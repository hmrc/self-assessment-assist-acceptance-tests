/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.endpoints

import uk.gov.hmrc.integration.cucumber.models.SelfAssessmentBsasApi.V3.retrieveForeignPropBsas.RetrieveForeignPropBsasResponseV3
import uk.gov.hmrc.integration.cucumber.utils.ModelStructure
import ModelStructure._

object ResponseModelStructures {

  def responseModelStructureFor(responseName: String): ModelStructure = {
    responseName match {
      case "RetrieveForeignPropBsasResponseV3" => structureOf[RetrieveForeignPropBsasResponseV3]
    }
  }

}
