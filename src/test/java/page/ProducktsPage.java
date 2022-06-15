package page;

import driver.DriverSingleTon;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Waiter;

@Log4j2
public class ProducktsPage extends BasePage{


    @FindBy(xpath = "//div[@class='button-container']//a[@data-id-product='1']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='right-block']")
    private WebElement element;

    @FindBy(xpath = "//span[@title='Продолжить покупки']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//a[@title='Посмотреть корзину']")
    private WebElement cartButton;

    @FindBy(xpath = " //a[@title='Faded Short Sleeve T-shirts']//ancestor::div[@class='right-block']//span[@itemprop='price']")
    private WebElement priceOfItem;

    @FindBy(xpath = "//a[@data-id-product='1']//parent::div[@class='button-container']//a[@title='View']")
    private WebElement moreInformationAboutItemButton;

    @FindBy(xpath = "//div[@class='right-block']")
    private WebElement object;

    @FindBy(xpath = "//div[@id='short_description_content']//p")
    private WebElement descriptionOfItem;


    @Step("Clicking on the add to the cart button")
    public ProducktsPage clickToAddToCartButton() {
        log.info("Clicking on the add to the cart button");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).moveToElement(addToCartButton).click().build().perform();
        return this;
    }

    @Step("Clicking on the continue to shopping button")
    public ProducktsPage clickToContinueShoppingButton() {
        log.info("Clicking on the continue to shopping button");
        Waiter.waitVisibilityOfElement(driver, continueShoppingButton);
        continueShoppingButton.click();
        return this;
    }

    @Step("Clicking on the cart button")
    public void clickToCartButton() {
        log.info("Clicking on the cart button");
        cartButton.click();
    }

    @Step("Getting price of item")
    public String getPriceOfItem() {
        log.info("Getting price of item");
        return priceOfItem.getText();
    }
}
