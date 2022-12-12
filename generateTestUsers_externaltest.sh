#!/bin/bash

sbt -Denv=externaltest -Dbrowser=headless-chrome 'testOnly uk.gov.hmrc.integration.cucumber.utils.runners.GenerateTestUsers'