#!/bin/bash

sbt -Denv=local -Dbrowser=headless-chrome 'testOnly uk.gov.hmrc.integration.cucumber.utils.runners.GenerateTestUsers'