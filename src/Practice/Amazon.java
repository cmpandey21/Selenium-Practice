package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\USER\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://www.amazon.in/");


driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");

driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();	


}}
