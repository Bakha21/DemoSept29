package online_shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import library.AmazonShop;

public class AmazonShopTest {
	

	@Test
	public void searchTest() throws InterruptedException {
		String url = "https://www.amazon.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);

		AmazonShop amazonShop = new AmazonShop(driver);

		amazonShop.clickSearchBox();
		Thread.sleep(2000);
		
		amazonShop.insertIntoSearchBox("wireless mouse");
		Thread.sleep(2000);
		
		amazonShop.clickSearchBtn();
		Thread.sleep(2000);
		
		amazonShop.clickChooseItem();
		Thread.sleep(2000);
		
		amazonShop.clickAddToCart();
		Thread.sleep(2000);
		
		//amazonShop.clickNoProtection();
		
		amazonShop.clickCheckOut();
		Thread.sleep(2000);
		
		amazonShop.insertEmail("email");
		Thread.sleep(2000);
		
		amazonShop.clickContinueBtn();
		Thread.sleep(2000);
		
		amazonShop.insertPassword("password");
		Thread.sleep(2000);
		
		amazonShop.clickSignIn();
		Thread.sleep(2000);
		
		amazonShop.clickDeliveryAddress();
		Thread.sleep(2000);
		
		amazonShop.clickContinueBton();
		Thread.sleep(2000);

	}
}
