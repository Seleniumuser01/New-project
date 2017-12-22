package selAutomationproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_13_VTigerCRM_DeleteOpportunitiesInfo {
	
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
	//Click on the Opportunities link
	WebElement objOppo=driver.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[10]/a"));
	objOppo.click();
	Thread.sleep(2000);
	//Verify the Opportunities page is displayed
	if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
	{
	System.out.println("Opportunities page is displayed");		
	}
	else
	{
		System.out.println("Opportunities page is not displayed");	
	}
	//Click on Create Opportunities (+) button
	driver.findElement(By.xpath
		("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
	Thread.sleep(2000);
	System.out.println("naviagti");
	//Verify the Creating New Opportunities page must be displayed
	Thread.sleep(2000);
	if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
			("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Opportunity")))
	{
	System.out.println("Creating New Opportunity page is displayed");		
	}
	else
	{
	System.out.println("Creating New Opportunity page is not displayed");	
	}	

	//1) Leave all the fields as blank 2) Click on Save button

	driver.findElement(By.xpath("//*[@id=\"basicTab\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
	Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
	if(Alert1.getText().equals("Opportunity Name cannot be empty"))
	{
		System.out.println("Opportunity Name cannot be empty message is displayed");
		Alert1.accept();
		}
		else
		{
		System.out.println("Opportunity Name cannot be empty message is not displayed");	
		}
	//String for opportunity name
	String strOpponame="New opp";
	//Web element for Opportunity name
	WebElement objOppNme=driver.findElement(By.name("potentialname"));
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//WebElemnt for ADD RELATED TO
	WebElement objAddRelatedTo=driver.findElement
	(By.xpath("//*[@id=\"basicTab\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/img"));
	objOppNme.sendKeys(strOpponame);
	driver.findElement(By.xpath("//*[@id=\"basicTab\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();

	Alert Alert2=wait.until(ExpectedConditions.alertIsPresent());
	if(Alert2.getText().equals("Related To cannot be none"))
	{
		System.out.println("Related To cannot be none message is displayed");
		Alert2.accept();
		}
		else
		{
		System.out.println("Related To cannot be none message is not displayed");	
		}
	objAddRelatedTo.click();
	Thread.sleep(2000);
	//String ID=driver.getWindowHandle();
	Set<String>IDS=driver.getWindowHandles();
	Iterator<String> ITR=IDS.iterator();
	String first_ID=ITR.next();
	String SECOND_ID=ITR.next();
	System.out.println(first_ID);
	System.out.println(SECOND_ID);
	//System.out.println(ID);
	//Always navigate to second id
	driver.switchTo().window(SECOND_ID);
	System.out.println("Navigating to new browser");
	Thread.sleep(2000);
	//WINDOW...............................................//
	driver.findElement(By.name("search_text")).sendKeys("hello");
	driver.findElement(By.name("search")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("hello")).click();
	Thread.sleep(5000);
	//Click on save button
	//switch to current browser first id
	driver.switchTo().window(first_ID);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"basicTab\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
	System.out.println("New opportunity is created");
	String strOppNumberNo=driver.findElement(By.xpath("//*[@id=\"tblOpportunityInformation:\"]/table/tbody/tr[1]/td[4]")).getText();
	System.out.println(strOppNumberNo);
	//Click on opportunity link
	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[1]/a")).click();
	if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
	{
	System.out.println("Opportunities page is displayed");		
	}
	else
	{
		System.out.println("Opportunities page is not displayed");	
	}


	WebElement objSearchfor=driver.findElement(By.name("search_text"));
	System.out.println("searching text");
	WebElement objSearchnow=driver.findElement(By.name("submit"));
	System.out.println("submitting text");
	objSearchfor.sendKeys(strOppNumberNo);
	//Click on search  now
	objSearchnow.click();
	Thread.sleep(2000);

	//Store the organizaton name newly created in a string FROM THE  organizations MODULE PAGE
	String objOppolistedname=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[3]")).getText();
	System.out.println(objOppolistedname);
	if(strOpponame.equals(objOppolistedname))
	{
		System.out.println(" New Opportunity is created");
	}
	else
	{
		System.out.println(" New Opportunity is not created");
		}
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//Step 4:Don’t Select the record in the grid and click on Delete button
		WebElement objDeleteBtn=driver.findElement
				(By.xpath("//*[@id=\"massdelete\"]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[1]"));
		objDeleteBtn.click();
		Thread.sleep(5000);
		//Step 4: Verify the alert message as "Please select at least one entity"
	  Alert Alert3=wait.until(ExpectedConditions.alertIsPresent());
	  if(Alert3.getText().equals("Please select at least one entity"))
	  {
		  System.out.println("Please select at least one entity message is displayed");
		  Alert3.accept();
	  }
	  else
	  {
		  System.out.println("Please select at least one entity message is not displayed");
	  }

	//------------------------------------------------------------------------------------------------------//

		System.out.println("Record is selected for deletion");
		Thread.sleep(2000);
	  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[1]")).click();
	  //driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[8]/a[2]")).click();
	  objDeleteBtn.click();
	  Thread.sleep(2000);
	  Alert Alert4=wait.until(ExpectedConditions.alertIsPresent());
	  String strAlert=Alert4.getText();
	  System.out.println(strAlert);
	  
	  
	  if(strAlert.equals("Are you sure you want to delete the selected 1 records?"))
	  {
		  System.out.println("Message is displayed");
		  Alert4.dismiss();
	  }
	  else
	  {
		  System.out.println("Message is not displayed");
	  }
	 //Verify the organization page is displayed
	  if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
		{
	System.out.println("organizations module page is displayed");
		}
	else
	{
	System.out.println("organizations module page is not displayed");		
	}
	  //Click on delete button under Actions
	  WebElement objSearchfor12=driver.findElement(By.name("search_text"));
		WebElement objSearchnow12=driver.findElement(By.name("submit"));
		objSearchfor12.clear();
		objSearchfor12.sendKeys(strOppNumberNo);
		objSearchnow12.click();
		Thread.sleep(2000);
		//click on the checkbox
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[1]")).click();
		//click on del button
	  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[9]/a[2]")).click();
	  Alert Alert5=wait.until(ExpectedConditions.alertIsPresent());
	  if(Alert5.getText().equals("Are You Sure You want to Delete?")) 
	  {
		  System.out.println("Message is displayed");
		  Alert5.accept();
	  }
	  else
	  {
		  System.out.println("Message is not displayed");
	  }
	 //Verify the organization page is displayed
	  if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
		{
	System.out.println("opportunities module page is displayed");
		}
	  else
	{
	System.out.println("opportunities module page is not displayed");		
	}
	  if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
			  ("//*[@id=\"massdelete\"]/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[2]/span"),"No Opportunity Found !")))
	  {
		  System.out.println("Record is deleted");
	  }
	  else
	  {
		  System.out.println("Record is not deleted");  
	  }
driver.close();
driver.quit();
}
}