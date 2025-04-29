package HomePageUI_Amazon0001;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UI_1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		try{
			driver.get("https://www.amazon.in/?_encoding=UTF8&adgrpid=171770161190&gad"
					+ "_source=1&\\%22\\r\\n%22%20+%20%22+%20\\%22hvadid=714840681071&"
					+ "hvdev=c&hvdvcmdl=&hvlocint=9301536&hvlocphy=9064730&\\%22\\r\\"
					+ "n%22%20+%20%22+%20\\%22hvnetw=g&hvpone=&hvpos=&hvptwo=&hvqmt="
					+ "e&hvrand=5409130611599224903&hvtargid\\%22\\r\\n%22%20+%20%22+%20"
					+ "\\%22=kwd-3704926535&hydadcr=18657_2389208&mcid=&ref=pd_sl_8lvvl5pp8a"
					+ "_e&tag=\\%22\\r\\n%22%20+%20%22+%20\\%22googinhydr1-21&ref_=nav_ya_signin");
//tc-0053 UI_Logodisplay			
			Boolean logo= driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
			if(logo){
				System.out.println("logo is displayed");
			}
//tc-0054 UI_address&contact_displayed&enable
			WebElement addressNcontact= driver.findElement(By.id("nav-global-location-popover-link"));
			addressNcontact.isDisplayed();
			addressNcontact.isEnabled();
			if(addressNcontact.isEnabled()) {
				driver.findElement(By.xpath("//button[@class=\" a-button-close a-declarative\"]")).click();
			}
			System.out.println("addressNcontact displayed, enabled, and closed");
//TC-0055 UI_searchbox_displayed&clickable
			WebElement searchbox= driver.findElement(By.id("nav-search"));
			searchbox.isDisplayed();
			searchbox.click();
			System.out.println("displayed&clickable");
//TC-0056 UI_serchbox_All button clickable&showing all the options
			List<WebElement> ALLbutton= driver.findElements(By.id("searchDropdownBox"));
			for(int i=0; i<=ALLbutton.size(); i++) {
				String values= ALLbutton.get(i).getText();
				System.out.println("All button values"+ values);
				}
//TC-0057 UI_printvalues of countries
			List<WebElement> countrylist= driver.findElements(By.xpath("(//span[@class=\"nav-line-2\"])[1]"));
			WebElement countrylists=driver.findElement(By.xpath("(//span[@class=\"nav-line-2\"])[1]"));
		     Actions act= new Actions(driver);
		     act.moveToElement(countrylists).build().perform();
		     for(int i=0; i<=countrylist.size()-1; i++) {
		    	 String countryvalues= countrylist.get(i).getText();
		     System.out.println("values of country"+ countryvalues);}
//TC-0058 UI_userdetails displayed
		     WebElement userdetail= driver.findElement(By.id("nav-link-accountList"));
		   if(userdetail.isDisplayed()) {
			   System.out.println("userdetailes displayed");
		   };
//TC-0059 UI_Returns&order element displaced
		   WebElement ReturnsNorder =driver.findElement(By.id("nav-orders"));
		   if(ReturnsNorder.isDisplayed()) {
			   System.out.println("ReturnsNorder displayed");
		   };
//TC- 0059 UI_cart element displayed
		   WebElement cart =driver.findElement(By.id("nav-cart"));
		   if(cart.isDisplayed()) {
			   System.out.println("cart is displayed");
		   }
			Thread.sleep(2000);
			}
	   catch(Exception e) {
		   e.printStackTrace();
	   }finally{
		driver.close();}
		

	}
}
