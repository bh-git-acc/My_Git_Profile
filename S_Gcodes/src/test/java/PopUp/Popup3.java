package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Alert Pop= driver.switchTo().alert();
		Thread.sleep(2000);
		Pop.sendKeys("Welcome");
		Thread.sleep(2000);
        Pop.accept();
		
		String text=driver.findElement(By.id("result")).getText();
		System.out.println(text);
		//validate
		String exp_output = "You entered: Welcome";
		if(text.equals(exp_output)) {
			System.out.println("correct text");
		}else {System.out.println("incorrect text");}
				
		driver.quit();
		
	}}
