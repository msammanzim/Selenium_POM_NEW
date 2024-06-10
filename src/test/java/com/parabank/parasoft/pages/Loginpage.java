package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends BasePage {
    public Loginpage(WebDriver driver) {
        super(driver);
    }

    public Loginpage fillUserName(String username) {
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;
    }

    public Loginpage fillPassword(String password) {
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }

    public AccountOverviewPage clickLoginBtn() {
        getWebElement(By.xpath("//input[@value='Log In']")).click();
        return getInstance(AccountOverviewPage.class);
    }

    public Loginpage clickLoginLinkBtn() {
        getWebElement(By.xpath("//input[@value='Log In']")).click();
        return this;
    }

    public CustomerLookupPage clickForgetLink() {
        getWebElement(By.cssSelector("a[href='lookup.htm']")).click();
        return getInstance(CustomerLookupPage.class);

    }

    public RegistrationPage clickRegistrationPage() {
        getWebElement(By.cssSelector("//a[normalize-space()='Register']")).click();
        return getInstance(RegistrationPage.class);

    }

    public boolean hasError() {
        return getWebElements(By.className("error")).size() > 0;

    }

}
