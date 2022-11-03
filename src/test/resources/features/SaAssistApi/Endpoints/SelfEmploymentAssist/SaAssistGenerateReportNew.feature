@api-tests
Feature: E2E Journey of RAS (Happy path) API version 1

  Background:
    Given I login through the Auth login page and generate a token
      | enrolmentKey | identifierName |
      | HMRC-PSA-ORG | PSAID          |

