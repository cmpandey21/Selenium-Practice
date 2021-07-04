import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Salsforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create driver object for chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				 
				
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("uername")).sendKeys("hello");
				driver.findElement(By.name("pw")).sendKeys("123456");
				//driver.findElement(By.className("input r4 wide mb16 mt8 username")).click(); // Error
                driver.findElement(By.xpath("//*[@id='Login']")).click();// Xpath
	}

}
