package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLoginPage {
	public DwsLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public @FindBy(id="Email")
WebElement username;
public @FindBy(name="Password")
WebElement password;
public @FindBy(xpath="//input[@value='Log in']")
WebElement login_button;
public void login_button() {
	// TODO Auto-generated method stub
	
}
public void password(String string) {
	// TODO Auto-generated method stub
	
}
public void username(String string) {
	// TODO Auto-generated method stub
	
}

}
