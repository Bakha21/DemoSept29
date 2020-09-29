package synchronization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;

public class ExplicitWaitTest extends Base {

	String expediaURL = "https://www.expedia.com/";
	String expectedText = "Membership is required and varified at pick-up";

	@Test
	public void textCase() {
		WebDriverWait wait =new WebDriverWait(driver,  10);
		By rentalCarsXpath = By.xpath("//ul[@id='uitk-tabs-button-container']/li/a/span[text()='Rental cars']");
		
		driver.get(expediaURL);

		driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[3]/a")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(rentalCarsXpath));

		List<WebElement> rentalCarsBtn = driver.findElements(rentalCarsXpath);
		boolean rentalCarsBtnExists = rentalCarsBtn.size() > 0;
		System.out.println("Found:" + rentalCarsBtn.size());

	//	Assert.assertTrue(rentalCarsBtnExists);

		String text = driver.findElement(By.xpath("//p[@class='uitk-switch-description uitk-type-200']")).getText();
		Assert.assertEquals(text, expectedText, "Comparing texts");
	}
}
