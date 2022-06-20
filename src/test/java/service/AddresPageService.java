package service;

import driver.DriverSingleTon;
import model.Addres;
import org.openqa.selenium.Alert;
import page.AddresPage;
import page.BasePage;

import static model.Addres.ADDRESSES_PAGE_URL;
import static model.Addres.ADDRESS_PAGE_URL;
import static util.Constant.*;


public class AddresPageService extends BasePage {
   public static final String ADDRESS_PAGE_URLS = "http://prestashop.qatestlab.com.ua/ru/address";

    AddresPage addresPage = new AddresPage();
    LoginPageService loginPageService = new LoginPageService();
    Alert alert;


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
                .countryInput()
                .stateInput()
                .addressTitleInput(addres)
                .clickSaveButton();

    }
    public void deleteAddress() {
        addresPage.openPage(ADDRESSES_PAGE_URL)
                .clickDeleteAddressButton();
        alert = DriverSingleTon.getDriver().switchTo().alert();
        alert.accept();

    }
    public void createErrorAddress() {
        loginPageService.login();
        Addres addres = new Addres(FIRST_NAME, LAST_NAME, COMPANY, ADDRESS, ZIP, CITY, HOME_PHONE, COUNTRY, STATE,ADDRES_TITLE_MESSEG);
        addresPage.openPage(ADDRESS_PAGE_URLS)
                .firstNameInput(addres)
                .lastNameInput(addres)
                .companyInput(addres)
                .addressInput(addres)
                .zipInput(addres)
                .cityInput(addres)
                .homePhoneInput(addres)
                .countryInput()
                .stateInput()
                .clickSaveButton();

    }
    public String getTitleOfAddressPage() {
        return addresPage.getTextOfAddres();
    }



    public String getTextOfPageAfterDeleteAddress() {
        return addresPage.getText();
    }


    public String getTextOfErrorAddress() {
        return addresPage.getTexts();
    }

}
