package service;

import page.LoginPage;
import page.MainPage;

import static util.Constant.*;

public class LoginPageService {

    LoginPage loginPage = new LoginPage();

    public MainPage login(){
        loginPage.openPage(LOGIN_PAGE_URL)
                .enterEmail(EMAIL)
                .enterPassword(PASSWORD)
                .clicSignInButton();
        return new MainPage();
    }
}
