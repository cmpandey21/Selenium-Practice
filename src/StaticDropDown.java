import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create driver object for chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				 
				
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				//dropdown with select tag -static 
				WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				
				Select dropdown = new Select(staticDropdown);
				dropdown.selectByIndex(3);
				System.out.println(dropdown.getFirstSelectedOption().getText());
				dropdown.selectByVisibleText("AED");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				dropdown.selectByValue("INR");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
}

}
