package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {

		//Authentication Popup
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("admin");
		alt.sendKeys("admin");
		
//		WebElement Test = driver.findElement(By.xpath("//p[contains(text(),\"    Congratulations! You must have the proper credentials.\")]");
//		System.out.println(Test);
		
	}

}
