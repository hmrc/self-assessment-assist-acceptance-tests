#!/bin/bash

cd ../../..
DRIVER_ROUTE=-Dwebdriver.chrome.driver="/usr/local/bin/chromedriver"
sbt -Dbrowser=headless-chrome -Denv=externaltest ${DRIVER_ROUTE} 'testOnly *runners.SelfAssessmentApi.MtdSelfEmployment.SmokeRunner'