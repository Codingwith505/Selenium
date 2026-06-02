import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String value = (driver.findElement(By.cssSelector("label[for='honda']")).getText());
		WebElement dropDW = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(dropDW);
		dropDown.selectByContainsVisibleText(value);
		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		String extractedValue = driver.switchTo().alert().getText().split(",")[0].split(" ")[1].trim();
		driver.switchTo().alert().accept();
		Assert.assertEquals(value, extractedValue);
	}

}
