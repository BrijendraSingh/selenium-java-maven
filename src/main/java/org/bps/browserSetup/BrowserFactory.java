package org.bps.browserSetup;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

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
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver();
                return driver;
            case "FIREFOX" : driver =  new FirefoxDriver(); return driver;
            case "SAFARI" : driver=  new SafariDriver(); return driver;
            case "EDGE" : driver=  new EdgeDriver(); return driver;
            default: return null;
        }
    }
}
