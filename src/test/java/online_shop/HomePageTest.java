package online_shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.HomePage;

public class HomePageTest {
	
	String url="http://automationpractice.com/index.php?controller=order";
	WebDriver driver; 
	
	@BeforeMethod
	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void closeDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void searchTest() throws InterruptedException {
			
		driver.get(url);
		
	HomePage homePage = new HomePage(driver);
		
	homePage.insertIntoSearchBox("dress");
	homePage.clickSearchBtn();
	
	Thread.sleep(3000);
	homePage.clickCartBtn();
	
    Thread.sleep(3000);
	homePage.clickWomanTab();
		
	}
	@Test
	public void searchTestPageFactory() throws InterruptedException {
	
		
		driver.get(url);
		
	HomePageFactory homePage = new HomePageFactory(driver);
		
	homePage.insertIntoSearchBox("dress");
	homePage.clickSearchBtn();
	
	Thread.sleep(3000);
	homePage.clickCartBtn();
	
    Thread.sleep(3000);
	homePage.clickWomanTab();
		
	}
}
