package CreatAcc_Amazon0001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class creatnewacc_Amazon0001 {

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
		driver.findElement(By.id("createAccountSubmit")).click();
//tc-0001 creation of new acc with valid cridentials
		driver.findElement(By.name("customerName")).sendKeys("abc");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("123$111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Successful creation of newacc of new user on amazon-- tc0001:Success");
//tc-0002 creation of new acc with invalid cridentials--
		// invalid email.id
		driver.findElement(By.name("customerName")).sendKeys("xyz");
		driver.findElement(By.name("email")).sendKeys("1@3#!!@@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("123$111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with invalid input tc0002:Success");
//tc-0003 creation of new acc with invalid cridentials--
		// invalid RETYPE OF PASSWORD
		driver.findElement(By.name("customerName")).sendKeys("pbm");
		driver.findElement(By.name("email")).sendKeys("pbm@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("pBm111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with invalid input tc0003:Success");
//tc-0004 creation of new acc with invalid cridentials--
		// null entry in name field
		driver.findElement(By.name("customerName")).sendKeys("");
		driver.findElement(By.name("email")).sendKeys("pbm@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("pBm111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with null input tc0004:Success");
//tc-0005 creation of new acc with invalid cridentials--
		// null entry in email field
		driver.findElement(By.name("customerName")).sendKeys("pbm");
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.id("ap_password")).sendKeys("pBm111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with null input tc0005:Success");
//tc-0006 creation of new acc with invalid cridentials--
		// null entry in password field
		driver.findElement(By.name("customerName")).sendKeys("pbm");
		driver.findElement(By.name("email")).sendKeys("pbm@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with null input tc0006:Success");
// tc-0007 creation of new acc with invalid cridentials--
		// negative entry
		driver.findElement(By.name("customerName")).sendKeys("pbm");
		driver.findElement(By.name("email")).sendKeys("pbm@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("-123$111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("-123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with negative input tc0007:Success");
//tc-0008 creation of new acc with valid cridentials
		// with valid number
		driver.findElement(By.name("customerName")).sendKeys("abc");
		driver.findElement(By.name("email")).sendKeys("9234785910");
		driver.findElement(By.id("ap_password")).sendKeys("123$111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Successful creation of newacc of new user on amazon-- tc0008:Success");
//tc-0009 creation of new acc with valid cridentials
		// with invalid number
		driver.findElement(By.name("customerName")).sendKeys("abc");
		driver.findElement(By.name("email")).sendKeys("92347859");
		driver.findElement(By.id("ap_password")).sendKeys("123$111Pass");
		driver.findElement(By.id("ap_password_check")).sendKeys("123$111Pass");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with invalid input tc0009:Success");
//tc-0010 creation of new acc with valid cridentials
		// with typing same text written above text fields
		driver.findElement(By.name("customerName")).sendKeys("Your name");
		driver.findElement(By.name("email")).sendKeys("Mobile number or email");
		driver.findElement(By.id("ap_password")).sendKeys("Password");
		driver.findElement(By.id("ap_password_check")).sendKeys("Re-enter Password");
		driver.findElement(By.id("continue")).click();
		System.out.println("Failure creation of newacc of new user with invalid input tc0010:Success");
		driver.quit();
	}

}
