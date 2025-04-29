package WindowHandler;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WH1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
        Thread.sleep(2000);
        
        Set<String> winds= driver.getWindowHandles();
		ArrayList<String> winlist= new ArrayList<String>(winds);
		String parentwin= winlist.get(0);
		String childwin= winlist.get(1);
		System.out.println("parentwin="+ parentwin);
		System.out.println("childwin="+ childwin);
		
		driver.switchTo().window(childwin);
		String CTitle= driver.getTitle();
		System.out.println(CTitle);
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwin);
		String PTitle= driver.getTitle();
		System.out.println(PTitle);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
