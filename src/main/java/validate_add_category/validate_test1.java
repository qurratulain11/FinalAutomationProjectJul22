package validate_add_category;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validate_test1 {


WebDriver driver;

@Before
public void launchbrowser() {

	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://techfios.com/test/101/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void validate_test1() throws InterruptedException {
	driver.findElement(By.cssSelector("input[name='categorydata']")).sendKeys("QFTest1");
	driver.findElement(By.cssSelector("name=['submit'][value=['Add category']")).click();
}
	
@Test
	public void categoryIsDisplayed() {
        try {
            System.out.println("Launching NSS-TODO List v 1.1 Login Page");
            driver.get("https://techfios.com/test/101/");
 
            WebElement Addcategory = driver.findElement(By.name("categorydata"));
            boolean isAddedCategoryPresent = Addcategory.isDisplayed();
            if(isAddedCategoryPresent) {
                Addcategory.sendKeys("QFTest1");
                System.out.println("added category is present");
            }
            else
                Assert.fail("No added category is present in the webpage");
        }finally {
        	
        }
        }


private void categoryIsDisplayed1() {
// TODO Auto-generated method stub
}
	
@After
public void closeBrowser() {
    driver.quit();
    System.out.println("The driver has been closed.");

	
}

}


	
	
        
