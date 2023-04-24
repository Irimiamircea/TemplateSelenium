package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers {

	public MenuPage(WebDriver driver) {
		super(driver);
	}
	
	public By loginLink = By.linkText("My account");
	
	
}
