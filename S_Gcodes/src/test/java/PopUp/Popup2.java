package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Alert pop= driver.switchTo().alert();
		Thread.sleep(5000);
		pop.dismiss();
		String text= driver.findElement(By.id("result")).getText();
		Thread.sleep(2000);

		String exp_result="You successfully clicked an alert";
		if(text.equals(exp_result)) {
			System.out.println("correctText");
		} else { System.out.println("incorrectText");}
	
		driver.quit();
	}

}
