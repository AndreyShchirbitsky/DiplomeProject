package service;

import page.BasketPage;
import page.MainPage;
import page.ProducktsPage;

public class ProducktsPageService {

    ProducktsPage producktsPage = new ProducktsPage();
    LoginPageService loginPageService = new LoginPageService();
    MainPage mainPage = new MainPage();
    BasketPage basketPage = new BasketPage();

    public void addItemToBasket() {
        loginPageService.login();
        mainPage.clickOnWomenProducktsPageButton();
        producktsPage.clickToAddToCartButton()
                .clickToContinueShoppingButton()
                .clickToCartButton();
    }

    public void addingItemToBasket(){
        loginPageService.login();
        mainPage.clickOnWomenProducktsPageButton();
        producktsPage.clickToAddToCartButton()
                .clickToContinueShoppingButton()
                .clickToCartButton();
    }
    public String getExpectedPriceOfItem() {
        loginPageService.login();
        mainPage.clickOnWomenProducktsPageButton();
        producktsPage.clickToAddToCartButton()
                .clickToContinueShoppingButton();
        return producktsPage.getPriceOfItem();
    }

    public String getNameOfItemInTheBasket() {

        return basketPage.nameOfItemInTheCart();
    }



    public void clickToBasketButton() {
        producktsPage.clickToCartButton();
    }

}
