package com.zeroBank.pages;

import com.zeroBank.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsActivityPage {


    public AccountsActivityPage() {PageFactory.initElements(Driver.get(), this);
    }



    @FindBy(xpath = "//select[@id=\"aa_accountId\"]")
    public WebElement accountDropdown;


    @FindBy(xpath = "//a[.=\"Account Activity\"]")
    public WebElement accountActivityTag;





}
