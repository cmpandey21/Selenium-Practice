package basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlescreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\basics\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://google.com");
	     driver.manage().window().maximize();
	   
	     WebElement p=driver.findElement(By.name("q"));
	     p.sendKeys("India");
	     
	     
	     WebDriverWait w=new WebDriverWait(driver,5);
	      
	     try {
			  
			  w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
			     p.submit();
			     Thread.sleep(2000);
			     File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      // now copy the  screenshot to desired location using copyFile //method
			     FileUtils.copyFile(shot,new File("E:\\googlesearchresult.jpg"));
			     
			     driver.findElement(By.xpath("//div[@class='yuRUbf']/a/h3[1]")).click();
			     File shot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			     FileUtils.copyFile(shot1, new File("E:\\googlesearchresultlLinkclick.jpg"));
			     
			     driver.close();
		     }
		      
		     catch (IOException e)
		      {
		       System.out.println(e.getMessage());
		       }

	     
	      }


	}
