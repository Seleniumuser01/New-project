package selAutomationproject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_22_VTiger_CreateDocument
{
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\New chrome download\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//Create webdriverwait object
	WebDriverWait wait=new WebDriverWait(driver,60);
	//URL
	driver.get("http://classroom:8888/index.php?action=Login&module=Users");
	//Wait for home page to be displayed
	if(wait.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM")))
	{
		System.out.println("Home page is displayed");
	}
	else
	{
		System.out.println("Home page is not displayed");
	}
	//Verify the USERNAME is displayed
	WebElement objUN=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("user_name")));
	if(objUN.isDisplayed())
	{
		System.out.println("Username is displayed");
	}
	else
	{
		System.out.println("Username is not displayed");
	}	
	//Verify the PASSWORD is displayed
	WebElement objPD=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("user_password")));
	if(objPD.isDisplayed())
	{
		System.out.println("Password is displayed");
	}
	else
	{
		System.out.println("Password is not displayed");
	}
	//Verify the SUBMIT BUTTON is displayed
	WebElement objSubmit=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitButton")));
	if(objSubmit.isDisplayed())
	{
		System.out.println("Submit button is displayed");
	}
	else
	{
		System.out.println("Submit button is not displayed");
	}
	//Assign username and password to String values
	String strUN="qaplanet1";
	String strPD="user1";
	//Enter valid username and password
	objUN.sendKeys(strUN);
	objPD.sendKeys(strPD);
	objSubmit.click();
	Thread.sleep(2000);
	//Verify the admin page is displayed
	if(wait.until(ExpectedConditions.titleIs("user1 - Home - vtiger CRM 5 - Commercial Open Source CRM")))
	{
		System.out.println("Admin page is displayed");
	}
	else
	{
		System.out.println("Failed to login");
		return;
	}
	//Verify the HOME link is displayed
	if(wait.until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("/html/body/table[3]/tbody/tr/td[1]/a"))).isDisplayed())
	{
		System.out.println("Home under Admin page is displayed");
	}
	else
	{
		System.out.println("Home under Admin page is not displayed");
	}
	//Verify the CALENDAR LINK is displayed
	if(wait.until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[2]/a"))).isDisplayed())
	{
		System.out.println("Calendar is displayed");
	}
	else
	{
		System.out.println("Calendar is not displayed");
	}
	//Verify the LEAD link is displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[4]/a"))).isDisplayed())
		{
			System.out.println("Lead is displayed");
		}
		else
		{
			System.out.println("Lead is not displayed");
		}
		//Verify the ORGANIZATION LINK is displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[6]/a"))).isDisplayed())
		{
			System.out.println("ORGANIZATION is displayed");
		}
		else
		{
			System.out.println("Organization is not displayed");
		}	
		//Verify the Contacts displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[8]/a"))).isDisplayed())
		{
			System.out.println("Contacts is displayed");
		}
		else
		{
			System.out.println("Contacts is not displayed");
		}	
		//Verify the Oppurtunities is displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[10]/a"))).isDisplayed())
		{
			System.out.println("Oppurtunities is displayed");
		}
		else
		{
			System.out.println("Oppurtunities is not displayed");
		}		
		//Verify the Products is displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[12]/a"))).isDisplayed())
		{
			System.out.println("Products is displayed");
		}
		else
		{
			System.out.println("Products is not displayed");
		}
		//Verify the Documents is displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
					(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[14]/a"))).isDisplayed())
		{
			System.out.println("Documents is displayed");
		}
		else
		{
			System.out.println("Documents is not displayed");
		}
		//Verify the Email is displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[16]/a"))).isDisplayed())
		{
			System.out.println("Email is displayed");
		}
		else
		{
			System.out.println("Email is not displayed");
		}
		//Verify the trouble tickets is displayed
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
	("body > table.hdrTabBg > tbody > tr > td.small > table > tbody > tr > td:nth-child(14) > a"))).click();
		//Verify trouble tickets module page must be displayed
	if(wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//table[@class='small']/tbody/tr[2]/td/a"))).isDisplayed())	
	{
	System.out.println("Documents module page is displayed");
	}		
	else
	{
	System.out.println("Documents module page is not displayed");
	}	
	//Click on Create Document(+)icon
	wait.until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img"))).click();
	Thread.sleep(2000);
	//Verify Creating New ticket page is displayed
	if(wait.until(ExpectedConditions.textToBePresentInElementLocated
				(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Document")))
	{
		System.out.println("Creating New Document  page is displayed");
	}
	else
	{
		System.out.println("Creating New Document  page is not displayed");
	}	
	driver.findElement(By.xpath
("//*[@id=\"basicTab\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
	
	//Verify the last name empty popup message is displayed
	Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
	if(Alert1.getText().equals("Title cannot be empty"))
	{
		System.out.println("Title cannot be empty message is displayed");
		Alert1.accept();
	}
	else
	{
		System.out.println("Title cannot be empty message is not displayed");
	}
	String strTitle="Title";
	driver.findElement(By.name("notes_title")).sendKeys(strTitle);
	//CREATE ROBOT CLASS
	Robot rt=new Robot();
	StringSelection ss= new StringSelection("gggfkgfdgdfhfgjhfjhufgbdfjkhfkjdhgfodhg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	rt.keyPress(KeyEvent.VK_TAB);
	rt.keyRelease(KeyEvent.VK_TAB);
	rt.delay(1000);
	rt.keyPress(KeyEvent.VK_TAB);
	rt.keyRelease(KeyEvent.VK_TAB);
	rt.delay(1000);
	rt.keyPress(KeyEvent.VK_TAB);
	rt.keyRelease(KeyEvent.VK_TAB);
	rt.delay(1000);
	rt.keyPress(KeyEvent.VK_TAB);
	rt.keyRelease(KeyEvent.VK_TAB);
	rt.delay(1000);
	rt.keyPress(KeyEvent.VK_TAB);
	rt.keyRelease(KeyEvent.VK_TAB);
	rt.delay(1000);
	//---------------------------------------------------------
	//Click on control +V
	rt.keyPress(KeyEvent.VK_CONTROL);
	rt.keyPress(KeyEvent.VK_V);
	rt.keyRelease(KeyEvent.VK_V);
	rt.keyRelease(KeyEvent.VK_CONTROL);
	System.out.println("Entering fields is completed");
	driver.findElement(By.xpath
("//*[@id=\"basicTab\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
	System.out.println("Record is created");
	//Store doc in a string
	String docnumber=driver.findElement(By.xpath("//*[@id=\"tblBasicInformation\"]/table/tbody/tr[2]/td[2]")).getText();
	System.out.println(docnumber);
	
driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[1]/a")).click();
driver.findElement(By.name("search_text")).sendKeys(docnumber);
driver.findElement(By.name("submit")).click();
System.out.println("yes");
Thread.sleep(2000);
String strdocnametable=driver.findElement(By.xpath("//table[@class='lvtBg']/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[3]/td[3]/a")).getText();
System.out.println(strdocnametable);
if(strdocnametable.equals(strTitle))
{
	System.out.println("New document is created");
}
else
{
	System.out.println("New document is not created");
}

	
	
}
}
