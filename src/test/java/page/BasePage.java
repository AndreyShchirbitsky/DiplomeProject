package page;

import driver.DriverSingleTon;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Log4j2

public abstract class  BasePage {

    protected WebDriver driver = DriverSingleTon.getDriver();

    protected BasePage(){
        PageFactory.initElements(driver, this);
    }

}
