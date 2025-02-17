package org.bps.testsetup;

import org.bps.utils.TakeScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test Failed: " + result.getName());
        new TakeScreenshot().capture(result.getName());
    }
}
