package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnsigninLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not verify Message :");
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnsigninLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Invalid email or password.";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not verify login deatils :");
    }
}
