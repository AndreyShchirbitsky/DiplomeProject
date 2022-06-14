package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.BasketPageService;
import service.ProducktsPageService;
import static util.Constant.*;

public class BasketPageTest extends BaseTest{


    ProducktsPageService producktsPageService;
    BasketPageService basketPageService;

    @BeforeClass
    public void setUp() {
        producktsPageService = new ProducktsPageService();
        basketPageService = new BasketPageService();
    }

    @Test
    public void addItemToBasketTest() {
        producktsPageService.addingItemToBasket();
        String actualNameOfItemItTheBasket = producktsPageService.getNameOfItemInTheBasket();
        basketPageService.clickOnLogoutButton();
        String expectedNameOfItemItTheBasket = EXPECTED_NAME_OF_ITEM_IN_CART;
        Assert.assertTrue(actualNameOfItemItTheBasket.contains(expectedNameOfItemItTheBasket), "The actual name of item in the cart does not match expected!");
    }

    @Test
    public void deleteItemFromBasketTest() {
        producktsPageService.addItemToBasket();
        basketPageService.deleteItemFromBasket();
        String actualCountOfItemsInTheBasket = basketPageService.getCountOfItemsInTheBasket();
        String expectedCountOfItemsInTheBasket = EXPECTED_COUNT_OF_ITEMS_IN_THE_CART;
        Assert.assertEquals(actualCountOfItemsInTheBasket, expectedCountOfItemsInTheBasket, "The actual count of item in the cart does not match expected!");
    }

    @Test
    public void logoutTest() {
        basketPageService.clickOnLogoutButton();
        String actualTextOfButton = basketPageService.getTextOfLoginButton();
        String expectedTextOfButton = EXPECTED_TEXT_OF_BUTTON;
        Assert.assertEquals(actualTextOfButton, expectedTextOfButton, "You have been not logout!");
    }

    @Test
    public void correctPriceTest() {
        String expectedPriceOfItem = producktsPageService.getExpectedPriceOfItem();
        producktsPageService.clickToBasketButton();
        String actualPriceOfItem = basketPageService.getActualPriceOfItemIhTheCart();
        basketPageService.clickOnLogoutButton();
        Assert.assertEquals(actualPriceOfItem, expectedPriceOfItem, "The actual price of item un the cart does not match expected!");
    }

    @Test
    public void correctOrderValueTest() {
        producktsPageService.addItemToBasket();
        String expectedOrderValue = basketPageService.getTotalPriceWithTax();
        String actualOrderValue = basketPageService.getTotalOrderValue();
        basketPageService.clickOnLogoutButton();
        Assert.assertEquals(actualOrderValue, expectedOrderValue, "The actual order value does not match expected!");
    }




}
