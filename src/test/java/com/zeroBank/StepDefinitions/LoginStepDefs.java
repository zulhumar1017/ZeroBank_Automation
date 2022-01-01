package com.zeroBank.StepDefinitions;

import com.zeroBank.Utilities.BrowserUtils;
import com.zeroBank.Utilities.ConfigurationReader;
import com.zeroBank.Utilities.Driver;
import com.zeroBank.pages.AccountSummaryPage;
import com.zeroBank.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage= new AccountSummaryPage();


    @Given("the user navigate to url")
    public void theUserNavigateToUrl() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.signinButton.click();

    }

    @When("the user enter the username")
    public void theUserEnterTheUsername() {
        loginPage.userNameBox.sendKeys(ConfigurationReader.get("username"));
    }

    @And("the user enter the password")
    public void theUserEnterThePassword() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));
    }

    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        loginPage.loginButton.click();


        try {
            loginPage.advanced.click();
            loginPage.advanced2.click();
        } catch (Exception e){

        }

        BrowserUtils.waitFor(3);
    }



    @Then("verify the user login successfully")
    public void verifyTheUserLoginSuccessfully() {
        Assert.assertTrue(accountSummaryPage.accountSummaryTab.isDisplayed());
    }





    @When("the user enter the username {string}")
    public void theUserEnterTheUsername(String username) {
        loginPage.userNameBox.sendKeys(username);
    }

    @And("the user enter the password {string}")
    public void theUserEnterThePassword(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @Then("verify the user can not login")
    public void verifyTheUserCanNotLogin() {
        Assert.assertEquals("Login and/or password are wrong.",loginPage.errorMessage.getText());
    }

    @Given("the user logged in")
    public void theUserLoggedIn() {
        loginPage.loggin();
    }
}
