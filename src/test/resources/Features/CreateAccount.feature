#Author: Jayesh Makdey
@FirstTest
Feature: Creating a new Account
  I want to Create a new Account and login it

  @SignupPage
  Scenario: Testing signup feature
    Given Go to url "http://tutorialsninja.com/demo/index.php?route=common/home"
    And Verify logo is present in webpage
    And Verify Title
    When Click on MyAccount and Register
    And Get Register Account Text
    Then Verify Register Account Text is present or not