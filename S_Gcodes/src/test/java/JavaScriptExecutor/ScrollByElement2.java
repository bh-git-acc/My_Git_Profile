package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByElement2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
	    WebElement Sign = driver.findElement(By.xpath("//h3[contains(text(),\"3. Design horizontal scrollbars like vertical scrollbars.\")]"));
	    JavascriptExecutor Js=(JavascriptExecutor)driver;
	    Js.executeScript("arguments[0].scrollIntoView();", Sign);
	    Thread.sleep(5000);
	    
	
	
	}

}
