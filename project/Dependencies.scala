import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "com.typesafe"         %  "config"            % "1.4.2",
    "uk.gov.hmrc"          %% "webdriver-factory" % "0.38.0",
    "com.typesafe.play"    %% "play-json"         % "2.9.2",
    "org.scalatest"        %% "scalatest"         % "3.2.11",
    "io.cucumber"          %% "cucumber-scala"    % "8.2.2",
    "io.cucumber"          %  "cucumber-junit"    % "7.2.3",
    "com.github.sbt"       %  "junit-interface"   % "0.13.3",
    "org.scalaj"           %% "scalaj-http"       % "2.4.2",
    "org.typelevel"        %% "cats-core"         % "2.7.0",
    "com.chuusai"          %% "shapeless"         % "2.4.0-M1",
    "org.apache.commons"   % "commons-lang3"      % "3.12.0",
    "com.google.code.gson" % "gson"               % "2.9.0"
  ).map(_ % Test)
}