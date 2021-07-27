Feature: Customer's page
  In this test we will test the page as a user and
  i want to add a customer, to edit a customer, to search for a customer

  Scenario: As a user i want to add a customer
    Given i am on home page
    When when i click on Add customer
    And i complete customer's first name
    And i complete customer's name
    And i complete customer's street
    And i complete customer's City
    And i complete customer's Phone Number
    And i complete customer's name CNP
    And i complete customer's car registration number
    And i click Save button
    Then The customer data will be save

