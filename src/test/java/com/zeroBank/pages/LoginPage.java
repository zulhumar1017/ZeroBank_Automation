package com.zeroBank.pages;

import com.zeroBank.Utilities.ConfigurationReader;
import com.zeroBank.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(css = "#signin_button")
    public WebElement signinButton;

    @FindBy(xpath = "//input[@id=\"user_login\"]")
    public WebElement userNameBox;

    @FindBy(xpath = "(//input[@autocomplete=\"off\"])[2]")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@name=\"submit\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@id=\"details-button\"]")
    public WebElement advanced;

    @FindBy (css = "#proceed-link")
    public WebElement advanced2;

    @FindBy(css = ".alert.alert-error")
    public WebElement errorMessage;


    public  void loggin (){
        Driver.get().get(ConfigurationReader.get("url"));
        signinButton.click();

        userNameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
        advanced.click();
        advanced2.click();

    }






}
