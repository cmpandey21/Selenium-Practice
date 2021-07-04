import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class rediffend2end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create driver object for chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				 
				
				driver.get("https://rediff.com");
				driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
				driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
				driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
				driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
				
				
				//Parent-child relation Xpath - Define xpath for parent/tag names
				
				driver.get("https://www.google.com/");
				//driver.findElement(By.xpath("//div[@class='SDkEP']/div/div[2]/input")).sendKeys("cricket");
				
				
	}

}
