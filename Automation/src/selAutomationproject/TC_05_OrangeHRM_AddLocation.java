package selAutomationproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_05_OrangeHRM_AddLocation 
{
public static void main(String[] args) throws Exception
{
	//Set the system proprty
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\New chrome download\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,60);
		//Click on URL
			driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//Verify home page is displayed,check title is displayed
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
		{
			System.out.println("Home page is displayed");
		}
		else
		{
			System.out.println("Failed to login");
		}
		
		
		//Verify the username field is displayed
		WebElement objUN=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		if(objUN.isDisplayed())
		{
			System.out.println("Username is displayed");
		}
		//Verify the password field is displayed
		WebElement objPD=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		if(objPD.isDisplayed())
		{
			System.out.println("Password is displayed");
		}
		WebElement objLogin=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));	
		WebElement objclear=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("clear")));	
		if(objLogin.isDisplayed()&&objclear.isDisplayed())
		{
			System.out.println("Login and clear buttons are displayed");
		}
		//Assign values to string variable
		String StrUN="qaplanet1";
		String StrPD="lab1";
		//Login to application
		objUN.sendKeys(StrUN);
		objPD.sendKeys(StrPD);
		objLogin.click();
		//Verify the Orange HRM page is displayed
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
		{
			System.out.println("OrangeHRM page is displayed");
		}
		//Verify the Welcome USERNAME link is displayed
	String wlcmtext=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
	if(wlcmtext.equals("Welcome "+StrUN))
	{
		System.out.println("Welcome " +StrUN+" is displayed");
	}
	//Verify the Change password is displayed
	String chgpwd=driver.findElement(By.xpath("//ul[@id='option-menu']/li[2]/a")).getText();
	if(chgpwd.equals("Change Password"))
	{
		System.out.println("Change Password is displayed");
	}
	//Verify the Logout is displayed
	String logout=driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).getText();
	if(logout.equals("Logout"))
	{
		System.out.println("Logout is displayed");
	}	
	//Focus on ADMIN
	WebElement Admin=driver.findElement(By.id("admin"));
	//Create action
	Actions Action1=new Actions(driver);
	Action1.moveToElement(Admin).perform();
	//Focus on Company Info
	WebElement Companyinfo=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a/span"));
	Thread.sleep(2000);
	Actions Action2=new Actions(driver);
	Action2.moveToElement(Companyinfo).perform();
	//Click on Location
	driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span")).click();
	//Verify the Locations page is displayed
	Thread.sleep(2000);
	//Switch to Add employee frame 
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div/div[2]/form/div[1]/h2"),"Company Info : Locations")))
{
System.out.println("Locations is displayed");			
}
else
{
	System.out.println("Location is not displayed");
}
driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();

driver.findElement(By.id("editBtn")).click();
Alert alert1= wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert();
String stalert=alert1.getText();
System.out.println(stalert);
if(stalert.equals("Please correct the following\n\n- Location Name has to be specified\n- Country should be selected!\n"))

	 
{
	System.out.println("Yes");
	alert1.accept();
}
else
{
	System.out.println("No");
}
	
			
	
	
	
		
	
}
}
