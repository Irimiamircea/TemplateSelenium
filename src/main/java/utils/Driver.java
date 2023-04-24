package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	//ThreadLocal - pt a lucra pe mai multe drivere
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public WebDriver initBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			Log.info("Browser parameter is: CHROME");
			driver.set(new ChromeDriver());
			long chromeId = Thread.currentThread().threadId();
			Log.info("Chrome =--> Thread.id = " + chromeId);
			return driver.get();
		}else if(browser.equalsIgnoreCase("firefox")) {
			Log.info("Browser parameter is: FIREFOX");
			driver.set(new FirefoxDriver());
			long firefoxId = Thread.currentThread().threadId();
			Log.info("Firefox =--> Thread.id = " + firefoxId);
			return driver.get();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			Log.info("Browser parameter is: EDGE");
			driver.set(new EdgeDriver());
			long edgeId = Thread.currentThread().threadId();
			Log.info("Edge =--> Thread.id = " + edgeId);
			return driver.get();
		}
		return driver.get();
		
	}
	
	
}
