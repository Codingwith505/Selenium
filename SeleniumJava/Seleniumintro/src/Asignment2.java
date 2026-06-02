import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Sushil");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("contact@rahulshettyacademy.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDownLs = new Select(dropDown);
		dropDownLs.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12/03/2024");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
