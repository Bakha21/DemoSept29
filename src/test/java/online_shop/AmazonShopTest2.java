package online_shop;
import org.testng.annotations.Test;
import library.AmazonShop;
import utilities.Base;

public class AmazonShopTest2 extends Base {
	

	@Test
	public void searchTest() throws InterruptedException {
		
		
		driver.get(prop.getProperty("url"));

		AmazonShop amazonShop = new AmazonShop(driver);

		amazonShop.clickSearchBox();
		
		amazonShop.insertIntoSearchBox("wireless mouse");
		
		amazonShop.clickSearchBtn();
		
		amazonShop.clickChooseItem();
		
		amazonShop.clickAddToCart();
		
		amazonShop.clickSearchBox2();
		
		amazonShop.insertIntoSearchBox2("mouse pad");
		
		amazonShop.clickSearchBtn2();
		
		amazonShop.clickChooseItem2();
		
		amazonShop.clickAddToCart2();
		
		amazonShop.clickSearchBox3();
		
		amazonShop.insertIntoSearchBox("computer glasses");
		
		amazonShop.clickSearchBtn3();
		
		amazonShop.clickChooseItem3();
		
		amazonShop.clickAddToCart3();
		
		//amazonShop.clickNoProtection();
		
		amazonShop.clickCheckOut();
		
		amazonShop.insertEmail(prop.getProperty("email"));
		
		amazonShop.clickContinueBtn();
		
		amazonShop.insertPassword(prop.getProperty("password"));
		
		amazonShop.clickSignIn();
		
		amazonShop.clickDeliveryAddress();
		
		amazonShop.clickContinueBton();

	}
}
