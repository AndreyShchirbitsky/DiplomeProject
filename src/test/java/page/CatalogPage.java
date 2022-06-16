package page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class CatalogPage extends BasePage{

    @FindBy(xpath = "//a[@class='product-name'][@title='Faded Short Sleeve T-shirts']")
    private WebElement nameProduckt;

    @Step("Getting text from the name product")
    public String getTexts() {
        log.info("Getting text from the name product");
        return nameProduckt.getText();
    }

}
