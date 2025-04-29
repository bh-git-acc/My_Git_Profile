package SearchModule_Amazon0001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_0060 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		try {
			driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cartbha");
	//tc-0060 to get the quantity of cart
			WebElement cartcount= driver.findElement(By.id("nav-cart-count"));
			cartcount.getText();
			System.out.println("no of items"+ cartcount);
	//TC- 0061 To get each itemstitle name and its quntity.
			List<WebElement> items= driver.findElements(By.xpath("//div[@class=\"a-row sc-list-item sc-java-"
					+ "remote-feature\"]"));
			for(WebElement NameofItems: items) {
				String name= NameofItems.findElement(By.xpath(".//Li")).getText();
				String qnty= NameofItems.findElement(By.xpath(".//div[@aria-label=\"Quantity is 1\"]")).getText();
				
				System.out.println("Item Name "+ NameofItems+" "+"qnty "+qnty);
			}
			
		}
		catch(Exception e) {
			System.out.println("exception"+ e.getMessage());
		}
		finally {
			driver.close();
		}

	}

}
