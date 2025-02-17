package org.bps.testsetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public void driverSetup(){
        driver = new SafariDriver();
    }

    @AfterMethod
    public void afterTestSetup(final ITestResult result){
        final byte[] bytes = new byte[]{};
        final String qualifiedName = result.getMethod().getQualifiedName();
        System.out.println("Test Name is " + qualifiedName);
    }

    @AfterClass
    public void driverCleanUp(){
        driver.close();
    }
}
