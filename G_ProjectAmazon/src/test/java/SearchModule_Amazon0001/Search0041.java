package SearchModule_Amazon0001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search0041 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	try{
		driver.get("https://www.amazon.in/?_encoding=UTF8&adgrpid=171770161190&gad_source=1&"
	
			+ "hvadid=714840681071&hvdev=c&hvdvcmdl=&hvlocint=9301536&hvlocphy=9064730&"
			+ "hvnetw=g&hvpone=&hvpos=&hvptwo=&hvqmt=e&hvrand=5409130611599224903&hvtargid"
			+ "=kwd-3704926535&hydadcr=18657_2389208&mcid=&ref=pd_sl_8lvvl5pp8a_e&tag="
			+ "googinhydr1-21&ref_=nav_ya_signin");
//TC-0041 Search for valid keywords of product name
	
	WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
	ele.sendKeys("laptop mouse");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	List<WebElement> productlist= driver.findElements(By.xpath("//h2[@class=\"a-size-medium a-spacing-none a-color-base a-text-normal\"]"));
	
	if(!productlist.isEmpty()) {
		System.out.println("TC-0041-SUCCESS"+"SIZE= "+ productlist.size());
	}
	else {
		System.out.println("failed");
	}}
	catch(Exception e){
		e.printStackTrace();
		} 
	finally{
			driver.quit();
		}

	}
}
