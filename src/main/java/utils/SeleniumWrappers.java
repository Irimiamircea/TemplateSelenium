package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers {

	public WebDriver driver;
	
	public SeleniumWrappers(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(By locator) {
		waitForElementToBeVisible(driver.findElement(locator));
		getElement(locator).click();
	}
	
	public void sendKeys(By locator, String value) {
		waitForElementToBeVisible(driver.findElement(locator));
		WebElement element = driver.findElement(locator);
		element.sendKeys(value);
	}
	
	
	public void waitForElementToBeVisible(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public boolean elementIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
}
