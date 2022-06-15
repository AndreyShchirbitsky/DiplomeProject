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

    @Test(description = "adding a product to the cart")
    public void addItemToBasketTest() {
        producktsPageService.addingItemToBasket();
        String actualNameOfItemItTheBasket = producktsPageService.getNameOfItemInTheBasket();
        basketPageService.clickOnLogoutButton();
        String expectedNameOfItemItTheBasket = EXPECTED_NAME_OF_ITEM_IN_CART;
        Assert.assertTrue(actualNameOfItemItTheBasket.contains(expectedNameOfItemItTheBasket), "The actual name of item in the cart does not match expected!");
    }

    @Test(description = "removing an item from the cart")
    public void deleteItemFromBasketTest() {
        producktsPageService.addItemToBasket();
        basketPageService.deleteItemFromBasket();
        String actualCountOfItemsInTheBasket = basketPageService.getCountOfItemsInTheBasket();
        String expectedCountOfItemsInTheBasket = EXPECTED_COUNT_OF_ITEMS_IN_THE_CART;
        Assert.assertEquals(actualCountOfItemsInTheBasket, expectedCountOfItemsInTheBasket, "The actual count of item in the cart does not match expected!");
    }

    @Test(description = "logout")
    public void logoutTest() {
        String actualTextOfButton = basketPageService.getTextOfLoginButton();
        Assert.assertEquals(actualTextOfButton, EXPECTED_TEXT_OF_BUTTON, "You have been not logout!");
    }

    @Test(description = "price comparison")
    public void correctPriceTest() {
        String expectedPriceOfItem = producktsPageService.getExpectedPriceOfItem();
        producktsPageService.clickToBasketButton();
        String actualPriceOfItem = basketPageService.getActualPriceOfItemIhTheCart();
        basketPageService.clickOnLogoutButton();
        Assert.assertEquals(actualPriceOfItem, expectedPriceOfItem, "The actual price of item un the cart does not match expected!");
    }

}
