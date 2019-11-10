package com.mmt.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentTest;
import com.mmt.base.TestBase;

public class SearchResultPage extends TestBase {

	@FindBy(xpath = "//span[@class=\"button-continue-text\"]")
    public WebElement searchResultPageText;
	
	public void verifySearchResultPage(ExtentTest test) throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(searchResultPageText));
		String expectedString = searchResultPageText.getText();
		if(expectedString.equalsIgnoreCase("continue")) {
			assertSuccess("Search Result Successfull",test);
		}else {
			assertFailure("Search Result not found",test);
		}
	}
	
}
