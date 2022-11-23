#!/usr/bin/env bash

BROWSER=${1:-chrome}
JOURNEY=${2:-SaAssistTests}

DRIVER=

if [ "$BROWSER" = "chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

RUNNER="TestRunnerNEW"

echo "Running browser tests..."
echo "=========================================="
echo "Browser:              ${BROWSER}"
echo "Env:                  local"
echo "Journey:              ${JOURNEY}"
echo "=========================================="
sbt -Dbrowser=${BROWSER} -Denvironment=local "testOnly runner.${RUNNER}"