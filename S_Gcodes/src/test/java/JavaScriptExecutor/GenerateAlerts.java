package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerateAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		boolean ele= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
		System.out.println(ele);
		//GenerateAlerts.GAlerts(driver,"Hello Good evening");
		//Thread.sleep(5000);
	    GenerateAlerts.GAlerts(driver,"Automation testing");
		Thread.sleep(5000);
    }

	public static void GAlerts(WebDriver driver, String Message) {

		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("alert('"+Message+"')");
	}

}
