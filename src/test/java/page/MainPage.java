package page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class MainPage extends BasePage {

    @FindBy(xpath = "//p[@class='info-account']")
    private WebElement titlMainPage;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']//*[contains(text(), 'There is 1 error')]")
    private WebElement invalidMesseg;

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenСatalog;


    @FindBy(xpath = "//input[@id='search_query_top']")
    private WebElement searchBox;


    @Step("Get message of main page")
    public String getTextOfMainPageMessage() {
        log.info("Get message of main page");
        return titlMainPage.getText();
    }

    @Step("Get invalud text of main page")
    public String getInvaludTextOfPageMessage() {
        log.info("Get invalud text of main page");
        return invalidMesseg.getText();
    }

    @Step("Enter request")
    public MainPage searchBox(String request) {
        log.info("Enter request");
        searchBox.clear();
        searchBox.sendKeys(request);
        return this;
    }

    @Step("Submit an inquiry")
    public void submitAnInquiry(){
        log.info("Submit an inquiry");
        submitButton.click();
    }

    @Step("Clicking on the women assortment button")
    public void clickOnWomenProducktsPageButton(){
        log.info("Clicking on the women assortment button");
        womenСatalog.click();
    }

}
