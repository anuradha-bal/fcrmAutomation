package com.fcrm.qa.stepdefs;

import com.fcrm.qa.base.Library;
import com.fcrm.qa.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends Library
{
    private LoginPage login;

    private LoginPage getPage()
    {
        if (login == null) {
            login = new LoginPage(getDriver());
        }

        return login;
    }

    @Given("^user is on free crm login page$")
    public void setup()
    {
        launchApplication();
    }

    @When("^user enters email \"([^\"]*)\"$")
    public void enterEmail(String email)
    {
        getPage().enterEmail(email);
    }

    @And("^user enters password \"([^\"]*)\"$")
    public void enterPassword(String password)
    {
        getPage().enterPassword(password);
    }

    @When("^user clicks on login button$")
    public void login()
    {
        getPage().clickLogin();
    }

    @Then("^user is on free crm home page$")
    public void loggedOn()
    {
        getSeleniumUtility().takeScreenshot("home_page.jpg");
    }

    @Then("^close the browser$")
    public void tearDown()
    {
        quit();
    }
}
