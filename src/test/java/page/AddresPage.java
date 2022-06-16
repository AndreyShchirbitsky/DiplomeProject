package page;

import details.Choose;
import details.FillFields;
import driver.DriverSingleTon;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.Addres;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Log4j2
public class AddresPage extends BasePage{

    @FindBy(xpath = "//p[@class='info-title']")
    private WebElement errorMesageCreateAddres;

    @FindBy(xpath = "//p//strong[@class='dark']")
    private WebElement messageOfAddress;

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement addressDeletButton;

    @FindBy(xpath = "//button[@id='submitAddress']")
    private  WebElement submitAddressButon;

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement deleteAddressButton;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElement accessibleAddressButton;

    WebDriverWait wait = new WebDriverWait(DriverSingleTon.getDriver(), 15);

    @Step("Enter a first name")
    public AddresPage firstNameInput(Addres addres) {
        log.info("Enter a first name");
        new FillFields("firstname").writeText(addres.getFirstName());
        return this;
    }

    @Step("Enter a last name")
    public AddresPage lastNameInput(Addres addres) {
        log.info("Enter a last name");
        new FillFields("lastname").writeText(addres.getLastName());
        return this;
    }

    @Step("Enter a company")
    public AddresPage companyInput(Addres addres) {
        log.info("Enter a company");
        new FillFields("company").writeText(addres.getCompany());
        return this;
    }

    @Step("Enter a address")
    public AddresPage addressInput(Addres addres) {
        log.info("Enter a address");
        new FillFields("address1").writeText(addres.getAddress());
        return this;
    }

    @Step("Enter a zip")
    public AddresPage zipInput(Addres addres) {
        log.info("Enter a zip");
        new FillFields("postcode").writeText(addres.getZip());
        return this;
    }

    @Step("Enter a city")
    public AddresPage cityInput(Addres addres) {
        log.info("Enter a city");
        new FillFields("city").writeText(addres.getCity());
        return this;
    }

    @Step("Enter a home phone")
    public AddresPage homePhoneInput(Addres addres) {
        log.info("Enter a home phone");
        new FillFields("phone").writeText(addres.getHomePhone());
        return this;
    }

    @Step("Enter a country")
    public AddresPage countryInput(Addres addres) {
        log.info("Enter a country");
        new Choose("uniform-id_country").selectValue(addres.getCountry());
        return this;
    }

    @Step("Enter a state")
    public AddresPage stateInput(Addres addres) {
        log.info("Enter a state");
        new Choose("uniform-id_state").selectValue(addres.getState());
        return this;
    }

    @Step("Entering a title of address")
    public AddresPage addressTitleInput(Addres address) {
        log.info("Entering a title of address");
        new FillFields("alias").writeText(address.getAddressTitle());
        return this;
    }

    @Step("Clicking on the save button")
    public void clickSaveButton() {
        log.info("Clicking on the save button");
        submitAddressButon.click();
    }

    @Step("Open address page by URL")
    public AddresPage openPage(String url) {
        log.info("Open address page by URL");
        driver.get(url);
        return this;
    }

    @Step("Get message of address page")
    public String getTextOfAddres(){
        log.info("Get message of address page");
        wait.until(ExpectedConditions.visibilityOf(messageOfAddress));
        return messageOfAddress.getText();
    }

    @Step("Clicking on the delete address button")
    public void clickDeleteAddressButton() {
        log.info("Clicking on the delete address button");
        addressDeletButton.click();
    }

    @Step("Getting text from the button")
    public String getText() {
        log.info("Getting text from the button");
        return accessibleAddressButton.getText();
    }

    @Step("Getting text from the address creation error checks")
    public String getTexts() {
        log.info("Getting text from the address creation error checks");
        return errorMesageCreateAddres.getText();
    }


}
