import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "Sushil";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(2000);
		String actualValue = driver.findElement(By.xpath("//div/h2")).getText();
		Assert.assertEquals(actualValue,"Hello "+name+",");
		String actualValue2 = driver.findElement(By.xpath("//div/h1")).getText();
		Assert.assertEquals(actualValue2,"Welcome to Rahul Shetty Academy");
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		driver.findElement(By.cssSelector("button[class='logout-btn']")).click();
		driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		String name = "Sushil";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("India@123");
		driver.findElement(By.cssSelector("button.submit")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Sp@outlook.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8549628749");
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String passwordText = driver.findElement(By.xpath("//form/p[1]")).getText();
		String passwordText1[] = passwordText.split("'");
		String passwordText2[] = passwordText1[1].split("'");
		String password = passwordText2[0];
		return password;
	}
}