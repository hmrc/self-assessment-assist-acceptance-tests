/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.utils

object Zap {
  val enabled: Boolean = sys.props.get("zap.proxy").isDefined
}
