package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		List<WebElement> list=driver.findElements(By.xpath("//span[@data-name='gender_wrapper']/span"));
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i).getText();
		System.out.println(s);
		if(s.contains("Male"))
		{
				list.get(i).click();
				
		}}
		Thread.sleep(1000);
		driver.close();
		
	}

}
