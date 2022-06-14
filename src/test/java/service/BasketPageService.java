package service;

import page.BasePage;
import page.BasketPage;

public class BasketPageService extends BasePage {

    BasketPage basketPage = new BasketPage();

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
        return basketPage.getTextOfLoginButton();
    }

    public String getActualPriceOfItemIhTheCart(){
        return basketPage.getPriceOfItem();
    }

    public String getTotalPriceWithTax(){
        return basketPage.getTotalPriceWithTax();
    }

    public String getTotalOrderValue(){
        return basketPage.getTotalOrderValue();
    }

}
