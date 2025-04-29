package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Alert Pop=driver.switchTo().alert();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		Pop.accept();
		Thread.sleep(2000); 
		String text = driver.findElement(By.id("result")).getText();
		String Exp_result="You successfully clicked an alert";
		if(text.equals(Exp_result)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("incorrect text");
		}
		driver.quit();
		}}
