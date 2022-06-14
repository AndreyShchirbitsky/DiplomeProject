package page;

import driver.DriverSingleTon;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class ProducktsPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(DriverSingleTon.getDriver(), 15);

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

    public ProducktsPage clickToAddToCartButton() {
        log.info("Clicking on the add to the cart button");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).moveToElement(addToCartButton).click().build().perform();
        return this;
    }

    public ProducktsPage clickToContinueShoppingButton() {
        log.info("Clicking on the continue to shopping button");
        wait.until(ExpectedConditions.visibilityOf(continueShoppingButton)).click();
        continueShoppingButton.click();
        return this;
    }

    public void clickToCartButton() {
        log.info("Clicking on the cart button");
        cartButton.click();
    }

    public String getPriceOfItem() {
        log.info("Getting price of item");
        return priceOfItem.getText();
    }

    public void clickOnMoreInformationAboutItemButton() {
        log.info("Clicking on the more information about item button");
        Actions actions = new Actions(driver);
        actions.moveToElement(object).moveToElement(moreInformationAboutItemButton).click().build().perform();
    }

    public String getTextOfDescriptionOfItem() {
        log.info("Getting description of item");
        return descriptionOfItem.getText();
    }
}
