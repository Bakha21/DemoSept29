package assertions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Base;

public class AssertTest extends Base {

	String expediaURL = "https://www.expedia.com/";
	String expectedText = "Membership is required and varified at pick-up";

	@Test
	public void textCase() {
		driver.get(expediaURL);

		driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[3]/a")).click();

		List<WebElement> rentalCarsBtn = driver.findElements(By.xpath("//ul[@id='uitk-tabs-button-container']/li/a/span[text()='Rental cars']"));
		boolean rentalCarsBtnExists = rentalCarsBtn.size() > 0;
		System.out.println("Found:" + rentalCarsBtn.size());

		Assert.assertTrue(rentalCarsBtnExists);

		String text = driver.findElement(By.xpath("//p[@class='uitk-switch-description uitk-type-200']")).getText();
		Assert.assertEquals(text, expectedText, "Comparing texts");
	}

	@Test
	public void textCaseSoftAssert() {
		SoftAssert softAssert = new SoftAssert();

		driver.get(expediaURL);

		driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[3]/a")).click();

		List<WebElement> rentalCarsBtn = driver
				.findElements(By.xpath("//ul[@id='uitk-tabs-button-container']/li/a/span[text()='Rental cars']"));
		boolean rentalCarsBtnExists = rentalCarsBtn.size() > 0;
		System.out.println("Found:" + rentalCarsBtn.size());

		softAssert.assertFalse(rentalCarsBtnExists);

		String text = driver.findElement(By.xpath("//p[@class='uitk-switch-description uitk-type-200']")).getText();
		softAssert.assertEquals(text, expectedText, "Comparing texts");

		softAssert.assertAll();
	}

	@Test
	public void textCaseMixAssert() {
		SoftAssert softAssert = new SoftAssert();

		driver.get(expediaURL);

		driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[3]/a")).click();

		List<WebElement> rentalCarsBtn = driver
				.findElements(By.xpath("//ul[@id='uitk-tabs-button-container']/li/a/span[text()='Rental cars']"));
		boolean rentalCarsBtnExists = rentalCarsBtn.size() > 0;
		System.out.println("Found:" + rentalCarsBtn.size());

		Assert.assertFalse(rentalCarsBtnExists);

		String text = driver.findElement(By.xpath("//p[@class='uitk-switch-description uitk-type-200']")).getText();
		softAssert.assertEquals(text, expectedText, "Comparing texts");

		softAssert.assertAll();
	}
}
