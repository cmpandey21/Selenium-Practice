package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCheckbox {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]"))
					.click();
			File shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(shot, new File("C:\\Users\\USER\\Desktop\\AmazonSelectedCheckbox.jpg"));
			driver.close();

		} catch (NoSuchElementException E) {
			System.out.println("Please use the correct Locator");

		}
	}

}
