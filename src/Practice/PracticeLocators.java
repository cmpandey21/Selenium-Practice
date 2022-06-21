package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		try {
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Chandramohan@123facebook.com");
		driver.findElement(By.linkText("Learn more")).click();
		}
		catch(NoSuchElementException E)
		{
			System.out.println("Please use the correct Locator");
			
		}
		catch(Exception E){
			System.out.println("This is the exception, please have look: "+ E);
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();

	}

}
