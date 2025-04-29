package Parameterization;

import java.io.IOException;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.HttpURLConnection;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/status_codes");
		
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		int brokenlink=0;
		for(WebElement element: Links) {
			String url= element.getAttribute("href");
			{
				if(url == null|| url.isEmpty()){
					System.out.println("URL is empty");
				}
			URL Link =new URL(url);
			//@SuppressWarnings("restriction")
            HttpURLConnection httpcode=( HttpURLConnection) Link.openConnection();
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400){
				System.out.println(httpcode.getResponseCode()+"="+url+" is a broken link");
				brokenlink++;
			}else {
				System.out.println(httpcode.getResponseCode()+"="+url+" is a valid link");
			}}}
		System.out.println("Nos. of broken links="+ brokenlink);
		driver.close();
	        }}
