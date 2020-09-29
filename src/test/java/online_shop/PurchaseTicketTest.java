package online_shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import library.PurchaseTicket;
import utilities.Base2;


public class PurchaseTicketTest extends Base2{

	@Test
	public void searchTest() throws InterruptedException {
		
		
		driver2.get(prop2.getProperty("url"));
		
	PurchaseTicket searchTicket = new PurchaseTicket(driver2);
	
	searchTicket.clickFlightBtn();
	Thread.sleep(2000);
	
	searchTicket.chooseTravelers();
	Thread.sleep(2000);
	
	searchTicket.addAdults();
	Thread.sleep(2000);
	
	searchTicket.done();
	Thread.sleep(2000);
	
	searchTicket.leavingFrom();
	Thread.sleep(2000);
	
	searchTicket.insertLocation("New York");
	Thread.sleep(2000);
	
	searchTicket.airportA();
	Thread.sleep(2000);
	
	searchTicket.goingTo();
	Thread.sleep(2000);
	
	searchTicket.insertDestination("Miami");
	Thread.sleep(2000);
	
	searchTicket.airportB();
	Thread.sleep(2000);
	
	searchTicket.selectCalendar();
	Thread.sleep(2000);
	
	searchTicket.chooseDeaptureDate();
	Thread.sleep(2000);
	
	searchTicket.chooseReturnDate();
	Thread.sleep(2000);
	
	searchTicket.doneBtn();
	Thread.sleep(2000);
	
	searchTicket.searchBtn();
	Thread.sleep(2000);
	
    
	}
}
