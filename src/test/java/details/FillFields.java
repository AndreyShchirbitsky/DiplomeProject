package details;

import driver.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

public class FillFields extends BasePage {

    private final String wrapper;

    WebDriverWait wait = new WebDriverWait(DriverSingleTon.getDriver(), 15);
    private static final String INPUT_XPATH = "//input[@id='%s']";

    public FillFields(String wrapper) {
        this.wrapper = wrapper;
    }

    public void writeText(String text) {
        wait.until(ExpectedConditions.
                visibilityOf(driver.findElement(By.xpath(String.format(INPUT_XPATH, wrapper))))).sendKeys(text);
    }
}
