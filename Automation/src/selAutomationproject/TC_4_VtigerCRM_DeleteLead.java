package selAutomationproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_4_VtigerCRM_DeleteLead {
	
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
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
		
	//Click on the Lead module link
	wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[4]/a"))).click();
	//Verify Lead module page must be displayed
	if(wait.until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//table[@class='small']/tbody/tr[2]/td/a"))).isDisplayed())	
		{
		System.out.println("Leads module page is displayed");
		}
	else
	{
		System.out.println("Leads module page is not displayed");
	}
	
	
/*	Step 4:Don’t Select the record in the grid and click on Delete button*/
	WebElement objDelete=driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[1]"));
	objDelete.click();
	//Step 4: Verify the alert message as "Please select at least one entity"
	  Alert A=wait.until(ExpectedConditions.alertIsPresent());
	  if(A.getText().equals("Please select at least one entity"))
	  {
		  System.out.println("Please select at least one entity message is displayed");
		  A.accept();
	  }
	  else
	  {
		  System.out.println("Please select at least one entity message is not displayed");
	  }
	  
	//Click on Create Lead(+)icon
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//table[@class='small']/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img"))).click();
		Thread.sleep(2000);
		//Verify Creating New Lead page is displayed
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated
					(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Lead")))
		{
			System.out.println("Creating New Lead page is displayed");
		}
		else
		{
			System.out.println("Creating New Lead page is not displayed");
		}
		//Create Strings for Last name and Company
		String strLname="Soundarya";
		String strComp="EY";
		//Create webelement for Last Name
		WebElement objLastName=driver.findElement(By.name("lastname"));
		//Create Webelement for Company
		WebElement objComp=driver.findElement(By.name("company"));
		//Create Webelement for Save button
			WebElement objSav=driver.findElement(By.name("button"));
			//Click on save
			objSav.click();
			//Creating Alert message handling
			Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
			//driver.switchTo().alert();
			//Verify the last name empty popup message is displayed
			if(Alert1.getText().equals("Last Name cannot be empty"))
			{
				System.out.println("Last Name can not be empty message is displayed");
				Alert1.accept();
			}
			else
			{
				System.out.println("Last Name can not be empty message is not displayed");
			}
			//Enter 
			objLastName.sendKeys(strLname);
			objSav.click();
			
			Alert Alert2=wait.until(ExpectedConditions.alertIsPresent());
			//Verify the company can not be empty popup message is displayed
			if(Alert2.getText().equals("Company cannot be empty"))
			{
				System.out.println("Company can not be empty message is displayed");
				Alert2.accept();
			}
			else
			{
				System.out.println("Company can not be empty message is not displayed");
			}
			//Enter company name and click on save
			objComp.sendKeys(strComp);
			objSav.click();
			//Verify Lead information Page must be displayed
	if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
			("/html/body/table[3]/tbody/tr[1]/td/table[2]/tbody/tr/td[2]/div/table[2]/tbody/tr[1]/td/table/tbody/tr/td[2]"),
			"Lead Information")))
	{
		System.out.println("Lead information Page is displayed");
	}
	else
	{
		System.out.println("Lead information Page is displayed");
	}
	//Getting the attribute value of ID created//THE AUTO GENERATED LEADID 
	String strId=driver.findElement(By.xpath("//*[@id='tblLeadInformation']/table/tbody/tr[1]/td[4]")).getText();
	System.out.println(strId);

	//Verify Lead module page must be displayed
	WebElement objLead1=driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[1]/a"));
	objLead1.click();
	////Verify Lead module page must be displayed
	if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
			{
		System.out.println("Lead module page is be displayed");
			}
	else
	{
		System.out.println("Lead module page is not displayed");
	}
	 
	//Select the record to be deleted	
	WebElement objSearchfor=driver.findElement(By.name("search_text"));
	WebElement objSearchnow=driver.findElement(By.name("submit"));
	objSearchfor.sendKeys(strId);
	objSearchnow.click();
	System.out.println("Record is selected for deletion");
	Thread.sleep(2000);
//Click on the record that is displayed after search
	  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[1]")).click();
	//Edit lead info	  
	  WebElement objDelbtn=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[10]/a[2]"));
	  objDelbtn.click();
	 Thread.sleep(2000);
 
		Alert Alert3=wait.until(ExpectedConditions.alertIsPresent());
		  if(Alert3.getText().equals("Are You Sure You want to Delete?"))
		  {
			  System.out.println("Are You Sure You want to Delete? message is displayed");
			  Alert3.accept();
		  }
		  else
		  {
			  System.out.println("Are You Sure You want to Delete? message is not displayed");
		  }
		  Thread.sleep(2000);
		  objSearchfor.sendKeys(strId);
		  objSearchnow.click();
		  System.out.println("Deleted");
if(wait.until(ExpectedConditions.textToBePresentInElementLocated
(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[2]/span"),
		"No Lead Found !")))
{
	System.out.println("No leads message is displayed");
}
else
{
	System.out.println("Message is not displayed");
}


driver.close();
driver.quit();
}

}
