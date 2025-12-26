package UiTestScripts;

import Pages.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateNaukriLoginPage extends BaseTest {

    @BeforeMethod
    public void init(){
        System.out.println("in before method\n");
    }

    @Test
    public void launchNaukriapp(){
        loginToNaukri();
        getLoginPageObject().clickOnLoginButton();
    }

    @AfterMethod
    public void wrapUp(){
        System.out.println("in after method\n");
        browser.close();
    }

}
