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

public class Screenshot7 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement mmt =driver.findElement(By.xpath("//div[@class=\"widgetLoader landingSearchWidget IN\"]"));
        File Source = ((TakesScreenshot)mmt).getScreenshotAs(OutputType.FILE);
		File Source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest1= new File("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\SCREENSHOT\\"+"mm1"+".jpg");
		File dest2= new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\mmt1.jpg");
		
		FileHandler.copy(Source, dest1);
		FileHandler.copy(Source, dest2);
		FileHandler.copy(Source1, dest1);
		FileHandler.copy(Source1, dest2);
		
		driver.close();
		
}}

