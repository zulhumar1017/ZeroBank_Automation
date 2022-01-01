package com.zeroBank.pages;

import com.zeroBank.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage {

    public AccountSummaryPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#account_summary_tab")
    public  WebElement accountSummaryTab;

    @FindBy(css = ".board-header")
    public List<WebElement> accountSummaryTitles;

    @FindBy(xpath = "(//table[@class=\"table\"])[3]//tr/th")
    public List<WebElement> creditAccountsTitles;

    @FindBy(xpath = "//a[.=\"Savings\"]")
    public  WebElement savingsLink;

    @FindBy(xpath = "//a[.=\"Brokerage\"]")
    public WebElement brokerageLink;

    @FindBy(css = ".table>tbody>tr>td>a")
    public List<WebElement> accontSummaryLinks;




}
