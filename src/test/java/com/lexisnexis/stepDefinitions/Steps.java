package com.lexisnexis.stepDefinitions;

import com.lexisnexis.pages.HomePage;
import com.lexisnexis.utilities.BrowserUtils;
import com.lexisnexis.utilities.ConfigurationReader;
import com.lexisnexis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Steps {
    HomePage homePage = new HomePage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(2);

        By acceptAllCookiesButtonLocator = By.id("onetrust-accept-btn-handler");

        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(acceptAllCookiesButtonLocator)).click();
        } catch (Exception e) {
            System.err.println("Cookie consent banner did not appear within the given time frame or was not clickable.");
        }
    }

    @Then("{string} is present")
    public void is_present(String elementName) throws Throwable {
        BrowserUtils.waitFor(2);

        try {
            WebElement element = homePage.getElementByName(elementName);
            assertTrue("Element '" + elementName + "' is not displayed.", element.isDisplayed());
        } catch (NoSuchElementException e) {
            fail("Element '" + elementName + "' is not found.");
        }
    }

    @Then("{string} is clickable")
    public void is_clickable(String elementName) throws Throwable {
        BrowserUtils.waitFor(2);

        try {
            WebElement element = homePage.getElementByName(elementName);
            assertTrue("Element '" + elementName + "' is clickable.", element.isEnabled());
        } catch (NoSuchElementException e) {
            fail("Element '" + elementName + "' is not found.");
        }
    }

    @When("user clicks {string}")
    public void user_clicks(String tabName) {
        WebElement element = homePage.getElementByName(tabName);
        element.click();
    }

    @When("user selects an {string}")
    public void user_selects_an(String industry) {
        BrowserUtils.waitFor(2);

        try {
            WebElement element = homePage.getElementByName(industry);
            element.click();
        } catch (NoSuchElementException e) {
            fail("Element '" + industry + "' is not found.");
        }
    }
}
