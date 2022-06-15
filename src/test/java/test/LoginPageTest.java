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
        Assert.assertEquals(actualTextMainPage, EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE, "the actual text does not match expected");
    }

    @Test(description = "Login with incorrect user info")
    public void loginInvalidTest(){
        MainPage mainPage = loginPageService.loginn();
        String actualTextMainPage = mainPage.getInvaludTextOfPageMessage();
        Assert.assertEquals(actualTextMainPage, INVALID_TEXT_MESSEG,"Login failed");
    }

}
