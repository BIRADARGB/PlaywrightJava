package Pages;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage{
    Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    private final String LoginButton = "a[id='login_Layer']";
    private final String txt_email = "//label[contains(text(),\"Email ID / Username\")]//following::input[1]";
    private final String txt_password = "//label[contains(text(),\"Password\")]//following::input[1]";
    private final String ButtonToLogin = "//button[text()='Login']";

    public void clickOnLoginButton() {
        page.click(LoginButton);
        page.fill(txt_email,"basana@gmail.com");
        page.fill(txt_password,"pass2010");
        page.click(ButtonToLogin);
        //page.pause();
    }

}
