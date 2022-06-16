package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.MainPage;
import service.LoginPageService;
import static util.Constant.*;

public class LoginPageTest extends BaseTest{

LoginPageService loginPageService;
    @BeforeClass
    public void setUp() {
        loginPageService  = new LoginPageService();
    }

    @Test(description = "Login with correct user info")
    public void loginTest(){
        MainPage mainPage = loginPageService.login();
        String actualTextMainPage = mainPage.getTextOfMainPageMessage();
        String expectedTextOfNameOfMyAccountPage = "Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertEquals(actualTextMainPage, expectedTextOfNameOfMyAccountPage, "the actual text does not match expected");
    }

    @Test(description = "Login with incorrect user info")
    public void loginInvalidTest(){
        MainPage mainPage = loginPageService.loginn();
        String actualTextMainPage = mainPage.getInvaludTextOfPageMessage();
        Assert.assertEquals(actualTextMainPage, INVALID_TEXT_MESSEG,"Login failed");
    }

}
