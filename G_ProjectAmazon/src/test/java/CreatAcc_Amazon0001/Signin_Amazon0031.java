package CreatAcc_Amazon0001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin_Amazon0031 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/ap/signin?"
				+ "openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%"
				+ "2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2F"
				+ "auth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid"
				+ "_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier"
				+ "_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
//tc-0031 sign in with incorrect credentials
//		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys("123$111Pass");
//		driver.findElement(By.id("signInSubmit")).click();
//		System.out.println("Failed to signin tc-0031-Success");
//tc-0032 signin with correct credentials
		driver.findElement(By.name("email")).sendKeys("madhulika.bhalerao79.mb@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("amazonpassword");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("successfully signin tc-0032-Success");
		driver.quit();
		
	}}
