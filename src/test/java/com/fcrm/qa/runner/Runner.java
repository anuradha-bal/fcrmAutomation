package com.fcrm.qa.runner;

import com.cucumber.listener.Reporter;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Test-Data/FeatureFiles/login.feature", plugin =
{
 "pretty",
 "html:src/test/resources/Test-Output/Reports/Cucumber-Reports",
 "com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Test-Output/Reports/Extent-Reports/Extentreport.html"
}, glue =
{
 "com.fcrm.qa.stepdefs"
}, monochrome = true, dryRun = false)
public class Runner
{
    @AfterClass
    public static void extendReport()
    {
        Reporter.loadXMLConfig("src/test/resources/Configuration/extentConfig.xml");
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
