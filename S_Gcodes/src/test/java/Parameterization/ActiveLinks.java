package Parameterization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		List<WebElement>Link = driver.findElements(By.tagName("a"));
		System.out.println(Link.size());
		
		for(WebElement Links: Link) {
			System.out.println(Links.getText());
			System.out.println(Links.getAttribute("href"));
		}
		driver.quit();
	}

	
	}


