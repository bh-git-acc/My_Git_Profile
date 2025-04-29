package ListBoxorDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox6 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rohit");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.name("reg_email__")).sendKeys("23456");
		driver.findElement(By.id("password_step_input")).sendKeys("@#$%");
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year =  driver.findElement(By.id("year"));
		
		Select S1 = new Select (Day);
		List<WebElement> D1 = S1.getOptions();
		System.out.println(D1.size()); //31
		for(int i=0; i<D1.size();i++) {
			String Date = D1.get(i).getText();
			if(Date.equals("25")) {
				break;
			}}
		Select S2 = new Select(Month);
		List<WebElement>D2 = S2.getOptions();
		System.out.println(D2.size());
		for(int i=0; i<D2.size(); i++) {
			String Month1 = D2.get(i).getText();
			
			if(Month1.equals("Mar")) {
				D2.get(i).click();
				break;
				}}
	
	    Select S3 = new Select (Year);
	    List<WebElement>D3 = S3.getOptions();
	    System.out.println(D3.size());
	    for(int i=0; i<D3.size(); i++) {
	    	String Year1 = D3.get(i).getText();
	    	
	    	if(Year1.equals("1996")) {
	    		D3.get(i).click();
	    		break;
	    		}}
	
	}}
