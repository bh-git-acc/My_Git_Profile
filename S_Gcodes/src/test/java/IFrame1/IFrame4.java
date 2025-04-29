package IFrame1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame("iframeResult");
		String Text = driver.findElement(By.xpath("//h2[contains(text(),\"HTML Iframes\")]")).getText();
		
		driver.switchTo().frame(0);
		WebElement T1=driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]"));
		System.out.println(T1.getText());
		
		driver.switchTo().parentFrame();
		WebElement T2 = driver.findElement(By.xpath("//p[contains(text(),\"You can use the height and width attributes to specify the size of the iframe:\")]"));
		System.out.println(T2.getText());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),\"Home\")]")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
}}
