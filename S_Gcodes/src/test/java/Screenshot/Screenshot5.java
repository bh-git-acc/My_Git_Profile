package Screenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot5 {

	private static final String Timpstamp = null;

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(5000);
		TakesScreenshot Ts = (TakesScreenshot)driver;
		File Source = Ts.getScreenshotAs(OutputType.FILE);
	//	String Timpstamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Date time = new Date(System.currentTimeMillis());
		System.out.println(time+"______");
		String name = "Facebook_"+Timpstamp;
		Path ResoDirectory = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\.automate.jpg");
		String Abpath = ResoDirectory.toFile().getAbsolutePath();
		System.out.println(Abpath);
		String Destpath = Abpath +"//.Screenshots//"+name+".png";
		FileUtils.copyFile(Source, new File(Destpath));
		driver.close();
}}
