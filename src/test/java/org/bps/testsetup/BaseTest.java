package org.bps.testsetup;

import org.bps.browserSetup.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

@Listeners(CustomTestListener.class)
public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void driverSetup(String browser){
        driver=BrowserFactory.initiateDriver(browser);
    }

    @AfterMethod
    public void afterTestSetup(final ITestResult result){
        System.out.println("Test Name is " + result.getMethod().getQualifiedName());
        driver.close();
    }

    @AfterClass
    public void driverCleanUp(){
//        driver.close();
    }
}
