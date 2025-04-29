package CreatAcc_Amazon0001;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createaccountPageValidate_Amazon0020 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://www.amazon.com/ap/signin?"
				+ "openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%"
				+ "2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2F"
				+ "auth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid"
				+ "_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier"
				+ "_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
//TC-00020 Validation of active links and broken links
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		int brokenlink = 0;
		for (WebElement Link : list) {
			System.out.println(Link.getText());
			String link = Link.getAttribute("href");
			if (link == null || (link.isEmpty())) {
				System.out.println("link is empty");}
			URL LINK = new URL(link);
			HttpURLConnection code = (HttpURLConnection) LINK.openConnection();
			code.connect();
         if (code.getResponseCode() >= 400) {
				System.out.println(code.getRequestMethod() + "is a broken link");
				brokenlink++;
			} else {
				System.out.println(code.getResponseCode() + "is valid link");
			}
		}
		System.out.println("no of broken links="+brokenlink);
	}
}

//		driver.findElement(By.xpath("a[contains(text(),\"Conditions of Use\")]")).click();
//		driver.findElement(By.xpath("(//span[@class=\"a-button-text\"])[1]")).click();
//		boolean ele1= driver.findElement(By.xpath("//div[@class=\"vp-telecine invisible\"]")).isDisplayed();
//		if(ele1) {
//			driver.findElement(By.xpath("//button[@aria-labelledby=\"play-button-tooltip\"]"))
//					.click();
// }
//		driver.findElement(By.xpath("a[contains(text(),\"Privacy Notice\")]")).click();
//		driver.findElement(By.xpath("ab-enhanced-registration-link")).click();
//		driver.findElement(By.xpath("(//a[@class=\"a-link-normal a-nowrap\"])[3]")).click();
