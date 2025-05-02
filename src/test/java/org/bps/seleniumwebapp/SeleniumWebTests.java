package org.bps.seleniumwebapp;

import io.qameta.allure.Description;
import org.bps.flow.SeleniumWebAppFlow;
import org.bps.testsetup.BaseTest;
import org.testng.annotations.Test;

public class SeleniumWebTests extends BaseTest {
    public SeleniumWebAppFlow seleniumWebAppUser;

    @Test
    @Description("Selenium login page with BY all")
    public void loginBySingleElement() throws Exception {
        seleniumWebAppUser = new SeleniumWebAppFlow();
        seleniumWebAppUser
                .launch_SeleniumWebApp()
                .navigateTo_LoginPage()
                .enterLoginAndPassword()
                .done();
    }
}
