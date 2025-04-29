package WindowHandler;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac_WH {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
		Thread.sleep(4000);
		
		Set<String>page1= driver.getWindowHandles();
		ArrayList<String> list= new ArrayList<String>(page1);
		Thread.sleep(4000);
		
		String parent= list.get(0);
		Thread.sleep(4000);
		String parentTitle= driver.getTitle();
		
		String child= list.get(1);
		Thread.sleep(4000);
		String childTitle= driver.getTitle();

		System.out.println("parent"+parent);
		System.out.println("Ptitle="+parentTitle);
		System.out.println("child"+child);
		System.out.println("Ctitle="+childTitle);
		
		driver.close();
		


		
	}

}
