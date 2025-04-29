package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot4 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        String Test = "Face";
        Screenshot4.Takescreenshot(Test);
      }

	public static void Takescreenshot(String test) throws IOException  {
		String Random= RandomString.make(3);
		TakesScreenshot driver = null;
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Desti =new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\photo1\\"+Random+".jpg");
		FileHandler.copy(Source, Desti);
	}
}