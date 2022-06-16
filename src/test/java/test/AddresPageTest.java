package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.AddresPageService;

import static util.Constant.*;

public class AddresPageTest extends BaseTest{

    AddresPageService addresPageService;

    @BeforeClass
    public void setUp() {
        addresPageService = new AddresPageService();
    }

    @Test(description = "creating an address")
    public void createAddressTest() {
        addresPageService.createAddress();
        String actualTitleOfAddress = addresPageService.getTitleOfAddressPage();
        Assert.assertTrue(actualTitleOfAddress.contains(ADDRESS_TITLE), "The actual title of the address does not match expected!");
    }

    @Test(description = "delete address")
    public void deleteAddressTest() {
        addresPageService.deleteAddress();
        String actualMessageOfPageAfterDeleteAddress = addresPageService.getTextOfPageAfterDeleteAddress();
        String expectedMessageOfPageAfterDeleteAddress = EXPECTED_MESSAGE_AFTER_DELETE_ADDRESS;
        Assert.assertTrue(actualMessageOfPageAfterDeleteAddress.contains(expectedMessageOfPageAfterDeleteAddress), "The actual message of the page does not match expected!");
    }
    @Test(description = "address creation error")
    public void errorWhileCreatingAddresTest(){
        addresPageService.createErrorAddress();
        String addressCreationErrorMessage = addresPageService.getTextOfErrorAddress();
        String expectedMessageOfCreationErrorMessage = EXPECTED_MESSAGE_AFTER_CREATE_ERROR_ADDRESS;
        Assert.assertTrue(addressCreationErrorMessage.contains(expectedMessageOfCreationErrorMessage), "The actual message of the page does not match expected!");
    }

}
