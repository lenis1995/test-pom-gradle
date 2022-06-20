package utils;

import com.demoblaze.pageobjects.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {

    public static  <TPage extends BasePage> TPage getInstance (Class<TPage> pageClass , WebDriver driver ) throws Exception {
        try {
            return PageFactory.initElements(driver, pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}

