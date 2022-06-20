package com.demoblaze.stepDefinitions;

import com.demoblaze.pageobjects.components.LoginForm;
import com.demoblaze.pageobjects.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.PageGenerator;

import static com.demoblaze.pageobjects.pages.HomePage.getWelcomeMessageText;

public class LoginStepDefinitions {

    protected WebDriver driver = Hook.getDriver();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() throws Exception {
        PageGenerator.getInstance(HomePage.class, driver).goToHomePage();
    }
    @When("the user navigates to the login form")
    public void the_user_navigates_to_the_login_form() throws Exception {
        PageGenerator.getInstance(HomePage.class, driver).openLoginForm();
        PageGenerator.getInstance(LoginForm.class, driver).waitUntilLoginModalIsDisplayed();
    }
    @And("the user enters valid credentials")
    public void the_user_enters_valid_credentials() throws Exception {
        PageGenerator.getInstance(LoginForm.class, driver).setUsername("bartolo");
        PageGenerator.getInstance(LoginForm.class, driver).setPassword("123456");
        PageGenerator.getInstance(LoginForm.class, driver).clickOnSubmitLoginForm();
    }
    @Then("the user should be successfully logged in")
    public void the_user_should_be_successfully_logged_in() throws Exception {
        PageGenerator.getInstance(HomePage.class, driver).waitUntilWelcomeMessageIsVisible();
        Assert.assertEquals("ERROR: THE WELCOME MESSAGE IS NOT THE EXPECTED!", "Welcome bartolo", getWelcomeMessageText());
    }
}
