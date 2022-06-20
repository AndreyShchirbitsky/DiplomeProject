package service;
import page.BasePage;
import page.BasketPage;

public class BasketPageService extends BasePage {

    BasketPage basketPage = new BasketPage();
    LoginPageService loginPageService = new LoginPageService();

    public void deleteItemFromBasket() {
        basketPage.clickOnDeleteItemButton();
    }

    public String getCountOfItemsInTheBasket() {
        return basketPage.getCountOfItemsInTheBasket();
    }

    public void clickOnLogoutButton() {
        basketPage.clickOnLogoutButton();
    }

    public String getTextOfLoginButton() {
        loginPageService.login();
        return basketPage.getTextOfLoginButton();
    }

    public String getActualPriceOfItemIhTheCart(){

        return basketPage.getPriceOfItem();
    }


}
