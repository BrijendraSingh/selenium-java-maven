package org.bps;

import org.bps.testsetup.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    @Test
    public void todoAppTest(){
        driver.get("https://lambdatest.github.io/sample-todo-app/");
        WebElement header = driver.findElement(By.cssSelector(".container h2"));
        Assert.assertEquals(header.getText(),"LambdaTest Sample App");
    }

    @Test
    public void failTest(){
        driver.get("https://lambdatest.github.io/sample-todo-app/");
        WebElement header = driver.findElement(By.cssSelector(".ng-binding"));
        Assert.assertEquals(header.getText(),"LambdaTest Sample App");
    }
}
