import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement tableDriver = driver.findElement(By.id("product"));
		System.out.println(tableDriver.findElements(By.tagName("tr")).size());
		System.out.println(tableDriver.findElements(By.tagName("th")).size());
		System.out.println(tableDriver.findElements(By.xpath("//tr")).get(2).getText());
	}

}
