#!/bin/bash

curl -X POST http://localhost:8242/individuals/self-assessment/assist/reports
#curl -X GET http://localhost:9772/setup/reset
cd ../..
DRIVER_ROUTE=-Dwebdriver.chrome.driver="/usr/local/bin/chromedriver"
sbt -Dbrowser=headless-chrome -Denv=local ${DRIVER_ROUTE} 'testOnly *runners.SaAssistApi.SmokeRunner'
