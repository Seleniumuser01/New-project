package Packageauto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEx 
{
public static void main(String[] args) {
	//Invoke system property
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
//
	ChromeDriver driver=new ChromeDriver();
	//url
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	//Create web element for username
	WebElement objUN=driver.findElement(By.name("txtUserName"));
	//Enter data into ObjUn-User name
	objUN.sendKeys("qaplanet1");
	//Delete the existing username......................
	//Select the existing field
	objUN.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	//Delete the existing data
	objUN.sendKeys(Keys.DELETE);
	//Enter new data
	objUN.sendKeys("sreedhar");
	System.out.println("Execution is successful");
	driver.close();
	driver.quit();
}
}
