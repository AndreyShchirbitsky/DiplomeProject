package page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class LoginPage extends BasePage{


    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;


    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement loginButton;


    @Step("Opening login page")
    public LoginPage openPage(String url){
        log.info("Opening login page");
        driver.get(url);
        return this;
    }

    @Step("Enter email address")
    public LoginPage enterEmail(String emailAddress){
        log.info("Enter email address");
        email.clear();
        email.sendKeys(emailAddress);
        return this;
    }

    @Step("Enter password address")
    public LoginPage enterPassword(String passwords){
        log.info("Enter password address");
        password.clear();
        password.sendKeys(passwords);
        return this;
    }

    @Step("Click on the login button")
    public void clicSignInButton(){
        log.info("Click on the login button");
        loginButton.click();
    }



}
