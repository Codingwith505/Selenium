import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a = new SoftAssert();
		List<WebElement> url = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		for (WebElement listUrl : url) {
			String urls = listUrl.getDomProperty("href");
			HttpURLConnection conn = (HttpURLConnection) new URI(urls).toURL().openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
//			if(responseCode > 400) {
//				System.out.println(urlName);
//				System.out.println(urls);
//				System.out.println(responseCode);
//			}
			a.assertTrue(responseCode < 400, "The link is broken" + responseCode + "is this");

		}
		a.assertAll();

	}

}
