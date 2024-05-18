package com.automation;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set path to chromedriver
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\novia\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ys250\\msedgedriver.exe");
        // Initialize ChromeDriver
        // driver = new ChromeDriver();
        driver = new EdgeDriver();
    }

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_sauce_demo_login_page() {
        // Navigate to the URL
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("I should be redirected to the products page")
    public void i_should_be_redirected_to_the_products_page() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String expectedErrorMessage) {
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        assertTrue(errorMessage.isDisplayed());
        assertEquals(expectedErrorMessage, errorMessage.getText());
    }
}
