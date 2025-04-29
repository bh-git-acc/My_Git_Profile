package HomePageUI_Amazon0001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		try {
			driver.get("https://www.amazon.com/ap/signin");
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("madhulika.bhalerao.79.mb@gmail.com");
			driver.findElement(By.name("password")).sendKeys("madhulika");
			driver.findElement(By.id("signInSubmit")).click();
		}
		catch(Exception e) {
			System.out.println("exception"+ e.getMessage());
		}
		finally {
			driver.close();
		}

}}
