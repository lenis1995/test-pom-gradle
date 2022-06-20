package com.demoblaze.pageobjects.components;

import com.demoblaze.pageobjects.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends BasePage {

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#logInModal .modal-dialog")
    WebElement loginModal;

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement password;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement submitButton;

    @FindBy(xpath = "//button[text()='Log in']/preceding-sibling::button")
    WebElement closeLoginModalButton;

    public void waitUntilLoginModalIsDisplayed() {
        waitVisibility(loginModal);
    }

    public void setUsername(String username) {
        writeText(this.username, username);
    }

    public void setPassword(String password) {
        writeText(this.password, password);
    }

    public void clickOnSubmitLoginForm() {
        click(submitButton);
    }

    public void clickOnCloseModalButton() {
        click(closeLoginModalButton);
    }

    public void
}
