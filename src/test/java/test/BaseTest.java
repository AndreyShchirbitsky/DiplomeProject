package test;

import driver.DriverSingleTon;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import util.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = DriverSingleTon.getDriver();
    }

    @AfterClass
    public void closeBrovers(){
        DriverSingleTon.closeDriver();
    }
}
