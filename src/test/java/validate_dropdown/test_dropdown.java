package validate_dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class test_dropdown {
	
	WebDriver driver;
	
		@BeforeMethod
		public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); }
		
		@Test
		public void dropdownTest() {
		driver.get("https://techfios.com/test/101/");
		String expectedOptions [] = {"None","Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		WebElement dropDown =(driver.findElement(By.name("due_month")));
		Select sel = new Select(driver.findElement(By.name("due_month")));
		List<WebElement> options = sel.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText()+" -> "+expectedOptions[i]);
			Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);
		}
			
//		@AfterMethod
//		public void teardown() {
//			driver.close();
			driver.quit();
			
			
		}
		}

