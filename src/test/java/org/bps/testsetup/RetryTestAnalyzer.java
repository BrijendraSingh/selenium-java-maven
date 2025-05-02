package org.bps.testsetup;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestAnalyzer implements IRetryAnalyzer {
    private int retryCount=0;
    private static final int MX_RETRY_ATTEMPT=3;
    @Override
    public boolean retry(ITestResult testResult) {
        if (retryCount< MX_RETRY_ATTEMPT){
            retryCount ++;
            System.out.println("Retrying test: " + testResult.getName() + ", for the " + retryCount + " time(s).");
            return true;
        }
        return false;
    }
}
