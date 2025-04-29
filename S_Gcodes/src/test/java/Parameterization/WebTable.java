package Parameterization;

import java.util.concurrent.TimeUnit;
import java.lang.NumberFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
public class WebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		int row2= driver.findElements(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr")).size();
		int col2= driver.findElements(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr/th")).size();
		System.out.println(row2);
		System.out.println(col2);
		
		for(int i=2; i<=row2; i++) {
			for(int j=1; j<=col2; j++) {
				
	    String data = driver.findElement(By.xpath("//tbody[@style=\"box-sizing:inherit\"]//tr[" + i + "]/td[" + j + "]")).getText();
		System.out.println(data+" ");
		//if(data.equals("Canada")) {
			//System.out.println(""+i+":"+j);
		}}
			System.out.println();
			driver.close();
		}
	//driver.close();
		
	}
