package com.zeroBank.StepDefinitions;

import com.zeroBank.Utilities.Driver;
import com.zeroBank.pages.AccountSummaryPage;
import com.zeroBank.pages.AccountsActivityPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccontActivityDefs {

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_savings_link_on_the_account_summary_page() {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.savingsLink.click();
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String expectedPage) {

        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(expectedPage.substring(9)));
        // farkli yontemle , inspect edip verif yaparsam eger
        // Assert .assertTrue (WebElement.isdisplay("lacate ettigim varsayimi ");
    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedDefaultElement) {
        AccountsActivityPage accountsActivityPage=new AccountsActivityPage();
        Select dropDown =new Select(accountsActivityPage.accountDropdown);
        String actualDefaultElement = dropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDefaultElement,actualDefaultElement);

    }


    @When("the user clicks on Brokerage link on the Account Summary page")
    public void theUserClicksOnBrokerageLinkOnTheAccountSummaryPage() {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.brokerageLink.click();

    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void theUserClicksOnLinkOnTheAccountSummaryPage(String expectedLink) {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        List<WebElement> accontSummaryLinks = accountSummaryPage.accontSummaryLinks;
        for (WebElement each : accontSummaryLinks) {
            if (each.getText().equals(expectedLink)) {
                each.click();
                break;
            }
        }
    }
}
