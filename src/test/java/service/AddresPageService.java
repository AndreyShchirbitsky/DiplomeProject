package service;

import driver.DriverSingleTon;
import model.Addres;
import org.openqa.selenium.Alert;
import page.AddresPage;
import page.BasePage;
import static util.Constant.*;

public class AddresPageService extends BasePage {

    AddresPage addresPage = new AddresPage();
    LoginPageService loginPageService = new LoginPageService();


    public void createAddress() {
        loginPageService.login();
        Addres addres = new Addres(FIRST_NAME, LAST_NAME, COMPANY, ADDRESS, ZIP, CITY, HOME_PHONE, COUNTRY, STATE,ADDRES_TITLE_MESSEG);
        addresPage.openPage(ADDRESS_PAGE_URL)
                .firstNameInput(addres)
                .lastNameInput(addres)
                .companyInput(addres)
                .addressInput(addres)
                .zipInput(addres)
                .cityInput(addres)
                .homePhoneInput(addres)
                .countryInput(addres)
                .stateInput(addres)
                .addressTitleInput(addres)
                .clickSaveButton();

    }
    public String getTitleOfAddressPage() {
        return addresPage.getTextOfAddres();
    }

    Alert alert;
    public void deleteAddress() {
        loginPageService.login();
        addresPage.openPage(ADDRESSES_PAGE_URL)
                .clickDeleteAddressButton();
        alert = DriverSingleTon.getDriver().switchTo().alert();
        alert.accept();

    }
    public String getTextOfPageAfterDeleteAddress() {
        return addresPage.getText();
    }

    public void createErrorAddress() {
        loginPageService.login();
        Addres addres = new Addres(FIRST_NAME, LAST_NAME, COMPANY, ADDRESS, ZIP, CITY, HOME_PHONE, COUNTRY, STATE,ADDRES_TITLE_MESSEG);
        addresPage.openPage(ADDRESS_PAGE_URL)
                .firstNameInput(addres)
                .lastNameInput(addres)
                .companyInput(addres)
                .addressInput(addres)
                .zipInput(addres)
                .cityInput(addres)
                .homePhoneInput(addres)
                .countryInput(addres)
                .stateInput(addres)
                .clickSaveButton();

    }
    public String getTextOfErrorAddress() {
        return addresPage.getTexts();
    }

}
