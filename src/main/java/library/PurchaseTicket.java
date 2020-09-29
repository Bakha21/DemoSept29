package library;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseTicket {

WebDriver driver; 
	
	//Elements

	@FindBy(xpath = "(//a[@class='uitk-tab-anchor'])[2]")
	WebElement flightsBtn;
	
	//@FindBy(xpath = "(//span[@class='uitk-tab-text'])[7]")
	//WebElement roundtripBtn;
	
	@FindBy(xpath = "//a[@class='uitk-link icon-right uitk-link-layout-default uitk-type-300']")
	WebElement chooseTravelers;
	
	@FindBy(xpath = "(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[2]")
	WebElement addAdults; 
	
	@FindBy(xpath = "(//button[@type='button'])[11]")
	WebElement done; 
	
	@FindBy(xpath = "(//button[@class='uitk-faux-input'])[1]")
	WebElement leavingFrom; 
	
	@FindBy(xpath = "//input[@placeholder='Where are you leaving from?']")
	WebElement insertLocation; 
	
	@FindBy(xpath = "(//button[@class='uitk-faux-input'])[2]")
	WebElement goingTo; //click 
	
	@FindBy(xpath = "//input[@placeholder='Where are you going to?']")
	WebElement insertdestination; 
	
	@FindBy(xpath = "//button[@id='d1-btn']")
	WebElement selectCalendar; 
	
	@FindBy(xpath = "//button[@aria-label='Oct 8, 2020']")
	WebElement chooseDeaptureDate; 
	
	@FindBy(xpath = "//button[@aria-label='Oct 15, 2020']")
	WebElement chooseReturnDate; 
	
	@FindBy(xpath = "//button[@class='uitk-button uitk-button-small uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']")
	WebElement doneBtn; 
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement searchBtn; 
	
	
	//Constructor
		public PurchaseTicket(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
	     	//Actions on the elements 
			//clicking on search button 
		
			public void clickFlightBtn() {
				flightsBtn.click();
			}
			public void chooseTravelers() {
					chooseTravelers.click();
					
			}
			public void addAdults() {
				for(int i=0; i<=2; i++) {
					addAdults.click();
				}
				}
			public void done() {
					done.click();
			}
			public void leavingFrom() {
				leavingFrom.click();
			}
			public void insertLocation(String leavingString) {
			 insertLocation.sendKeys(leavingString);
			 
			}
			public void airportA() {
				insertLocation.sendKeys(Keys.ARROW_DOWN);
				insertLocation.sendKeys(Keys.ENTER);
				
			}
			public void goingTo() {
				goingTo.click();
			}
			public void insertDestination(String destinationString) {
				insertdestination.sendKeys(destinationString);
			}
			public void airportB() {
				insertdestination.sendKeys(Keys.ARROW_DOWN);
				insertdestination.sendKeys(Keys.ENTER);
			}
			public void selectCalendar() {
				selectCalendar.click();
			}
			public void chooseDeaptureDate() {
				chooseDeaptureDate.click();
			}
			public void chooseReturnDate() {
				chooseReturnDate.click();
			}
			public void doneBtn() {
				doneBtn.click();
			}
			public void searchBtn() {
				searchBtn.click();
			}
}
