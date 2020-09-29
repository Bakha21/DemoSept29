package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver; 
	
	//Element address 
	By searchBox = By.id("search_query_top");
	By searchBtn = By.xpath("//button[@name='submit_search']");
	By womanTab = By.xpath("//a[@title='Women']");
	By cart = By.xpath("//a[@title='View my shopping cart']");
	

		//Constructor 
	public HomePage(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	//Actions on the elements 
	//clicking on search button 
	public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
	}
	
	//Insert search criteria into search box
	public void insertIntoSearchBox(String searchString) {
	    driver.findElement(searchBox).sendKeys(searchString);
	}
	
	public void clickWomanTab() {
	    driver.findElement(womanTab).click();
	}
	
	public void clickCartBtn() {
	    driver.findElement(cart).click();
	    
	}
}
