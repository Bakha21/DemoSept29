package online_shop;
import org.testng.annotations.Test;

import library.DressShop;
import utilities.Base2;


public class DressShopTest extends Base2{

	@Test
	public void searchTest() throws InterruptedException {
		
		
		driver2.get(prop2.getProperty("url"));
		
	DressShop summerDress = new DressShop(driver2);
	
	summerDress.clickWomanTb();
	summerDress.insertIntoSearchBox("dress");
	summerDress.clickSearchBtn();
	summerDress.clickSummerDress();
	summerDress.clickChooseColor();
	summerDress.clickAddToCart();
	summerDress.clickCheckOut();
	summerDress.clickCheckOutBtn();	
	summerDress.insertEmail(prop2.getProperty("email"));	
	summerDress.insertPassword(prop2.getProperty("password"));	
	summerDress.clickSignIn();	
	summerDress.clickProccedBtn();	
	summerDress.clickAgreement();	
	summerDress.clickProccedToCheckOutBtn();	
	summerDress.clickBankWire();	
	summerDress.clickConfirmBtn();
    
	}


}
