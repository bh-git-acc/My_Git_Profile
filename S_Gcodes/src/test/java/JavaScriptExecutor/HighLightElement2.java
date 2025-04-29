package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighLightElement2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        WebElement Email = driver.findElement(By.id("email"));
        WebElement Pass = driver.findElement(By.id("pass"));
        
        HighLightElement2.drawborder(driver, ele);
        HighLightElement2.drawborder(driver, Email);
        HighLightElement2.drawborder(driver, Pass);
    
        Thread.sleep(5000);
        driver.quit();
	}
     
	public static void drawborder(WebDriver driver, WebElement element) {
          
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("arguments[0].style.border='5px solid red'", element);
		Js.executeScript("arguments[0].style.background='yellow'", element);
		
		
		
	}

}
