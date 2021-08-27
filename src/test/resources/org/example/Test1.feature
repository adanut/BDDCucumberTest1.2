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




  Scenario: Testing AddClient form with invalid data(Too few letter) to first name field
    Given i am on main page
    When when i click on Add customer
    Then i complete DG to firstName field
       | firstName | DG |



  Scenario: Testing AddClient form with invalid data to first name field
    Given i am on main page
    When when i click on Add customer
    Then i complete DG3 to firstName
      | firstName |DG3|


  Scenario: Testing AddClient form with invalid data(Too few letter) to last name field
    Given i am on main page
    When when i click on Add customer
    Then i complete D to lastName
      | lastName | D |



  Scenario: Testing AddClient form with invalid data to last name field
    Given i am on main page
    When when i click on Add customer
    Then i complete Laur3 to lastName
      | lastName |Laur3|


  Scenario: Testing AddClient form with invalid data(Too few letter) to street name field
    Given i am on main page
    When when i click on Add customer
    Then i complete U to streetName
      | streetName | U |



  Scenario: Testing AddClient form with invalid data to street name field
    Given i am on main page
    When when i click on Add customer
    Then i complete Lac3 to streetName
      | streetName |Lac3|

  Scenario: Testing AddClient form with invalid data to street number field
    Given i am on main page
    When when i click on Add customer
    Then i complete 12345678 to street number
      | streetNumber | 12345678 |

  Scenario: Testing AddClient form with invalid data(Too few letter) to city field
    Given i am on main page
    When when i click on Add customer
    Then i complete U to city
      | city | U |

  Scenario: Testing AddClient form with invalid data(Please insert only letters) to city field
    Given i am on main page
    When when i click on Add customer
    Then i complete Cluj1 to city
      | city | Cluj1 |

  Scenario: Testing AddClient form with invalid data(Too many letters) to city field
    Given i am on main page
    When when i click on Add customer
    Then i complete abcdefghijklmnoprstuvxzabc to city
      | city | abcdefghijklmnoprstuvxzabc |

  Scenario: Testing AddClient form with invalid data(Too few letter) to state field
    Given i am on main page
    When when i click on Add customer
    Then i complete R to state
      | state | R |

  Scenario: Testing AddClient form with invalid data(Please insert only letters) to state field
    Given i am on main page
    When when i click on Add customer
    Then i complete Romania1 to state
      | state | Romania1 |

  Scenario: Testing AddClient form with invalid data(Too many letters) to state field
    Given i am on main page
    When when i click on Add customer
    Then i complete Abcdefghijklmnoprstuvxzabc to state
      | state | Abcdefghijklmnoprstuvxzabc |

  Scenario: Testing AddClient form with invalid data(Too few letter) to phone number field
    Given i am on main page
    When when i click on Add customer
    Then i complete 076568906 to phone number
      | phoneNumber | 076568906 |

  Scenario: Testing AddClient form with invalid data(Please insert only numbers) to phone number field
    Given i am on main page
    When when i click on Add customer
    Then i complete 0764546767a to phone number
      | phoneNumber | 0764546767a|

  Scenario: Testing AddClient form with invalid data(Too many numbers) to phone number field
    Given i am on main page
    When when i click on Add customer
    Then i complete 079876543210123 to phone number
      | phoneNumber | 079876543210123 |

  Scenario: Testing AddClient form with invalid data(Too few letter) to ssn field
    Given i am on main page
    When when i click on Add customer
    Then i complete 07656890687 to ssn
      | ssn | 07656890687 |

  Scenario: Testing AddClient form with invalid data(Please insert only numbers) to ssn field
    Given i am on main page
    When when i click on Add customer
    Then i complete 0764546767a to ssn
      | ssn | 076454676756a|

  Scenario: Testing AddClient form with invalid data(Too many numbers) to ssn field
    Given i am on main page
    When when i click on Add customer
    Then i complete 079876543210123 to ssn
      | ssn | 079876543210123 |

  Scenario: Testing AddClient form with invalid data(Too few letter) to license plate field
    Given i am on main page
    When when i click on Add customer
    Then i complete BC5 to license plate
      | licensePlate  | BC5|

  Scenario: Testing AddClient form with invalid data(Invalid License-plate) to license plate field
    Given i am on main page
    When when i click on Add customer
    Then i complete BSFG to license plate
      | licensePlate  | BSFG|

  Scenario: Testing AddClient form with invalid data(Too many letters) to license plate field
    Given i am on main page
    When when i click on Add customer
    Then i complete B12345678901234 to license plate
      | licensePlate | B12345678901234 |


#  Scenario Outline: As a user i want to delete a customer
#    Given i am on main page
#    When i search for a client
#      | <first name> |
#    Then when i click Delete Button,The customer will be deleted
#    Examples:
#      | first name |
#      | Teodor     |


#Scenario: As a tester i want to verify if the dates from statistics are correctly
#  Given i am on main page
#  When i click on statistics and i verify the number of clients added
#  And when i click on Add customer
#  And i complete customer's
#    | first name             | Grigorescu     |
#    | last name              | Andrei         |
#    | street name            | Eminescu       |
#    | street number          | 455            |
#    | city                   | Timisoara      |
#    | state                  | Romania        |
#    | phone number           | 0345678987     |
#    | social security number | 46657676532234 |
#    | licence plate          | TM01GRI        |
#  And  i click on statistics and i verify the number of clients added
#  Then the number of added clients increase one unit



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
