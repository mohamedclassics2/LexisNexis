@regression @wip
Feature: [1] Check all elements are visible

  Scenario Outline: [1.1] Industry check on Choose Your Industry dropdown
    Given user is on home page
    When user clicks "<tab name>"
    Then "<industry>" is present
    And "<industry>" is clickable
    Examples:
      | tab name             | industry                     |
      | Choose Your Industry | Financial Services           |
      | Choose Your Industry | Insurance                    |
      | Choose Your Industry | Life and Pensions            |
      | Choose Your Industry | Corporations and Non-Profits |

  Scenario Outline: [1.2] Option check under Your Industry
    Given user is on home page
    When user clicks "<tab name>"
    And user selects an "<industry>"
    Then "<option>" is present
    And "<option>" is clickable
    Examples:
      | tab name             | industry           | option                           |
      | Choose Your Industry | Financial Services | Financial Crime Compliance       |
      | Choose Your Industry | Financial Services | Customer Data Management         |
      | Choose Your Industry | Financial Services | Collections and Recovery         |
      | Choose Your Industry | Financial Services | Risk Orchestration               |
      | Choose Your Industry | Financial Services | Fraud and Identity Management    |
      | Choose Your Industry | Financial Services | Credit Risk Assessment           |
      | Choose Your Industry | Financial Services | Investigations and Due Diligence |