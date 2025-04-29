package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		Thread.sleep(5000);
		Js.executeScript("document.documentElement.scrollTop=0","");
		Thread.sleep(5000);
		driver.close();
	}

}
