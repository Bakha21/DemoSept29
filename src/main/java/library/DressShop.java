package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressShop {
WebDriver driver; 
	
	//Elements

	@FindBy(xpath = "//a[@title='Women']")
	WebElement womanTab;
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchBtn;
	
	@FindBy(xpath = "(//img[@title = 'Printed Summer Dress'])[1] ")
	WebElement summerDress; 
	
	@FindBy(xpath ="//a[@title='Orange']")
	WebElement color; 
	
	@FindBy(xpath = "//button[@name='Submit']")
	WebElement addToCart;
	
	//@FindBy(xpath = "//a[@title='View my shopping cart']")
	//WebElement viewCart;
	
	@FindBy(xpath ="//a[@class='btn btn-default button button-medium']")
	WebElement checkOut;
	
	@FindBy(xpath ="//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement checkOutBtn;
	
	@FindBy(xpath ="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath ="//input[@id='passwd']")
	WebElement password;

	@FindBy(xpath ="//button[@id='SubmitLogin']")
	WebElement sighInBtn;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	WebElement proccedBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement agreement;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	WebElement proccedToCheckOutBtn;
	
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement bankWire;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement confirmBtn;
	
	
	
	//Constructor
	public DressShop(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	
     	//Actions on the elements 
		//clicking on search button 
		public void clickWomanTb() {
			womanTab.click();
		}
		//Insert search criteria into search box
		public void insertIntoSearchBox(String searchString) {
		    searchBox.sendKeys(searchString);
		}
		public void clickSearchBtn() {
		    searchBtn.click();
		}
		
		public void clickSummerDress() {
		    summerDress.click();
		}
		public void clickChooseColor() {
		    color.click();
		}
		public void clickAddToCart() {
		    addToCart.click();
		}
		//public void clickViewCart() {
		   // viewCart.click();
		
		public void clickCheckOut() {
		    checkOut.click();
		}
		public void clickCheckOutBtn() {
		    checkOutBtn.click();
		}
		public void insertEmail(String emailString) {
			email.sendKeys(emailString);
		}
		public void insertPassword(String passwordString) {
			password.sendKeys(passwordString);
		}
		public void clickSignIn() {
			sighInBtn.click();
		}
		public void clickProccedBtn() {
			proccedBtn.click();
		}
		public void clickAgreement() {
			agreement.click();
		}
		public void clickProccedToCheckOutBtn() {
			proccedToCheckOutBtn.click();
		}
		public void clickBankWire() {
			bankWire.click();
		}
		public void clickConfirmBtn() {
			confirmBtn.click();
		}
	}
		


