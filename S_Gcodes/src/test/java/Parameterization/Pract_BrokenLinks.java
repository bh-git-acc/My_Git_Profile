package Parameterization;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pract_BrokenLinks {

	public static void main(String[] args) throws IOException {
	 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> link= driver.findElements(By.tagName("a"));
		int brokenlinks=0;
		for(WebElement links: link) {
		String url= links.getAttribute("href");
		
		if(url == null|| url.isEmpty()) {
			System.out.println("Links are empty");
		}
		
		URL Links = new URL(url);
		HttpURLConnection http= (HttpURLConnection)Links.openConnection();
		http.connect();
		
		if(http.getResponseCode()>=400) {
			System.out.println("Links are broken");
			brokenlinks++;
		}else {
			System.out.println("Links are valid");
		}
		}
		System.out.println("no of brokenlinks"+"="+brokenlinks);
        driver.quit();
	}
}
