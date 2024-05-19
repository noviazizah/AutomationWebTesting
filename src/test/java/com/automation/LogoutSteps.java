package com.automation;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
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

    @Given("I am logged in to the application")
    public void i_am_logged_in_to_the_application() {
        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");

        // Enter username and password
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @When("I click on the menu button")
    public void i_click_the_menu_button() {
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
    }

    @When("I click on the logout button")
    public void i_click_the_logout_button() {
        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
    }

    @Then("I should be redirected to the login page")
    public void i_should_be_redirected_to_the_login_page() {
        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
}
