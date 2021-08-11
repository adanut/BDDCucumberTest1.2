package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/resources/org/example/Test1.feature"}
        ,plugin = {"pretty", "json:target/raport.json",
        "html:target/cucumber-report.html"}/*name ="As a user i want to add a customer vers 2"*/)
public class RunCucumberTest {




}
