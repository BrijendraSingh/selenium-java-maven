package org.bps.browserSetup;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver driver() throws Exception {
        if (driver != null){
            return driver;
        } else{
            System.out.println("Driver is not instantiated, kindly initiate a driver with required browser type and try again");
            throw new Exception("Driver is not instantiated, kindly initiate a driver with required browser type and try again");
        }
    }

    public static WebDriver initiateDriver(String browser){
        switch (browser){
            case "CHROME" :
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless");
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver(options);
                return driver;
            case "FIREFOX" : driver =  new FirefoxDriver(); return driver;
            case "SAFARI" :
                SafariOptions safariOptions = new SafariOptions();
                safariOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver=  new SafariDriver(safariOptions); return driver;

            case "EDGE" : driver=  new EdgeDriver(); return driver;
            default: return null;
        }
    }
}
