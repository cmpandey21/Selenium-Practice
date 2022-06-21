package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		try {
			//===================================================================================day
		WebElement day=driver.findElement(By.id("day"));
		Select dropdown=new Select(day);
		dropdown.selectByValue("21");
		
		//======================================================================================
		//If we want to check all values present n dropdown option
		
		List<WebElement> list=dropdown.getOptions();
		for(int i=0;i<list.size();i++)
		{
			String dropdownvalue=list.get(i).getText();
			System.out.println(dropdownvalue);
			if(list.get(i).getText()=="21")
			{
				list.get(i).click(); 	
			}
		    
		}
		
		
		//==========================================================================================Month
		WebElement month=driver.findElement(By.id("month"));
		Select dropdown1=new Select(month);
		dropdown1.selectByVisibleText("Mar");
		//==============================================================================================Year
		WebElement year=driver.findElement(By.id("year"));
		Select dropdown2=new Select(year);
		dropdown2.selectByValue("1997");

		
		}
		catch(NoSuchElementException E)
		{
			System.out.println("Please use the correct Locator");
			
		}
		catch(Exception E){
			System.out.println("This is the exception, please have look: "+ E);
		}
	}

}
