package selAutomationproject;

import java.sql.Timestamp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_02_Add_Employee 
{
	

	public static void main(String[] args) throws Exception
	{
		
	//Set the system proprty
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	//Create a wedriver chrome object
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

//CLICK ON ADD EMPLOYEE LINK
WebElement objPIM=driver.findElement(By.id("pim"));
//Create action
Actions Action=new Actions(driver);
Action.moveToElement(objPIM).perform();
//click on Add employee
driver.findElement(By.linkText("Add Employee")).click();
Thread.sleep(2000);
System.out.println("Add employee window is displayed");
//Switch to Add employee frame 
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
//Verify the PIM : Add Employee frame is displayed
if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee"))
		{
	System.out.println("PIM : Add Employee window is displayed");
		}
Timestamp timestamp = new Timestamp(System.currentTimeMillis());
System.out.println(timestamp);
String sFirstName="sfirst";
String sLastName="sLast";
//Last name with timestamp
String sLastNamewithTime=sLastName+timestamp;
System.out.println(sLastNamewithTime);


//-----------------------------------------------------------------------
//Get employee code
String strEmpCode=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
//Create webelement
WebElement objSave=driver.findElement(By.id("btnEdit"));
//Click on save
objSave.click();
Alert A=wait.until(ExpectedConditions.alertIsPresent());
//Verify Last Name Empty!message
if(A.getText().equals("Last Name Empty!"))
{
	System.out.println("Last Name Empty! displayed");
	A.accept();
	//Enter last name
	driver.findElement(By.name("txtEmpLastName")).sendKeys(sLastNamewithTime);
}
//Click on save
objSave.click();
//wait for alert displayed
Alert Alert2=wait.until(ExpectedConditions.alertIsPresent());
//Verify First Name Empty!message
if(Alert2.getText().equals("First Name Empty!"))
{
	System.out.println("First Name Empty! displayed");
	Alert2.accept();
	//Enter last name
	driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFirstName);
}	
//Click on save
objSave.click();
//wait for Personal Details and verify
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "Personal Details")))
{
	System.out.println("Personal Details displayed");
}
//Switch to parent frame
driver.switchTo().parentFrame();
//---------------------------------------------------------------------
//Mouse over on PIM
Action.moveToElement(objPIM).perform();
//Click on Employee List
driver.findElement(By.linkText("Employee List")).click();
//wait for frame and switch to it
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
//Verify Employee Information
if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
{
	System.out.println("Employee Information");
}		

String strEmpName_Sibling=driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),"+strEmpCode+")]/following-sibling::td/a")).getText();
if(strEmpName_Sibling.equals(sFirstName+" "+sLastNamewithTime))
{
	System.out.println(strEmpName_Sibling+" displayed");
}
//---------------------------------------------------------------
//Switch to default content
driver.switchTo().defaultContent();
//-------------------------------------------------------------------
//Click on logout
driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
//Verify home page
if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
{
	System.out.println("Signoff sucessfull & Home page displayed");
}
else
{
	System.out.println("Failed to Signoff");
	return;
}		
//-----------------------------------------------------------------------------
driver.close();
driver.quit();


}

}







			
	
	
	
