package page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class CatalogPage extends BasePage{

    @FindBy(xpath = "//a[@class='product-name'][@title='Faded Short Sleeve T-shirts']")
    private WebElement nameProduckt;

    @FindBy(xpath = "//div[@class='right-block']//span[@class='price product-price']")
    private WebElement priceProduckt;

    @FindBy(xpath = "//span[contains(text(), 'Add to cart')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='button-container']//span[contains(text(), 'Оформить заказ')]")
    private WebElement checkoutButton;

    public String getTexts() {
        log.info("Getting text from the name produkt");
        return nameProduckt.getText();
    }
    public String  getCost() {
        log.info("Getting text from the cost produkt");
        return priceProduckt.getText();
    }
    public void clickOnAddToCartButton() {
        log.info("Clicking on the add to cart button");
        addToCartButton.click();
    }

    public void clickOnctButton() {
        log.info("Clicking on the add to cart button");
        checkoutButton.click();
    }
}
