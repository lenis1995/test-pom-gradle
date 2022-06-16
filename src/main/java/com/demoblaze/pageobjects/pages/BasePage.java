package com.demoblaze.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.time.Duration.ofSeconds;

public class BasePage {

    public BasePage(WebDriver driver){
            this.driver = driver;
            wait = new WebDriverWait(driver, ofSeconds(15));
    }

    public void click(WebElement element) {
        element.click();
    }

    public void writeText(WebElement element, String word) {
        element.sendKeys(word);
    }

    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    protected WebDriver driver;
    protected WebDriverWait wait;
}
