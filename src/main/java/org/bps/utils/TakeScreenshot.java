package org.bps.utils;

import org.bps.browserSetup.BrowserFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenshot {
    public WebDriver driver;

    public TakeScreenshot(){
        driver = BrowserFactory.driver;
    }

    public void capture(String testName){
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try{
            FileHandler.copy(screenshot, new File("src/test/resources/screenshots/" + testName + new Date().getTime() + ".png" ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
