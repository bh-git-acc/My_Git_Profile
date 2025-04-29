package IFrame1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Mainpage //to switch focus from main to iframe page
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(5000);
		boolean Test =  driver.findElement(By.id("demo")).isDisplayed();
		if(Test ==true) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case filed");}
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("tryhome")).click();
		Thread.sleep(5000);
		System.out.println("Exceution completed");
		driver.close();
	}

}
