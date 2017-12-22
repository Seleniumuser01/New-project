package Packageauto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleEx {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//URL
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("QA hrm");
		WebElement objSearch=driver.findElement(By.name("btnK"));
		objSearch.sendKeys(Keys.ENTER);
		
	System.out.println("Sucess");
		
		
		driver.close();
		driver.quit();
		
	}

}
