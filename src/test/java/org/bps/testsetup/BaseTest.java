package org.bps.testsetup;

import org.bps.browserSetup.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void driverSetup(String browser){
        driver=BrowserFactory.initiateDriver(browser);
    }

    @AfterMethod
    public void afterTestSetup(final ITestResult result){
        System.out.println("Test Name is " + result.getMethod().getQualifiedName());
    }

    @AfterClass
    public void driverCleanUp(){
        driver.close();
    }
}
