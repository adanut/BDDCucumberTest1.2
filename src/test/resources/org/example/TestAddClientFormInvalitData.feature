Feature: Testing AddClient form with invalid data
  Scenario Outline:
    @Given i am on main page
    @When when i click on Add customer
    @And i complete '<firstName>'
    Examples:
      | firstName |
      | Dg        |
      | DAN34      |
