package Practice;
import java.util.*;
import java.util.List;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		// xpath self
		String self = driver.findElement(By.xpath("//a[contains(text(),'Welspun Enterprises')]/self::a")).getText();
		System.out.println(self);

		// parent
		//String parent1 = driver.findElement(By.xpath("//a[contains(text(),'Welspun Enterprises']/parent::td")).getText();
		//System.out.println(parent1);

		// child
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Welspun Enterprises')]/ancestor::tr/child::td"));
		System.out.println(childs.size());
		for(int i=0;i<childs.size();i++)
		{
			String S=childs.get(i).getText();
			System.out.print(S);
		}
		
		//ancestor
		String ancestor=driver.findElement(By.xpath("//a[contains(text(),'Welspun Enterprises')]/ancestor::tr")).getText();
		System.out.println(ancestor);
		
	}
	
	

}
