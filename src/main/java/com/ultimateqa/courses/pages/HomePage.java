package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //store the element
    By signinlink = By.xpath("//a[@href='/users/sign_in']");
    By welComeText = By.className("page__heading");

    public void clickOnsigninLink(){
        clickOnElement(signinlink);
    }
    public String getWelcomeText(){
      return getTextFromElement(welComeText);
    }
}
