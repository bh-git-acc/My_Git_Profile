package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopup {

	public static void main(String[] args) {
//Permission  Popup
		 
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifiations");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
	}

}
