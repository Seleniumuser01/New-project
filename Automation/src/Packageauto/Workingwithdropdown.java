package Packageauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workingwithdropdown
{
public static void main(String[] args) throws Exception
{
	
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//url
		driver.get("http://apps.qaplanet.in/WebApp/SelectAWebSite.html");
		Thread.sleep(2000);
		//Create web element fro dropdown
		WebElement E=driver.findElement(By.name("OptWeb"));
		//CREATE SELECT OBJECT
	Select sel=new Select(E);
		//SELECT by visible text
		sel.selectByVisibleText("QAPlanet");
		Thread.sleep(5000);
		//SELECT by Index
		sel.selectByIndex(3);
		Thread.sleep(5000);
		//SELECT by Value property
		sel.selectByValue("Google");
		Thread.sleep(5000);
		
		
	
}
}
