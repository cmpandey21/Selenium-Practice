package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\basics\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://google.com");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("MS Dhoni");
	     
	     
	    // driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]/center/input")).submit();
	     
	     //List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]/div/span"));
	    Thread.sleep(2000);
	    
	     List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
        
	     
	     System.out.println(list.size());
    
         for(int i=0;i<list.size();i++)
         {
        	 String webtext=list.get(i).getText();
        	 System.out.println(webtext);
        	 if(webtext.contains("dhoni movie")) {
        		 list.get(i).click();
        		 break;
        	 }
         }
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@class='yuRUbf']/a/descendant::h3[@Class='LC20lb DKV0Md']")).click();
        
       
	}}
