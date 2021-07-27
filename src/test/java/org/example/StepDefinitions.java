package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

    @Given("i am on home page")
        public void home_page(){ }
    @When("when i click on Add customer")
    public void clickAddCustomerButton(){}
    @And("i complete customer's first name")
    public void firstNameComplete(){}
    @And("i complete customer's name")
    public void nameComplete(){}
    @And("i complete customer's street")
    public void streetComplete(){}
    @And("i complete customer's City")
    public void cityComplete(){}
    @And("i complete customer's Phone Number")
    public void phoneNumberComplete(){}
    @And("i complete customer's name CNP")
    public void cnpComplete(){}
    @And("i complete customer's car registration number")
    public void carRegistrationNumberComplete(){}
    @And("i click Save button")
    public void clickSaveButton(){}
    @Then("The customer data will be save")
    public void theDatacustomerIsSaved(){}





}
