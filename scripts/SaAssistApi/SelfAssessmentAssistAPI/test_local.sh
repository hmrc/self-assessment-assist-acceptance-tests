#!/bin/bash

curl -X POST http://localhost:8242/individuals/self-assessment/assist/reports
cd ../../..
DRIVER_ROUTE=-Dwebdriver.chrome.driver="/usr/local/bin/chromedriver"
sbt -Dbrowser=headless-chrome -Denv=local ${DRIVER_ROUTE} 'testOnly *runners.SaAssistApi.SelfAssessmentAssistAPI.TestRunner'