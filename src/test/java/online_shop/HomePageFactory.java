package online_shop;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver; 
	
	//Elements
	@FindBy(id = "search_query_top")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//a[@title='Women']")
	WebElement womanTab;
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement cart;
	
	
	
	//Constructor
	public HomePageFactory(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	
     	//Actions on the elements 
		//clicking on search button 
		public void clickSearchBtn() {
			searchBtn.click();
		}
		
		//Insert search criteria into search box
		public void insertIntoSearchBox(String searchString) {
		    searchBox.sendKeys(searchString);
		}
		
		public void clickWomanTab() {
		    womanTab.click();
		}
		
		public void clickCartBtn() {
		    cart.click();
		    
		}
}
