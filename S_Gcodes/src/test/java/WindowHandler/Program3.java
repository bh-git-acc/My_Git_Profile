package WindowHandler;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
	    Thread.sleep(5000);
	    
	    //getwindowhandles();
	    Set<String> WinIds =driver.getWindowHandles();
	    Iterator<String>ID =WinIds.iterator();
	    String P =ID.next();
	    String C =ID.next();
	    for(String WinID : WinIds) {
	    	String title= driver.switchTo().window(WinID).getTitle();
	    	System.out.println(title);
	    	if(title.equalsIgnoreCase("OrangeHRM")||title.equalsIgnoreCase("OrangeHRM HR Software | OrangeHRM")){};
	    driver.switchTo().window(C);
	    driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("TEst@gmail.com");
	    driver.findElement(By.id("Form_submitForm_action_request")).click();
	    driver.quit();
	}

}}
