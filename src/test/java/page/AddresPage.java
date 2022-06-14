package page;

import details.FillFields;
import details.Сhoose;
import driver.DriverSingleTon;
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

    public AddresPage firstNameInput(Addres addres) {
        log.info("Enter a first name");
        new FillFields("firstname").writeText(addres.getFirstName());
        return this;
    }
    public AddresPage lastNameInput(Addres addres) {
        log.info("Enter a last name");
        new FillFields("lastname").writeText(addres.getLastName());
        return this;
    }

    public AddresPage companyInput(Addres addres) {
        log.info("Enter a company");
        new FillFields("company").writeText(addres.getCompany());
        return this;
    }

    public AddresPage addressInput(Addres addres) {
        log.info("Enter a address");
        new FillFields("address1").writeText(addres.getAddress());
        return this;
    }

    public AddresPage zipInput(Addres addres) {
        log.info("Enter a zip");
        new FillFields("postcode").writeText(addres.getZip());
        return this;
    }

    public AddresPage cityInput(Addres addres) {
        log.info("Enter a city");
        new FillFields("city").writeText(addres.getCity());
        return this;
    }

    public AddresPage homePhoneInput(Addres addres) {
        log.info("Enter a home phone");
        new FillFields("phone").writeText(addres.getHomePhone());
        return this;
    }

    public AddresPage countryInput(Addres addres) {
        log.info("Enter a country");
        new Сhoose("uniform-id_country").selectValue(addres.getCountry());
        return this;
    }

    public AddresPage stateInput(Addres addres) {
        log.info("Enter a state");
        new Сhoose("uniform-id_state").selectValue(addres.getState());
        return this;
    }

    public AddresPage addressTitleInput(Addres address) {
        log.info("Entering a title of address");
        new FillFields("alias").writeText(address.getAddressTitle());
        return this;
    }


    public void clickSaveButton() {
        log.info("Clicking on the save button");
        submitAddressButon.click();
    }

    public void clickDeletButton() {
        log.info("Clicking on the delet button");
        addressDeletButton.click();
    }
    public AddresPage openPage(String url) {
        log.info("Open address page by URL");
        driver.get(url);
        return this;
    }


    public String getTextOfAddres(){
        log.info("Get message of addres page");
        wait.until(ExpectedConditions.visibilityOf(messageOfAddress));
        return messageOfAddress.getText();
    }
    public void clickDeleteAddressButton() {
        log.info("Clicking on the delete address button");
        addressDeletButton.click();
    }
    public String getText() {
        log.info("Getting text from the button");
        return accessibleAddressButton.getText();
    }

    public String getTexts() {
        log.info("Getting text from the address creation error checks");
        return errorMesageCreateAddres.getText();
    }


}
