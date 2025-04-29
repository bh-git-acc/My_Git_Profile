package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("login1")).sendKeys("Rohit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		
		Alert Pop = driver.switchTo().alert();
		Thread.sleep(3000);
		//Pop.accept();
		String text=Pop.getText();
		System.out.println(text);
		
		//validate
		String exp_result="Please enter your password";
		if(text.equals(exp_result)) {
			System.out.println("corrctresult");
		}else {System.out.println("incorrectResult");}
				
		driver.quit();
		
	}

}
