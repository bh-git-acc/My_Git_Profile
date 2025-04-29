package JavaScriptExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        WebElement Email = driver.findElement(By.id("email"));
        WebElement Pass = driver.findElement(By.id("pass"));
        WebElement Test = driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
       
        js.executeScript("document.getElementById('email').value='Test@gmail.com';");
        js.executeScript("document.getElementById('pass').value='Test@gmail.com';");
        js.executeScript("arguments[0].click()", Test);
        
	}}
