package service;

import page.LoginPage;
import page.MainPage;

import static model.User.*;

public class LoginPageService {
    public static final String LOGIN_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/authentication?back=my-account";

    LoginPage loginPage = new LoginPage();

    public MainPage login(){
        loginPage.openPage(LOGIN_PAGE_URL)
                .enterEmail(EMAIL)
                .enterPassword(PASSWORD)
                .clicSignInButton();
        return new MainPage();
    }

    public MainPage loginn(){
        loginPage.openPage(LOGIN_PAGE_URL)
                .enterEmail(EMAIL_NOT_TRUE)
                .enterPassword(PASSWORD)
                .clicSignInButton();
        return new MainPage();
    }
}
