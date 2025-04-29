package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		File S1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(S1);
		File S2 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\2.jpg");
		File S3 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\1.jpg");
	    FileHandler.copy(S1, S3);
		FileHandler.copy(S1, S2);
		driver.close();
	}}
