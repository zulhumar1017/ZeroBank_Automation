package com.zeroBank.pages;

import com.zeroBank.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {


    public PayBillsPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#pay_bills_tab>a")
    public WebElement payBillsTab;

    @FindBy(css = "#sp_payee")
    public WebElement payeeDropDown;

    @FindBy(css = "#sp_account")
    public  WebElement accountDropDown ;

    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    public  WebElement amountBox;

    @FindBy(xpath = "//*[@name=\"date\"]")
    public WebElement dateBox;

    @FindBy(css = "#pay_saved_payees")
    public WebElement payButton;

    @FindBy(css = "#alert_content>span")
    public WebElement message;












}

