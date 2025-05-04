package org.bps.pom.seleniumwebapp;

import org.bps.browserSetup.BrowserFactory;
import org.bps.utils.ElementOperations;
import org.openqa.selenium.WebDriver;

public class SeleniumWebApp extends ElementOperations {
    public WebDriver driver;

    public SeleniumWebApp() throws Exception {
        driver = BrowserFactory.driver();
    }

    public void launchSeleniumWebApp(){
        driver.get("https://www.selenium.dev/selenium/web/");
    }
}
