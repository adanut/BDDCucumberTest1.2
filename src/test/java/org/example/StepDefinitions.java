package org.example;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.shape.MoveTo;


import lombok.Getter;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

@Getter
public class StepDefinitions {

    WebDriver driver;

    //    @Before
//    public void setup(){
//
//            System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.capgemini.com/");
//
//    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Given("i am on main page")
    public void main_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://project-brown-kappa.vercel.app/home");
        Thread.sleep(1000);

    }

    @When("when i click on Add customer")
    public void clickIndustriesButton() {
        WebElement AddButton = driver.findElement(By.linkText("Add Client"));
        AddButton.click();
        // driver.findElement(By.id("macs_cookies_accept_all")).click();

    }

    @And("i complete customer's")
    public void i_complete_customer_s(Map<String, String> client) {
        WebElement procent = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "0%",procent.getText());
        WebElement firstName = driver.findElement(By.id("First-Name"));
        firstName.click();
        firstName.sendKeys(client.get("first name"));


        WebElement lastname = driver.findElement(By.id("Last-Name"));
        lastname.click();

        WebElement procentAfterFirstName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "11%",procentAfterFirstName.getText());
        lastname.sendKeys(client.get("last name"));

        WebElement streetName = driver.findElement(By.id("Street-Name"));
        streetName.click();
        WebElement procentAfterLastName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "22%",procentAfterLastName.getText());
        streetName.sendKeys(client.get("street name"));

        WebElement streetNumber = driver.findElement(By.id("Street-No"));
        streetNumber.click();
        WebElement procentAfterStreetName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "33%",procentAfterStreetName.getText());
        streetNumber.sendKeys(client.get("street number"));

        WebElement cityName = driver.findElement(By.id("city"));
        cityName.click();
        WebElement procentAfterStreetNumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "44%",procentAfterStreetNumber.getText());
        cityName.sendKeys(client.get("city"));

        WebElement state = driver.findElement(By.id("state"));
        state.click();
        WebElement procentAfterCity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "56%",procentAfterCity.getText());
        state.sendKeys(client.get("state"));

        WebElement phoneNumber = driver.findElement(By.id("Phone-Number"));
        phoneNumber.click();
        WebElement procentAfterState = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "67%",procentAfterState.getText());
        phoneNumber.sendKeys(client.get("phone number"));

        WebElement socialSecurityNumber = driver.findElement(By.id("Social Security Number"));
        socialSecurityNumber.click();
        WebElement procentAfterPhoneNumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "78%",procentAfterPhoneNumber.getText());
        socialSecurityNumber.sendKeys(client.get("social security number"));

        WebElement carLicencePlate = driver.findElement(By.id("Licence-plate"));
        carLicencePlate.click();
        WebElement procentAfterSSN = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "89%",procentAfterSSN.getText());
        carLicencePlate.sendKeys(client.get("licence plate"));
    }


    @Then("i click Submit button, the customer data will be saved")
    public void clickSubmitButton() throws InterruptedException {
        WebElement nextToButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form"));
        nextToButton.click();
        WebElement procentAfterLicesePlate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/p"));
        Assert.assertEquals( "100%",procentAfterLicesePlate.getText());
        Thread.sleep(1000);

        WebElement submitButton = driver.findElement(By.cssSelector(".form-input-btn"));
        submitButton.click();
    }


    @When("i search for a specific client")
    public void searchForaClient() {
        WebElement searchButton = driver.findElement(By.linkText("Search Client"));
        searchButton.click();
        WebElement searchBar = driver.findElement(By.cssSelector(".search-bar"));
        searchBar.click();
        searchBar.sendKeys("Grigorescu");
    }

    @And("i click Edit")
    public void clickEditButton() {
        WebElement editButton = driver.findElement(By.cssSelector("div:nth-child(1) > .container .utilityButton:nth-child(8)"));
        //xpath = //*[@id="root"]/div/div[2]/div/div[2]/ul/div[1]/div/div[1]/button[2]
        editButton.click();
    }


    @And("i will edit customer's fields")
    public void i_edit_customer_s(Map<String, String> client) throws InterruptedException {

        WebElement firstName = driver.findElement(By.id("First-Name"));
        firstName.click();
        firstName.clear();
        firstName.sendKeys(client.get("first name"));

        WebElement lastname = driver.findElement(By.id("Last-Name"));
        lastname.click();
        lastname.clear();
        lastname.sendKeys(client.get("last name"));

        WebElement streetName = driver.findElement(By.id("Street-Name"));
        streetName.click();
        streetName.clear();
        streetName.sendKeys(client.get("street name"));
        Thread.sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(700,500)");

        WebElement streetNumber = driver.findElement(By.id("Street-No"));
        streetNumber.click();
        streetNumber.clear();
        streetNumber.sendKeys(client.get("street number"));

        WebElement cityName = driver.findElement(By.id("city"));
        cityName.click();
        cityName.clear();
        cityName.sendKeys(client.get("city"));

        WebElement state = driver.findElement(By.id("state"));
        state.click();
        state.clear();
        state.sendKeys(client.get("state"));

        WebElement phoneNumber = driver.findElement(By.id("Phone-Number"));
        phoneNumber.click();
        phoneNumber.clear();
        phoneNumber.sendKeys(client.get("phone number"));

        WebElement socialSecurityNumber = driver.findElement(By.id("Social Security Number"));
        socialSecurityNumber.click();
        socialSecurityNumber.clear();
        socialSecurityNumber.sendKeys(client.get("social security number"));

        WebElement carLicencePlate = driver.findElement(By.id("Licence-plate"));
        carLicencePlate.click();
        carLicencePlate.clear();
        carLicencePlate.sendKeys(client.get("licence plate"));
    }

    @When("i search for a client")
    public void searchForClient(Map<String, String> clientSearched) {

        WebElement searchButton = driver.findElement(By.linkText("Search Client"));
        searchButton.click();
        WebElement searchBar = driver.findElement(By.cssSelector(".search-bar"));
        searchBar.click();
        searchBar.sendKeys(clientSearched.get("first name"));

    }

    @Then("i click Save Changes button,the new customer data will be saved")
    public void clickSubmitButtonFromEdit() {
        WebElement submitButton = driver.findElement(By.cssSelector(".form-input-btn"));
        submitButton.click();
    }

    @Then("when i click Delete Button,The customer will be deleted")
    public void clickDeleteButtonFromEdit() {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/ul/div/div/div/button[1]"));
        submitButton.click();
    }

}





        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();

