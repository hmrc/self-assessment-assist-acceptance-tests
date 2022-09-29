#!/bin/bash

cd ../..
DRIVER_ROUTE=-Dwebdriver.chrome.driver="/usr/local/bin/chromedriver"
sbt -Dbrowser=headless-chrome -Denv=development ${DRIVER_ROUTE} 'testOnly *runners.IndividualLossesApi.SmokeRunner'