/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.integration.cucumber.models.domain

case class Nino(nino: String) {
  require(Nino.isValid(nino), s"$nino is not a valid nino.")

  private val LengthWithoutSuffix: Int = 8
  def value: String                    = nino
  val name                             = "nino"
  def formatted: String                = value.grouped(2).mkString(" ")
  def withoutSuffix: String            = value.take(LengthWithoutSuffix)
}

object Nino extends (String => Nino) {
  private val validNinoFormat = "[[A-Z]&&[^DFIQUV]][[A-Z]&&[^DFIQUVO]] ?\\d{2} ?\\d{2} ?\\d{2} ?[A-D]{1}"
  private val invalidPrefixes = List("BG", "GB", "NK", "KN", "TN", "NT", "ZZ")

  private def hasValidPrefix(nino: String) = !invalidPrefixes.exists(nino.startsWith)

  def isValid(nino: String): Boolean = nino != null && hasValidPrefix(nino) && nino.matches(validNinoFormat)

  private[domain] val validFirstCharacters  = ('A' to 'Z').filterNot(List('D', 'F', 'I', 'Q', 'U', 'V').contains).map(_.toString)
  private[domain] val validSecondCharacters = ('A' to 'Z').filterNot(List('D', 'F', 'I', 'O', 'Q', 'U', 'V').contains).map(_.toString)
  val validPrefixes: Seq[String] = validFirstCharacters.flatMap(a => validSecondCharacters.map(a + _)).filterNot(invalidPrefixes.contains(_))
  val validSuffixes: Seq[String] = ('A' to 'D').map(_.toString)
}
