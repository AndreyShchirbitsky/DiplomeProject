package details;

import driver.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;


public class Сhoose extends BasePage {


    private static final String DROP_DOWN_XPATH = "//div[@id='%s']";
    private static final String SELECT_OPTION_XPATH = "//select[@class='form-control']//option[contains(text(),'%s')]";
    private final String wrapper;

    WebDriverWait wait = new WebDriverWait(DriverSingleTon.getDriver(), 15);

    public Сhoose(String label) {
        this.wrapper = label;
    }


    public void selectValue(String option) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(String.format(DROP_DOWN_XPATH, wrapper))))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH, option))).click();
    }
}
