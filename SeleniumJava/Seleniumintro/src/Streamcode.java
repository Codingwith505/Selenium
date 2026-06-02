import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streamcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Orange");
		List<WebElement> valuesName = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> getValues = valuesName.stream().filter(s->s.getText().contains("Orange")).collect(Collectors.toList());
		Assert.assertEquals(getValues.size(),valuesName.size());
	}

}
