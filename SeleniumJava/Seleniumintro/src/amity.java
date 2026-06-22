import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amity {

	public static void main(String[] args) throws InterruptedException, TimeoutException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String name = "swetasuman@amityonline.com";
		String pass = "wrgjdzcs3b";
		String environment = "test";
		boolean captchaValidation = false;

		driver.get("https://amigo.amityonline.com/login/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.switchTo().frame(
    		driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']"))
			);

		driver.findElement(By.id("recaptcha-anchor")).click();

		driver.switchTo().defaultContent();
		// driver.findElement(By.className("rc-anchor-checkbox-holder")).click();
		if(environment.equals("test")) {
    		captchaValidation = true;
			}
		Thread.sleep(50000);	
		driver.findElement(By.id("loginbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("popupCloseBtn")).click();
		
		
		List<String> courses = new ArrayList<>();
		courses.add("Professional Communication");
		courses.add("Graph Theory and Combinatorics");
		courses.add("Advanced Software Engineering Principles");
		courses.add("Advanced Database Management Systems");
		courses.add("Building the Future of Computing");
		courses.add("Core Java");
		for (String course : courses) {
			
			try {
				Thread.sleep(2000);
				adScreen(driver);
			}
			catch(Exception e) {
				System.out.println("It's first time!!");
			}
			driver.findElement(By.xpath("(//a[contains(@title,'" + course
					+ "')])/ancestor::div[@class='edw-card-design-hd d-flex flex-column flex-gap-3']/following-sibling::div[@class='edw-card-design-ft d-flex flex-column align-self-strech flex-gap-5']//a[text()='View Course']"))
					.click();

			try {
				driver.findElement(By.xpath("(//a[text() = 'Resume'])[1]")).click();
				try {
					WebElement attemptQuiz = driver.findElement(By.cssSelector("button[type='submit']"));
					if (attemptQuiz.isDisplayed()) {
						attemptQuiz.click();
						selectQuiz(driver);

					}

				} catch (Exception e) {
					System.out.println("no quiz attempt");

				}
				WebElement next = driver.findElement(By.id("next-activity-link"));

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				WebElement waitNext = wait.until(ExpectedConditions.visibilityOf(next));
				while (waitNext.isDisplayed()) {
					waitNext.click();
					try {
						WebElement attemptQuiz = driver.findElement(By.cssSelector("button[type='submit']"));
						if (attemptQuiz.isDisplayed()) {
							attemptQuiz.click();
							selectQuiz(driver);

						}

					} catch (Exception e) {
						System.out.println("no quiz attempt");

					}
					next = driver.findElement(By.id("next-activity-link"));
					waitNext = wait.until(ExpectedConditions.visibilityOf(next));
				}
			} catch (Exception e) {
				System.out.println("No more next");
				driver.get("https://amigo.amityonline.com/login/index.php");
				driver.findElement(By.cssSelector(".btn.btn-secondary")).click();
			}

		}
		driver.quit();

	}

	public static void selectQuiz(WebDriver driver) {
		try {

			List<WebElement> options = driver.findElements(By.cssSelector("input[id*='_answer3']"));
			for (int i = 1; i <= options.size(); i++) {
				new Actions(driver).moveToElement(driver.findElement(By.cssSelector("input[id*='" + i + "_answer3']")))
						.click().build().perform();
				;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.findElement(By.cssSelector("input[value*='Finish']")).click();
			driver.findElement(By.xpath("//button[text()='Submit all and finish']")).click();
			driver.findElement(By.cssSelector("button[data-action='save']")).click();
		}

	}
	
	public static void adScreen(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("popupCloseBtn"))).click().build().perform();
	}
	

	}


