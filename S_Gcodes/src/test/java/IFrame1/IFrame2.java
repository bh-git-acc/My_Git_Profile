package IFrame1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("SingleFrame");
		//nosuchexception
		WebElement Demo=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Demo.sendKeys("Automation Testing");
		Thread.sleep(2000);
		//if we use driver.switchto.default() then it will navigate from any child to main page.
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),\"Home\")]")).click();
		driver.switchTo().parentFrame();
		//driver.close();
	}}
