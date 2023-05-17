package com.envision.actitime.stepdefination;

import com.envision.actitime.utility.BrowserFactory;
import com.envision.actitime.utility.PropertyFileReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeGroups;

public class Hooks {

    WebDriver driver;

    @Before
    public void user_opens_chrome_browser() {
        String browsername = PropertyFileReader.getProperty("actitime.browsername");
        String rmmode = PropertyFileReader.getProperty("actitime.runmode");

        this.driver = BrowserFactory.getBrowser(browsername, rmmode);

        String url = PropertyFileReader.getProperty("actitime.url");
        BrowserFactory.launchApplication(url);
    }

    @After
    public void closeBrowser() {
        BrowserFactory.closeCurrentWindow();
    }

    @AfterAll
    public static void before_or_after_all() {
        BrowserFactory.closeAllWindow();

    }


}
