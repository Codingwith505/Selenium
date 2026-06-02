package sushilmaurya.SeleniumFramework;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import sushilmauryapageobject.LandingPage;

public class NewFeaturesUnlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String productName = "Banarsi Saree";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		LandingPage landingpage = new LandingPage(driver);
//		landingpage.GoTo();
//		landingpage.LandingApplication("sushil1@gmail.com", "Sushil123");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector(".card-body"))));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
		WebElement productText = products.stream().filter(
				product -> product.findElement(By.cssSelector(".card-body b")).getText().equalsIgnoreCase(productName))
				.findFirst().orElse(null);
		productText.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("toast-container"))));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		// driver.findElement(By.id("toast-container"))
		driver.findElement(By.xpath("(//ul/li/button)[3]")).click();
		List<WebElement> verifyCart = driver.findElements(By.cssSelector(".cart"));
		Boolean cartName = verifyCart.stream().anyMatch(verifyEcart -> verifyEcart
				.findElement(By.cssSelector(".infoWrap h3")).getText().equalsIgnoreCase(productName));
		Assert.assertTrue(cartName);
		driver.findElement(By.cssSelector(".subtotal.cf.ng-star-inserted button")).click();
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector(".form-group input.txt.text-validated")), "India").build()
				.perform();
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector(".ta-results"))));
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		driver.findElement(By.cssSelector(".action__submit ")).click();
		String getValue = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertEquals(getValue, "THANKYOU FOR THE ORDER.");
		driver.close();

	}

}
