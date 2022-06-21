package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://google.com");
	     
	    // File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //  FileUtils.copyFile(shot,new File("E:\\shot.jpg"));
	     
	     File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     try {
	      // now copy the  screenshot to desired location using copyFile //method
	     FileUtils.copyFile(src, new File("E:\\image.png"));
	     }
	      
	     catch (IOException e)
	      {
	       System.out.println(e.getMessage());
	      
	      }
	     
	     driver.findElement(By.name("q")).sendKeys("Best cricketer in india");
	     //driver.findElement(By.linkText('Google Search')).click();
	     driver.findElement(By.xpath("//button[@value='1' and @label='Search']"));
	     
	     
	     File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(shot,new File("E:\\resultaftersearch.jpg"));
	    
	     
	      }


	}


