#Author: your.email@your.domain.com

@End2End
Feature: The User is able to register - Demo QA

  @TxtBx
  Scenario: User is able to enter values in TextBox
    Given user is on registration page
    When user is able to enter text box
    Then Validation of entered text
  @RadioBtn
   Scenario: User is able to select Radio-button
    Given user is on registration page
    When user is able to select Radio-button
    Then Validation of selected radio-button
    
    @ChkBx
   Scenario: User is able to select and unselect checkbox
    Given user is on registration page
    When user is able to select and deselect checkbox
    Then Validation of checkbox when selected and deselected
    
    @DrpDwn
   Scenario: User is able to select values in dropdown
    Given user is on registration page
    When user is able select dropdown values
    Then Validation of selected value in dropdown 
    
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
