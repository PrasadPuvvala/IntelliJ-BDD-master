Feature: Asset Dashboard Search Page

  @Case1
  Scenario: Verify user is at dashboard search page
    Given User navigates to dashboard search page
    Then Dashboard search page should be displayed
    When User enter the text is search box and click on search
    Then Search results should be displayed
