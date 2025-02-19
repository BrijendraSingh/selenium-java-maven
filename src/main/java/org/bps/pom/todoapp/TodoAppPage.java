package org.bps.pom.todoapp;

import org.bps.browserSetup.BrowserFactory;
import org.bps.utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TodoAppPage extends Wait{
    public WebDriver driver;

    public By todoAppHeader = By.cssSelector(".container h2");
    public By listHeading = By.cssSelector("div.container div > span");
    public By list3rdItem = RelativeLocator.with(By.cssSelector("input")).below(listHeading);

    public TodoAppPage() throws Exception {
        driver = BrowserFactory.driver();
    }

    public void launchTodoApp(){
        driver.get("https://lambdatest.github.io/sample-todo-app/");
    }
    public String getHeaderText(){
        System.out.println("Title " + driver.getTitle());
        WebElement header = driver.findElement(todoAppHeader);
        return header.getText();
    }

    public void clickOnAllItems() {
        WebElement listParentEle = driver.findElement(listHeading);
        WebElement firstItem= driver.findElement(RelativeLocator.with(By.cssSelector("li input")).below(listParentEle));
        WebElement secondItem= driver.findElement(RelativeLocator.with(By.cssSelector("input")).below(firstItem));
        firstItem.click();
        secondItem.click();
        waitForSeconds(5);
        driver.findElement(list3rdItem).click();
        waitForSeconds(2);
    }
}
