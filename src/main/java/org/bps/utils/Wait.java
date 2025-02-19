package org.bps.utils;

import org.bps.browserSetup.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    public WebDriver driver;
    public Wait() throws Exception {
        driver = BrowserFactory.driver();
    }
    public  void waitForMinutes(int minutes){
        try {
            Thread.sleep(Duration.ofMinutes(minutes));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  void waitForSeconds(int seconds){
        try {
            Thread.sleep(Duration.ofSeconds(seconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void click(By by, int duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void waitTillElementIsClickable(By by, int duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
