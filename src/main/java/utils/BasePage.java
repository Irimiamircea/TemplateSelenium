package utils;

import org.openqa.selenium.WebDriver;

import pages.MenuPage;

public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	
	//construim obiectul
	
	public MenuPage menu = new MenuPage(driver);

}
