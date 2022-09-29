#!/bin/bash

cd ../..
DRIVER_ROUTE=-Dwebdriver.chrome.driver="/usr/local/bin/chromedriver"
sbt -Dbrowser=headless-chrome -Denv=staging ${DRIVER_ROUTE} 'testOnly *runners.ObligationsApi.SmokeRunner'
