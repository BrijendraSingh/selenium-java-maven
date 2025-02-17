package org.bps.pom;

import org.bps.browserSetup.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodoAppPage {
    public WebDriver driver;
    public By todoAppHeader = By.cssSelector("container h2");

    public TodoAppPage() throws Exception {
        driver = BrowserFactory.driver();
    }

    public void launchTodoApp(){
        driver.get("https://lambdatest.github.io/sample-todo-app/");
    }
    public String getHeaderText(){
        System.out.println("Title " + driver.getTitle());
        WebElement header = driver.findElement(By.cssSelector("container h2"));
        return header.getText();
    }
}
