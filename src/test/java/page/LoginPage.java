package page;

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

    public LoginPage openPage(String url){
        log.info("Opening login page");
        driver.get(url);
        return this;
    }
    public LoginPage enterEmail(String emailAddres){
        log.info("Enter email addres");
        email.clear();
        email.sendKeys(emailAddres);
        return this;
    }
    public LoginPage enterPassword(String passwords){
        log.info("Enter email addres");
        password.clear();
        password.sendKeys(passwords);
        return this;
    }
    public void clicSignInButton(){
        log.info("Clic on the login button");
        loginButton.click();
    }



}
