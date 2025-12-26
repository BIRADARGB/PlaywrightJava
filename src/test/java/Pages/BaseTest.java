package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {
    Playwright playwright = Playwright.create();
    public Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    private Page page = browser.newPage();
    NaukriLoginPage loginpage;

    public void loginToNaukri(){
        page.navigate("https://www.naukri.com");
        String pageTitle = page.title();
        System.out.println("page title is: "+pageTitle);
    }

    public NaukriLoginPage getLoginPageObject(){
        if(loginpage==null){
            loginpage = new NaukriLoginPage(page);
        }
        return  loginpage;
    }
}
