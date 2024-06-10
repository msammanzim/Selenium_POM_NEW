package com.parabank.parasoft.testcase;

import com.parabank.parasoft.pages.AccountOverviewPage;
import com.parabank.parasoft.pages.Loginpage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void doLogingFailedWithoutUserName() {
        Loginpage loginpage = page.getInstance(Loginpage.class);
        loginpage = loginpage
                .fillUserName("sfsdfsdf")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginpage.hasError());
    }

    @Test
    public void doLogingPasswordFailedWithoutUserName() {
        Loginpage loginpage = page.getInstance(Loginpage.class);
        loginpage = loginpage
                .fillPassword("sfsdfsdf")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginpage.hasError());
    }

    @Test
    public void doLogingShouldFaile() {
        Loginpage loginpage = page.getInstance(Loginpage.class);
        loginpage = loginpage
                .clickLoginLinkBtn();
        Assert.assertTrue(loginpage.hasError());
    }


    @Test
    public void doLoginShouldSuccess() {
        Loginpage loginpage = page.getInstance(Loginpage.class);
        AccountOverviewPage overviewPage = loginpage
                .fillUserName("sqa")
                .fillPassword("sqa")
                .clickLoginBtn();


        Assert.assertTrue(overviewPage.hasLogoutLink());
    }
    @Test
    public  void checkTitle(){
        Loginpage loginpage=page.getInstance(Loginpage.class);
        Assert.assertEquals(loginpage.getPageTitle(), General.LOGIN_TITLE);
    }

}
