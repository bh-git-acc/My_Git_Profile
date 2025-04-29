package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShot2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		File S1 = (File)((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(3);
		String ImgName = "DemoAutomationSite";
		File S3 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\"+ImgName+"_"+Random+".jpg");
	    FileHandler.copy(S1, S3);
	    driver.close();
	
}}
