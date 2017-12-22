package Packageauto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitcommands {
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		//Create a webdriver object
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,60);
		//Open url
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//Wait for Title
		boolean res1=wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//print result for title
		if(res1)
		{
			System.out.println("Title is displayed");
		}
	//Wait for partial title
		boolean res2=wait.until(ExpectedConditions.titleContains("Orange"));
				//Print result for partial title
				if(res2)
				{
			System.out.println("Partial title is displayed");
				}
		WebElement res3=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		//print result for Login using By.name property
			if(res3.isDisplayed())
			{
				System.out.println("Login is displayed");
			}
			//Wait for element to be clickable by id
			WebElement res4=wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
			//Print displayed
			if(res4.isEnabled())
			{
				System.out.println("Login button is enabled");
			}
		
	
			driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
			driver.findElement(By.name("Submit")).click();	
		//To wait for alert is present
			Alert A=wait.until(ExpectedConditions.alertIsPresent());
			if(A.getText().equals("Password not given!"))
			{
				System.out.println("Please enter password");
				A.accept();
			}
			else
			{
				System.out.println("Alert is not displayed");
			}
			driver.findElement(By.name("txtPassword")).sendKeys("lab1");
			driver.findElement(By.name("Submit")).click();	
			
	    boolean res5=wait.until(ExpectedConditions.textToBePresentInElementLocated
	    		(By.xpath("//div[@id='option-menu-bar']/ul/li[1]"),"Welcome qaplanet1"));
		//Print result for text to be present
		if(res5)
		{
			System.out.println("Welcome qa planet is displayed");
		}
			
			
			Thread.sleep(5000);
			String a=driver.findElement(By.xpath("//div[@id='option-menu-bar']/ul[@id='option-menu']/li[1]")).getText();
			System.out.println(a);
	
	
	}
}
