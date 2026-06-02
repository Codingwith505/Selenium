import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] checkItems = { "Brinjal", "Beetroot", "Beans", "Brocolli", "Carrot" };
		AddItems(driver, checkItems);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
//		WebDriverWait w = new WebDriverWait(driver,5);
//		w.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//span[@class='promoInfo']"))));
		String applyCode = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		Assert.assertEquals(applyCode, "Code applied ..!");
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		List<WebElement> staticDropDown = driver.findElements(By.xpath("//div/select"));
		for (WebElement dropDown : staticDropDown) {
			String countryName = dropDown.getText();
			if (countryName.contains("India")) {
				driver.findElement(By.xpath("//option[@value='India']")).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}

	public static void AddItems(WebDriver driver, String[] checkItems) {
		int j = 0;
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < productName.size(); i++) {
			String[] name = productName.get(i).getText().split("-");
			String itemNeeded = name[0].trim();
			List<String> itemNeededList = Arrays.asList(checkItems);

			if (itemNeededList.contains(itemNeeded)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == checkItems.length) {
					break;
				}
			}
		}
	}

}
