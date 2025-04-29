package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShot3 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement FacebookLogo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		File Sou = ((TakesScreenshot)FacebookLogo).getScreenshotAs(OutputType.FILE);
		String random =  RandomString.make(7);
		String Facebook = " New FacebookLogo";
		
		//File Dest = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\"+Facebook+"_"+Random+".png");
		File Dest1 = new File("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\SCREENSHOT\\"+Facebook+"_"+random+".png");
		FileHandler.copy(Sou, Dest1);
		driver.close();
	}}
