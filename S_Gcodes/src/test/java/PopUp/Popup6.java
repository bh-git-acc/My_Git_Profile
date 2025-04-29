package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup6 {

	public static void main(String[] args) throws InterruptedException {
//FileUpload Popup
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("E:\\SOFTWARE TESTING\\Automation\\WhatsApp Image 2024-01-06 at 2.00.50 AM.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		
	}}
