
# mtd-sa-api-acceptance-tests

### This repository is the acceptance test suite for:
- **business-details-api** 
- **cis-deductions-api**
- **individual-calculations-api**
- **individual-losses-api**
- **individuals-business-eops-api**
- **individuals-charges-api**
- **individuals-disclosures-api**
- **individuals-expenses-api**
- **individuals-income-received-api**
- **individuals-reliefs-api**
- **individuals-state-benefits-api**
- **obligations-api**
- **other-deductions-api**
- **property-business-api**
- **self-assessment-accounts-api**
- **self-assessment-api**
    - **mtd-charitable-giving**
    - **mtd-dividends-income**
    - **mtd-savings-accounts**
- **self-assessment-biss-api**
- **self-assessment-bsas-api**
- **self-employment-business-api**

It is built using:

* Cucumber > 6.10.4
* Java 8
* Scala 2.12.x
* sbt 1.5.x

### Support
This repository is supported by the Test Community for any information on how to use it, or if you'd like any help please come to #community-testing in Slack.

### Contributions
If you'd like to contribute, please raise a PR and notify us in #team-mtdapi - one of the core maintainers will take a look and merge the PR.

### Run Acceptance Tests
Prior to executing the tests, ensure you have the following prerequisites:

* chromedriver binary installed at /usr/local/bin to run tests locally against Chrome browser
* installed/configured [service manager](https://github.com/hmrc/service-manager).

**Note 1:** *You will need to ensure that you have a recent version of Chrome installed for the later versions of the drivers to work reliably.*

**Note 2:** *Ensure mongo is running.*

To test the services locally, use the following service manager profile to run the required services:
    
    sm --start MTDFB_ALL -f

Navigate to the appropriate directory:

    cd scripts/<service>

Then execute the `test_local.sh` shell script:

    ./test_local.sh

**Note 3:** *If you are testing changes to the services locally, then you may not need to start the services via service manager. Or, stop the services using sm --stop if necessary.*

### Run Smoke Tests
The smoke tests go through the API Platform.

Ensure the required services are running and then navigate to the appropriate directory:

    cd scripts/<service>

Then execute the shell scripts for your environment of choice:

    ./smoke_local.sh
    ./smoke_staging.sh
    ./smoke_externaltest.sh

### Generate tax payer access tokens for each environment

    ./generateTestUsers_local.sh
    ./generateTestUsers_development.sh
    ./generateTestUsers_qa.sh
    ./generateTestUsers_staging.sh
    ./generateTestUsers_externaltest.sh