#!/bin/bash

sbt -Denv=development -Dbrowser=headless-chrome 'testOnly uk.gov.hmrc.integration.cucumber.utils.runners.GenerateTestUsers'