package org.bps.testsetup;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.aventstack.chaintest.service.ChainPluginService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ChainTestListener.class)
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
        ChainPluginService.getInstance().embed(qualifiedName,bytes,"image/png");
    }

    @AfterClass
    public void driverCleanUp(){
        driver.close();
    }
}
