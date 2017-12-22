package selAutomationproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_9_VTigerCRM_EditContact {
	

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
//Click on the Contacts link
WebElement objContact=driver.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[8]/a"));
objContact.click();
Thread.sleep(2000);
//Verify the contacts page is displayed
if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
{
System.out.println("Contacts page is displayed");		
}
else
{
	System.out.println("Contacts page is not displayed");	
}
//Click on Create Contacts (+) button
driver.findElement(By.xpath
	("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
Thread.sleep(2000);
//Verify the Creating New Contact page must be displayed
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
		("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Contact")))
{
System.out.println("Creating New Contact page is displayed");		
}
else
{
System.out.println("Creating New Contact page is not displayed");	
}	
//Leave all fields blank and Click on save button
driver.findElement(By.xpath
("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
if(Alert1.getText().equals("Last Name cannot be empty"))
{
	System.out.println("Last Name cannot be empty message is displayed");
	Alert1.accept();
	}
	else
	{
	System.out.println("Last Name cannot be empty message is not displayed");	
	}
//Create webelement for Last Name
String strLastName="Contact1223";
WebElement objLastName=driver.findElement(By.name("lastname"));
objLastName.sendKeys(strLastName);
driver.findElement(By.xpath
("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
Thread.sleep(2000);

//NEWLY CREATED CONTACT ID
String strContactId=driver.findElement(By.xpath("//*[@id='tblContactInformation']/table/tbody/tr[1]/td[4]")).getText();
System.out.println(strContactId);
//Click on contacts link in contact info page
driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[1]/a")).click();
//Verify Contacts module page must be displayed
if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
{
System.out.println("Contacts module page is displayed ");
}
else
{
	System.out.println("Contacts module page is not displayed ");	
}
//Step 4:Don’t Select the record in the grid and click on Mass Edit button
		WebElement objMassEditBtn=driver.findElement
				(By.xpath("//*[@id=\"massdelete\"]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[2]"));
		objMassEditBtn.click();
		Thread.sleep(5000);
		//Step 4: Verify the alert message as "Please select at least one entity"
	  Alert Alert2=wait.until(ExpectedConditions.alertIsPresent());
	  if(Alert2.getText().equals("Please select at least one entity"))
	  {
		  System.out.println("Please select at least one entity message is displayed");
		  Alert2.accept();
	  }
	  else
	  {
		  System.out.println("Please select at least one entity message is not displayed");
	  }

	  //Step 5:Check the record in the grid and click on Mass Edit button
	  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[1]")).click();
	  //click on Mass Edit button
	  objMassEditBtn.click();
	  //Verify the Mass Edit - Records Fields page should be displayed
	  Thread.sleep(2000);
		//  Step 6:Click on cancel button in the Mass Edit - Records Fields page  
	      //   Verify Organization module page must be displayed
	  WebElement objCancel=driver.findElement(By.xpath("//*[@id='massedit_form']/table[2]/tbody/tr/td/input[2]"));
	  objCancel.click();
	  Thread.sleep(2000);
	//Verify Contacts module page must be displayed
	  if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
	  {
	  System.out.println("Contacts module page is displayed ");
	  }
	  else
	  {
	  	System.out.println("Contacts module page is not displayed ");	
	  }

	  WebElement objSearchfor=driver.findElement(By.name("search_text"));
	  System.out.println("search");
	  WebElement objSearchnow=driver.findElement(By.xpath("//*[@id=\"searchAcc\"]/form/table/tbody/tr[1]/td[6]/input"));
	  System.out.println("searchnow");
	  objSearchfor.sendKeys(strContactId);
	  objSearchnow.click();
	  Thread.sleep(2000);
	 //Select the checkbox
	  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[1]")).click();
	  Thread.sleep(2000);
	  //Click on the edit button in actions column
	 driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[10]/a")).click();
	  
	  //...........Verify the Editing Contacts Information page must be displayed........................//
	  String strcontactinfo=driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span")).getText();
	  System.out.println(strcontactinfo);
	if(strcontactinfo.equals("["+strContactId+" ] "+strLastName+" - Editing Contact Information"))
	//if(strNewOrgInfo.equals("["+objOrgNo+" ] "+strOrgName+" - Organization Information"))		
		 {
			System.out.println("Editing Contact Information page is displayed");
	      }
	else
	{
		System.out.println("Editing Contact Information page is not displayed");
	}
	//Create webelements for Last name
	String strNewLastName="EY";
	WebElement objLastNameEdited=driver.findElement(By.name("lastname"));
	
	//Enter new values to Org name and bill city
	objLastNameEdited.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	objLastNameEdited.sendKeys(Keys.DELETE);
	objLastNameEdited.sendKeys(strNewLastName);
	//Click on save
	driver.findElement(By.name("button")).click();
	Thread.sleep(2000);
	System.out.println("Record is edited");
	//Search for the id
	driver.findElement(By.name("search_text")).sendKeys(strContactId);
	driver.findElement(By.xpath("//*[@id=\"searchAcc\"]/form/table/tbody/tr[1]/td[6]/input")).click();
	  Thread.sleep(2000);
	  String strLast=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[4]/a")).getText();
			  
	  if(strLast.equals(strNewLastName))
	  {
		  System.out.println("Record is edited");
	  }
	  else
	  {
		  System.out.println("Record is not edited"); 
	  }
	  driver.quit();
	  driver.close();
}
}
