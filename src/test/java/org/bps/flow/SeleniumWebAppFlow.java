package org.bps.flow;

import org.bps.pom.seleniumwebapp.SeleniumWebAppLoginPage;
import org.bps.testassertions.Assertions;

public class SeleniumWebAppFlow extends Assertions {
    public SeleniumWebAppLoginPage seleniumWebAppLoginPage;

    public SeleniumWebAppFlow() throws Exception {
        seleniumWebAppLoginPage = new SeleniumWebAppLoginPage();
    }

//    @Step("launch selenium app")
    public SeleniumWebAppFlow launch_SeleniumWebApp(){
        seleniumWebAppLoginPage.launchSeleniumWebApp();
        return this;
    }

    public SeleniumWebAppFlow navigateTo_LoginPage(){
        seleniumWebAppLoginPage.navigateToLoginPage();
        return this;
    }

    public SeleniumWebAppFlow enterLoginAndPassword(){
        seleniumWebAppLoginPage.enterLoginDetails();
        return this;
    }

    public void done(){}
}
