package Pages;

import com.microsoft.playwright.Page;

public class NaukriLoginPage {
    Page page;

    public NaukriLoginPage(Page page) {
        this.page = page;
    }

    private final String LoginButton = "a[id='login_Layer']";

    public void clickOnLoginButton() {
        page.click(LoginButton);
        page.pause();
    }

}