//        System.out.println(client.get("name"));
//        System.out.println(client.get("first name"));




//
//
//    @And("i complete customer's first name")
//    public void firstNameComplete() {
//        WebElement firstName = driver.findElement(By.id("First-Name"));
//        firstName.click();
//        firstName.sendKeys("Teodorovici");
//    }
//
//    @And("i complete customer's name")
//    public void nameComplete() {
//        WebElement lastname = driver.findElement(By.id("Last-Name"));
//        lastname.click();
//        lastname.sendKeys("Cristinel");
//    }
//
//    @And("i complete customer's street")
//    public void streetComplete() {
//        WebElement streetName = driver.findElement(By.id("Street-Name"));
//        streetName.click();
//        streetName.sendKeys("plaiului");
//    }
//
//    @And("i complete customer's street number")
//    public void streetNumberComplete() {
//        WebElement streetNumber = driver.findElement(By.id("Street-No"));
//        streetNumber.click();
//        streetNumber.sendKeys("54");
//    }
//
//    @And("i complete customer's City")
//    public void cityComplete() {
//        WebElement cityName = driver.findElement(By.id("city"));
//        cityName.click();
//        cityName.sendKeys("Bacau");
//    }
//
//    @And("i complete customer's State")
//    public void stateComplete() {
//        WebElement state = driver.findElement(By.id("state"));
//        state.click();
//        state.sendKeys("Romania");
//    }
//
//    @And("i complete customer's Phone Number")
//    public void phoneNumberComplete() {
//        WebElement phoneNumber = driver.findElement(By.id("Phone-Number"));
//        phoneNumber.click();
//        phoneNumber.sendKeys("0769543654");
//    }
//
//    @And("i complete customer's name SSN") //SSN -Social Security Number
//    public void ssnComplete() {
//        WebElement socialSecurityNumber = driver.findElement(By.id("Social Security Number"));
//        socialSecurityNumber.click();
//        socialSecurityNumber.sendKeys("1560324241156");
//
//    }
//
//    @And("i complete customer's car licence plate")
//    public void carLicencePlateComplete() {
//        WebElement carLicencePlate = driver.findElement(By.id("Licence-plate"));
//        carLicencePlate.click();
//        carLicencePlate.sendKeys("BC03TZV");
//    }


//    public void firstNameEdit() {
//        WebElement firstName = driver.findElement(By.id("First-Name"));
//        firstName.click();
//        firstName.clear();
//        firstName.sendKeys("Teodor");
//    }
//
//    @And("i will edit customer's name")
//    public void nameEdit() {
//        WebElement name = driver.findElement(By.id("Last-Name"));
//        name.click();
//        name.clear();
//        name.sendKeys("Cristi");
//    }
//
//    @And("i will edit customer's street")
//    public void streetEdit() throws InterruptedException {
//        WebElement streetName = driver.findElement(By.id("Street-Name"));
//        streetName.click();
//        streetName.clear();
//        streetName.sendKeys("Plaiului");
//        Thread.sleep(1000);
//    }
//
//    @And("i will edit customer's street number")
//    public void streetNumberEdit() throws InterruptedException {
//        Thread.sleep(2000);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(700,500)");
//        WebElement streetNumber = driver.findElement(By.id("Street-No"));
//
//        streetNumber.click();
//        streetNumber.clear();
//        streetNumber.sendKeys("5");
//    }
//
//    @And("i will edit customer's City")
//    public void cityEdit() {
//        WebElement cityName = driver.findElement(By.id("city"));
//        cityName.click();
//        cityName.clear();
//        cityName.sendKeys("Onesti");
//    }
//
//    @And("i will edit customer's State")
//    public void stateEdit() {
//        WebElement state = driver.findElement(By.id("state"));
//        state.click();
//        state.clear();
//        state.sendKeys("Ro");
//    }
//
//    @And("i will edit customer's Phone Number")
//    public void phoneNumberEdit() {
//        WebElement phoneNumber = driver.findElement(By.id("Phone-Number"));
//        phoneNumber.click();
//        phoneNumber.clear();
//        phoneNumber.sendKeys("0769543654");
//    }
//
//    @And("i will edit customer's name SSN") //SSN -Social Security Number
//    public void ssnEdit() {
//        WebElement socialSecurityNumber = driver.findElement(By.id("Social Security Number"));
//        socialSecurityNumber.click();
//        socialSecurityNumber.clear();
//        socialSecurityNumber.sendKeys("1560324241156");
//
//    }
//
//    @And("i will edit customer's car registration number")
//    public void carLicencePlateEdit() {
//        WebElement carLicencePlate = driver.findElement(By.id("Licence-plate"));
//        carLicencePlate.click();
//        carLicencePlate.clear();
//        carLicencePlate.sendKeys("BC03TZZ");
//    }