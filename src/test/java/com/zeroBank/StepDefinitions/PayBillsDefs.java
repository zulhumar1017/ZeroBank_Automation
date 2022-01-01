package com.zeroBank.StepDefinitions;

import com.zeroBank.pages.PayBillsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class PayBillsDefs {

    PayBillsPage payBillsPage =new PayBillsPage();

    @And("the user selects Pay Bills Module")
    public void theUserSelectsPayBillsModule() {
      // PayBillsPage payBillsPage =new PayBillsPage(); 为了不要重复每次都建立同样的Object 可以把它放到最前面---（9）
        payBillsPage.payBillsTab.click();


    }

    @And("the user selects {string} from the Payee Dropdown")
    public void theUserSelectsFromThePayeeDropdown(String expectedPayeeOption) {
       // PayBillsPage payBillsPage =new PayBillsPage();
        Select stateDropDown =new Select(payBillsPage.payeeDropDown);

        stateDropDown.selectByVisibleText(expectedPayeeOption);
    }

    @And("user selects {string} from the Account Dropdown")
    public void userSelectsFromTheAccountDropdown(String expectedAccountOption) {

        Select stateDropDown =new Select(payBillsPage.accountDropDown);
        stateDropDown.selectByVisibleText(expectedAccountOption);
    }


    @And("the user enters the amount {string}")
    public void theUserEntersTheAmount(String expectedAmount) {
        payBillsPage.amountBox.sendKeys(expectedAmount);


    }

    @And("the user enters the date {string}")
    public void theUserEntersTheDate(String expectedDate) {
        payBillsPage.dateBox.sendKeys(expectedDate);
    }

    @When("the user clicks on the pay button")
    public void theUserClicksOnThePayButton() {
        payBillsPage.payButton.click();
    }

    @Then("verify that the system display {string} message")
    public void verifyThatTheSystemDisplayMessage(String expectedMessage) {
        String actualMessage = payBillsPage.message.getText();// 重要！！ option +Enter ile commend verdim，
        // 是先写的右边 ，再按短按键 就形成了这个 ！！！！！！！！！
        Assert.assertEquals(expectedMessage,actualMessage);

        System.out.println("123");
    }


    @Then("verify that the system not display {string} message")
    public void verifyThatTheSystemNotDisplayMessage(String expectedMessage) {
        Assert.assertFalse(payBillsPage.message.isDisplayed());
        System.out.println("Nur");
    }
}
