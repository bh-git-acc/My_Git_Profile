package Parameterization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
            WebElement listofcat= driver.findElement(By.id("cat"));
            listofcat.click();
            
           WebElement phone= driver.findElement(By.xpath("//a[contains(text(),\"Phones\")]"));
           phone.click();
           Thread.sleep(2000);
           List<WebElement> items= driver.findElements(By.className("card-block"));
		   System.out.println("phone count"+items.size());

		WebElement laptop= driver.findElement(By.xpath("//a[contains(text(),\"Laptops\")]"));
        phone.click();
        Thread.sleep(2000);
        List<WebElement> items1= driver.findElements(By.className("card-block"));
		System.out.println("laptop count"+items1.size());
		
		WebElement Monitors= driver.findElement(By.xpath("//a[contains(text(),\"Monitors\")]"));
        phone.click();
        Thread.sleep(2000);
        List<WebElement> items2= driver.findElements(By.className("card-block"));
		System.out.println("Monitors count"+items2.size());

		driver.close();
	}

}
