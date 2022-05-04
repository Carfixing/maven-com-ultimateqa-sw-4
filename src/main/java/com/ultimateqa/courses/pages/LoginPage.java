package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welComeText = By.className("page__heading");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By loginButton =  By.xpath("//input[@value='Sign in']");
    By inValidemailOrPassword = By.className("form-error__list-item");

    public String getWelcomeText() {
        return getTextFromElement(welComeText);
    }
    public void enterEmailId(String email){

        sendTextToElement(emailField,email);
    }
    public  void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }
    public String getErrorMessage(){

        return getTextFromElement(inValidemailOrPassword);
    }


}
