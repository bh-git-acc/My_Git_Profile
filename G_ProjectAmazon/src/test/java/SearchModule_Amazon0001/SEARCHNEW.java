package SearchModule_Amazon0001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SEARCHNEW {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			driver.get("https://www.amazon.in/?_encoding=UTF8&adgrpid=171770161190&gad_source=1&"
					+ "hvadid=714840681071&hvdev=c&hvdvcmdl=&hvlocint=9301536&hvlocphy=9064730&"
					+ "hvnetw=g&hvpone=&hvpos=&hvptwo=&hvqmt=e&hvrand=5409130611599224903&hvtargid"
					+ "=kwd-3704926535&hydadcr=18657_2389208&mcid=&ref=pd_sl_8lvvl5pp8a_e&tag="
					+ "googinhydr1-21&ref_=nav_ya_signin");

			// Perform Search Operation
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox")); 
			searchBox.sendKeys("Nike Shoes");
			driver.findElement(By.id("nav-search-submit-button")).click(); 
			Thread.sleep(3000);

			List<WebElement> listofproduct = driver
					.findElements(By.xpath("//h2[@class=\"a-size-mini s-line-clamp-1\"]"));

			if (!listofproduct.isEmpty()) {
				System.out.println("Passed" + "size= " + listofproduct.size());
			} else {
				System.out.println("empty/failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

}
