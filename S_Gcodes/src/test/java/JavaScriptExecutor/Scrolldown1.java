package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		//driver.get("https://www.w3schools.com/");
		JavascriptExecutor Js= (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,8000)","");
		Thread.sleep(5000);
		Js.executeScript("window.scrollBy(0,-8000)","");
		Thread.sleep(5000);
		//Js.executeScript("window.scrollBy(500,0)");
		//driver.close();
	}

}
