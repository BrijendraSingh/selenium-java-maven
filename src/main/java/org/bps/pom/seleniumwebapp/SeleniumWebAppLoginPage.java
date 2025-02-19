package org.bps.pom.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumWebAppLoginPage extends  SeleniumWebApp{


    public By loginPageLink = By.linkText("login.html");
    public By loginEle = new ByAll(By.cssSelector("input#username-field"), By.cssSelector("input#password-field"));
    public By submitBtn = By.cssSelector("input[type='submit']");

    public SeleniumWebAppLoginPage() throws Exception {
        super();
    }

    public void navigateToLoginPage(){
        click(loginPageLink,5);
    }

    public void enterLoginDetails(){
        waitTillElementIsClickable(submitBtn,5);
        List<WebElement> loginInputs = driver.findElements(loginEle);
        loginInputs.get(0).sendKeys("username");
        loginInputs.get(1).sendKeys("password");
//        click(submitBtn,1);
    }
}
