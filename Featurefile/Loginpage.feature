Feature: Loginpage

  Scenario: Loginpage showing or not
    Given user launching to the browser
    When user opens the URL "https://rahulshettyacademy.com/locatorspractice/#"
    And check the login page showing or not
    Then close the browser

  Scenario: login
    Given user launching to the browser
    When user opens the URL "https://rahulshettyacademy.com/locatorspractice/#"
    And Enter username "louis123"
    Then  Enter Password "rahulshettyacademy"
    Then click login
    And check logged in or not
    Then close the browser