import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com");

		// customized xpath
		/*
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hi");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */
		// Customized CSS
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8699234658");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_97w4']")).click();
		driver.findElement(By.xpath("//button[@name='reset_action']")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
