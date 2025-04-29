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

public class Screenshot6 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		File R1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\SCREENSHOT\\"+"R1"+".png");
		//File des1 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\.R1.jpg");
		FileHandler.copy(R1, des);
		//FileHandler.copy(R1, des1);
		driver.close();
	}}
