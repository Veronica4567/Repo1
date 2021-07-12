
Feature: Feature to test login functionality

  Scenario: Validate Volunteer Sign up is working
    Given browser is open
    When User is on Volunteer Sign up page
    And User enters text fields
    And User selects radio button & checkbox
    And User selects option from drop down
    And User uploads file
   	Then User clicks on submit button
			