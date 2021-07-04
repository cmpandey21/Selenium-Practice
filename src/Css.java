import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create driver object for chrome browser

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				 
				
				driver.get("https://login.salesforce.com");
			/*	
				        xpath= //tagname[@attribute='value']
						css= tagname[attribute='value']
						css= [class='identity first']
						xpath= //*[@class='identity first']             */
				
				

      driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Mohan");
	}

}
