package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, trg).perform();
		
		
		
	}

}
