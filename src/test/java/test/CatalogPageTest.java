package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.CatalogPageService;

import static util.Constant.REQUESTED_PRODUCT;

public class CatalogPageTest extends BaseTest {

   CatalogPageService catalogPageService;
    @BeforeClass
    public void setUp() {
        catalogPageService = new CatalogPageService();
    }

    @Test(description = "comparison of the name of the product with the desired")
    public void catalogTest(){
        catalogPageService.loginn();
        String actualrequest = catalogPageService.getTitleOfCatalogPage();
        Assert.assertEquals(actualrequest, REQUESTED_PRODUCT, "the actual text does not match expected");
    }

}
