package org.bps.testsetup;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test Failed: " + result.getName());
        TakeScreenshot screen = new TakeScreenshot();
        screen.capture(result.getName());
        screen.captureForHtml(result.getName());
    }
}
