
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://spicejet.com");  //URL in the browser
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		// Count number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
