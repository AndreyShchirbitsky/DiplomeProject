package service;

import page.BasePage;
import page.CatalogPage;
import static util.Constant.*;


public class CatalogPageService extends BasePage {

    CatalogPage catalogPage = new CatalogPage();
    LoginPageService loginPageService = new LoginPageService();

    public CatalogPage loginn(){
        loginPageService.login()
        .searchBox(REQUESTED_PRODUCT)
                .submitAnInquiry();
     return new CatalogPage();
    }

    public String getTitleOfCatalogPage() {
        return catalogPage.getTexts();
    }



}
