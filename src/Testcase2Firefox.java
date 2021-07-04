import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testcase2Firefox {
public static void main (String[] args) 
	
	{
		// Create driver object for Firefox browser
	   // Gecko driver
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Pandey");
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}
}
