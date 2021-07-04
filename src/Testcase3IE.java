import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testcase3IE {
public static void main (String[] args) 
	
	{
		// Create driver object for internet explorer browser
	   // IE driver
	
		System.setProperty("webdriver.IE.driver","C:\\Users\\USER\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new  InternetExplorerDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());	
	}
}
