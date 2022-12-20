resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)

addSbtPlugin("uk.gov.hmrc"      % "sbt-auto-build" % "3.8.0")
addSbtPlugin("com.timushev.sbt" % "sbt-updates"    % "0.6.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
