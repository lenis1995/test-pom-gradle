package com.demoblaze.pageobjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("https://www.demoqa.com/upload-download")
public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Home ']")
    WebElement homeButton;

    @FindBy(xpath = "//a[text()='Contact']")
    WebElement contactButton;

    @FindBy(xpath = "//a[text()='About us']")
    WebElement aboutUsButton;

    @FindBy(xpath = "//a[text()='Cart']")
    WebElement cartButton;

    @FindBy(xpath = "//a[text()='Log in']")
    WebElement logInButton;

    @FindBy(xpath = "//a[text()='Sign up']")
    WebElement signUpButton;

    @FindBy(xpath = "//a[text()='Log out']")
    WebElement logOutButton;

    @FindBy(xpath = "//a[contains(text(),'Welcome')]")
    public static WebElement welcomeMessage;

    public void goToHomePage() {
        driver.get(HOME_PAGE_URL);
    }

    public void openLoginForm() {
        click(logInButton);
    }

    public void waitUntilWelcomeMessageIsVisible() {
        waitVisibility(welcomeMessage);
    }

    public static String getWelcomeMessageText() {
       return readText(welcomeMessage);
    }
    private static final String HOME_PAGE_URL = "https://www.demoblaze.com/index.html";
}
