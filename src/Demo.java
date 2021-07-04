import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Demo {
	public static void main (String[] args) 
	
	{
		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://google.com");  // Hit URL on the browser
		//System.out.println(driver.getTitle()); // Validate if title is correct
		//System.out.println(driver.getCurrentUrl()); //Validate if landed on correct URL
		//System.out.println(driver.getPageSource());// Print page source
		//driver.get("https://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close(); // To close the current browser
		//driver.quit();// Close all the browser opened by selenium 
		
		driver.get("https://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("12345");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='u_0_a']/div[3]/a")).click();
	}
}
