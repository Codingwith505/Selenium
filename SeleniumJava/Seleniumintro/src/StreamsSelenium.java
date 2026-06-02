import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamsSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		List<WebElement> valueNames = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> getValue = valueNames.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(getValue);
		// sort the original list
		List<String> sortedList = getValue.stream().sorted().collect(Collectors.toList());
		// print the sorted list
		sortedList.forEach(s -> System.out.println(s));
		Assert.assertTrue(getValue.equals(sortedList));
		List<String> price;
		// get the price of the vagies
		do {
			List<WebElement> valueNames1 = driver.findElements(By.xpath("//tr/td[1]"));
			price = valueNames1.stream().filter(s -> s.getText().contains("Orange")).map(s -> getVeggies(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getVeggies(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
