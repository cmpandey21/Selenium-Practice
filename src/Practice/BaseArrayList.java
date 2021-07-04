package Practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Cauliflower", "Brocolli", "Beetroot" };
		int count = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			// Broccoli - 1 Kg
			// Broccoli, 1 kg
			String[] name = products.get(i).getText().split("-");
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			String formattedName = name[0].trim();

			if (itemsNeededList.contains(formattedName)) {
				// click add to cart
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (count == itemsNeeded.length) {
					break;
				}
			}
		}
	}

}