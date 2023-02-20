package unable_add_category;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unable_add_testt {

	public static WebDriver driver;
	
	public static void initDriver() {
		
	
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/");
		
		if (driver.findElements(By.name("Add category")).size()!=0){
			
		System.out.println("not able to add duplicated category");
		
		}else{
			System.out.println("The category you want to add already exists<duplicated category name>");
			
			driver.close();
	}
}
}
