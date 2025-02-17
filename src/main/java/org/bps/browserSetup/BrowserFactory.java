package org.bps.browserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
            case "CHROME" : return new ChromeDriver();
            case "FIREFOX" : return new FirefoxDriver();
            case "SAFARI" : return  new SafariDriver();
            case "EDGE" : return  new EdgeDriver();
            default: return null;
        }
    }
}
