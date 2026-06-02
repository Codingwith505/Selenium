import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// switch multiple window/ tab
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// call new empty window
		driver.switchTo().newWindow(WindowType.WINDOW);
		// now get find windowId for accessing in new empty window
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		// now access the new window to use the above windowId
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com/");
		String value = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1)
				.getText();
		// back to parent window to use parentwindowID
		driver.switchTo().window(parentWindowId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(value);
		// verify that get input text with screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		//save the screenshot with FileUtils and pass the path of the file 
		FileUtils.copyFile(file, new File("C:\\Users\\v-susmaurya\\logo.png"));
		// get height and width for that inputwebelement 
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		driver.quit();
	}

}
