import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com");

		// customized xpath
		/*
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hi");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */
		// Customized CSS
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("email");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
