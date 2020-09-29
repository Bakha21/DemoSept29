package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonShop {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='nav-search-field ']")
	WebElement searchBox; // click

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement typeText;// insert

	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
	WebElement searchBtn;// click

	@FindBy(xpath = "(//img[@class='sb_s0WWAh6z'])[1]")
	WebElement chooseItem; // click

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;
	
	@FindBy(xpath = "//a[@id='attach-close_sideSheet-link']")
	WebElement closeTab;
	
	@FindBy(xpath = "//div[@class='nav-search-field ']")
	WebElement searchBox2;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement typeText2;
	
	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
	WebElement searchBtn2;// click
	
	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[5]")
	WebElement chooseItem2;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart2;
	
	//@FindBy(xpath = "//button[@id='attachSiNoCoverage-announce']")
	//WebElement noProtection;

	@FindBy(xpath = "//div[@class='nav-search-field ']")
	WebElement searchBox3; // click
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement typeText3;
	
	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
	WebElement searchBtn3;
	
	@FindBy(xpath = "(//img[@style='width: auto; height: auto; max-width: 180px; max-height: 120px;'])[1]")
	WebElement chooseItem3;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart3;
	
	@FindBy(xpath = "//span[@id='hlb-ptc-btn']")
	WebElement checkOut;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueBtn;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement sighInBtn;

	@FindBy(xpath = "(//a[@class='a-declarative a-button-text '])[1]")
	WebElement deliveryAddress;

	@FindBy(xpath = "(//input[@type='submit'])[3]")
	WebElement continueBton;

	// Constructor
	public AmazonShop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Actions on the elements
	// clicking on search button
	// Insert search criteria into search box

	public void clickSearchBox() {
		searchBox.click();
	}
	
	public void insertIntoSearchBox(String searchString) {
		typeText.sendKeys(searchString);
	}

	public void clickSearchBtn() {
		searchBtn.click();
	}

	public void clickChooseItem() {
		chooseItem.click();
	}

	public void clickAddToCart() {
		addToCart.click();
	}
	public void clickCloseTab() {
		closeTab.click();
	}
	public void clickSearchBox2() {
		searchBox2.click();
	}
	public void insertIntoSearchBox2(String searchString) {
		typeText2.sendKeys(searchString);
	}
	
	public void clickSearchBtn2() {
		searchBtn2.click();
	}
	
	public void clickChooseItem2() {
		chooseItem2.click();
	
	}
	
	public void clickAddToCart2() {
		addToCart2.click();
	}

	//public void clickNoProtection() {
		//noProtection.click();
	//}
	
	public void clickSearchBox3() {
		searchBox3.click();
	}
	public void insertIntoSearchBox3(String searchString) {
		typeText3.sendKeys(searchString);
	}
	public void clickSearchBtn3() {
		searchBtn3.click();
	}
	public void clickChooseItem3() {
		chooseItem3.click();
	}
	public void clickAddToCart3() {
		addToCart3.click();
	}
	
	public void clickCheckOut() {
		checkOut.click();
	}

	public void insertEmail(String emailString) {
		email.sendKeys(emailString);
	}

	public void clickContinueBtn() {
		continueBtn.click();
	}

	public void insertPassword(String passwordString) {
		password.sendKeys(passwordString);
	}

	public void clickSignIn() {
		sighInBtn.click();
	}

	public void clickDeliveryAddress() {
		deliveryAddress.click();
	}

	public void clickContinueBton() {
		continueBton.click();
	}

}
