package com.zeroBank.StepDefinitions;

import com.zeroBank.Utilities.BrowserUtils;
import com.zeroBank.pages.AccountSummaryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccontSummaryDefs {


    @Then("verify that the user sees the following titles")
    public void verifyThatTheUserSeesTheFollowingTitles(List<String> expectedTitles) {

        AccountSummaryPage accountSummaryPage= new AccountSummaryPage();
        List<String> actualTitles = BrowserUtils.getElementsText(accountSummaryPage.accountSummaryTitles);

        Assert.assertEquals(expectedTitles,actualTitles);


    }

    @Then("verify that the user sees the following columns")
    public void verifyThatTheUserSeesTheFollowingColumns(List<String> expectedColumns) {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        List<String> actualColumns =BrowserUtils.getElementsText(accountSummaryPage.creditAccountsTitles);

        Assert.assertEquals(expectedColumns,actualColumns);

    }
}


