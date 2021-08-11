Feature: Customer's page
  In this tests we will verify the page as a user and
  i want to add a customer, to edit a customer and to delete a specific customer


  Scenario: As a user i want to add a customer vers 2
    Given i am on main page
    When when i click on Add customer
    And i complete customer's
      | first name             | Grigorescu     |
      | last name              | Andrei         |
      | street name            | Eminescu       |
      | street number          | 455            |
      | city                   | Timisoara      |
      | state                  | Romania        |
      | phone number           | 0345678987     |
      | social security number | 46657676532234 |
      | licence plate          | TM01GRI        |

    Then i click Submit button, the customer data will be saved


  Scenario: As a user i want to edit all fields of an existing customer
    Given i am on main page
    When i search for a specific client
    And i click Edit
    And i will edit customer's fields
      | first name             | Teodor   |
      | last name              | Andreea         |
      | street name            | Creanga       |
      | street number          | 5            |
      | city                   | Arad      |
      | state                  | Romania        |
      | phone number           | 0745678987     |
      | social security number | 56657676532234 |
      | licence plate          | TM01TEO        |


    Then i click Save Changes button,the new customer data will be saved

  Scenario: As a user i want to delete a customer
    Given i am on main page
    When i search for a client
      | first name             | Teodor    |
    Then when i click Delete Button,The customer will be deleted




#  Scenario: As a user i want to add a customer
#    Given i am on main page
#    When when i click on Add customer
#    And i complete customer's first name
#    And i complete customer's name
#    And i complete customer's street
#    And i complete customer's street number
#    And i complete customer's City
#    And i complete customer's State
#    And i complete customer's Phone Number
#    And i complete customer's name SSN
#    And i complete customer's car licence plate
#    Then i click Submit button, the customer data will be saved


#  Scenario: As a user i want to edit all fields of an existing customer
#    Given i am on main page
#    When i search for a specific client
#    And i click Edit
#    And i will edit customer's first name
#    And i will edit customer's name
#    And i will edit customer's street
#    And i will edit customer's street number
#    And i will edit customer's City
#    And i will edit customer's State
#    And i will edit customer's Phone Number
#    And i will edit customer's name SSN
#    And i will edit customer's car registration number
#    Then i click Save Changes button,the new customer data will be saved
