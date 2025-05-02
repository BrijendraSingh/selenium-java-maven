package org.bps.testsetup;

import org.bps.browserSetup.BrowserFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

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
        String filePath = "src/test/resources/screenshots/" + testName + "_"+new Date().getTime() + ".png";
        try{
            FileHandler.copy(screenshot, new File(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void captureForHtml(String testName){
        String src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        String path = "<img src=\"data:image/png;base64, " + src + "\" width=\"300\" height=\"350\" />";
        Reporter.log(path);
    }
}
