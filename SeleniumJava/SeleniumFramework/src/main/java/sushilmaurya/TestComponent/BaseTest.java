package sushilmaurya.TestComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import sushilmauryapageobject.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingpage;

	public void intializerBrowser() throws IOException {

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//sushilmaurya//Resourse//GlobalData.properties");
		pro.load(fis);

		String browserName = pro.getProperty("broswer");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public String getScreenShot(String testcaseName) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot)driver;
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"//reports//"+testcaseName+".png");
	FileUtils.copyFile(Source, file);
		return System.getProperty("user.dir")+"//reports//"+testcaseName+".png";
	}
	
	@BeforeMethod
	public LandingPage AppLaunching() throws IOException {
		intializerBrowser();
		landingpage = new LandingPage(driver);
		landingpage.GoTo();
		return landingpage;
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

	

}
