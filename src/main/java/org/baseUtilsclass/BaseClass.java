package org.baseUtilsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = new Chromedriver();
	
	public static JavascriptExecutor script;
	
	public void browserLaunch(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		 else if(browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
		 else if(browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
	}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void inputBox(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	public void back() {
		driver.navigate().back();
	}
	public String text(WebElement element) {
		return element.getText();
	}
	public void scrolldown(WebElement element) {
		script = (JavascriptExecutor)driver;
		script.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void elementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void javaScriptClick(WebElement element) {
		script.executeScript("arguments[0].click();",element);
		
	}
}
