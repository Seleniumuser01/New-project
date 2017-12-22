package Packageauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverEx 
{
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//URL
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	//Username
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	//Password
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	//Login click
	driver.findElement(By.name("Submit")).click();
	//Create actions class
	Actions A=new Actions(driver);
	//Create a webelement for the item pim we want for mouse over
	WebElement PIM=driver.findElement(By.id("pim"));
	//Move to that web element created
	A.moveToElement(PIM).perform();
	//click on the link under the pim mouse over
	driver.findElement(By.linkText("Add Employee")).click();
	//Close and quit
	Thread.sleep(2000);
	System.out.println("Add employee window is displayed");
	driver.close();
	driver.quit();	
}
}
