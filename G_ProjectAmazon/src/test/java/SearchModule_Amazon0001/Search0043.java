package SearchModule_Amazon0001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search0043 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			driver.get("https://www.amazon.in/?_encoding=UTF8&adgrpid=171770161190&gad_source=1&\"\r\n"
					+ "					+ \"hvadid=714840681071&hvdev=c&hvdvcmdl=&hvlocint=9301536&hvlocphy=9064730&\"\r\n"
					+ "					+ \"hvnetw=g&hvpone=&hvpos=&hvptwo=&hvqmt=e&hvrand=5409130611599224903&hvtargid\"\r\n"
					+ "					+ \"=kwd-3704926535&hydadcr=18657_2389208&mcid=&ref=pd_sl_8lvvl5pp8a_e&tag=\"\r\n"
					+ "					+ \"googinhydr1-21&ref_=nav_ya_signin");

		//tC-0043
		//Search with partial keyword and verify the response that it compeletes it.
			WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
					searchbox.click();
					searchbox.clear();
					searchbox.sendKeys("Curt");
					driver.findElement(By.id("nav-search-submit-button")).click();
					
				WebElement expresult=driver.findElement(By.xpath("//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"]"));
				if(expresult.isDisplayed()) {
					System.out.println("tc-0043 success");
				}else {
					System.out.println("failure");
				}
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		driver.quit();
	}

}}
