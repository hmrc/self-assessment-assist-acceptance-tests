#!/bin/bash

sbt -Denv=staging -Dbrowser=headless-chrome 'testOnly uk.gov.hmrc.integration.cucumber.utils.runners.GenerateTestUsers'