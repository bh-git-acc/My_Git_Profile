package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HorScroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/scroll/");
	     
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),\"Datatable horizontal and vertical scroll\")]"));
	    JavascriptExecutor Js =(JavascriptExecutor)driver;
	    Js.executeScript("arguments[0].scrollIntoView();", ele);
	    Thread.sleep(5000);
	    WebElement Test =driver.findElement(By.xpath("//td[contains(text(),'t.nixon@datatables.net')]"));
	    Js.executeScript("arguments[0].scrollIntoView();", Test);
	
	    
	
	}

}
