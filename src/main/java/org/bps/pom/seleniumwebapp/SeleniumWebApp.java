package org.bps.pom.seleniumwebapp;

import org.bps.browserSetup.BrowserFactory;
import org.bps.utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class SeleniumWebApp extends Wait {
    public WebDriver driver;

    public SeleniumWebApp() throws Exception {
        driver = BrowserFactory.driver();
    }

    public void launchSeleniumWebApp(){
        driver.get("https://www.selenium.dev/selenium/web/");
    }
}
