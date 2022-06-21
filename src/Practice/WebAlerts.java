package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
		driver.findElement(By.xpath("//body/main[1]/form[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		Thread.sleep(2000);
		String txt=driver.switchTo().alert().getText();
		System.out.println(txt);
if(txt.contentEquals("Please select start place."))
{
	driver.switchTo().alert().accept();
	System.out.println("Correct alert");
}
		
	}

}
