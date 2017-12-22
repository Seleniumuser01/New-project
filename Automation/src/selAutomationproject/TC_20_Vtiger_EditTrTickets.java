package selAutomationproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_20_Vtiger_EditTrTickets {
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
		("body > table.hdrTabBg > tbody > tr > td.small > table > tbody > tr > td:nth-child(18) > a"))).click();
			//Verify trouble tickets module page must be displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//table[@class='small']/tbody/tr[2]/td/a"))).isDisplayed())	
		{
		System.out.println("Trouble tickets module page is displayed");
		}		
		else
		{
		System.out.println("Trouble tickets module page not displayed");
		}	
		System.out.println("clicking");
		//Click on Create Ticket(+)icon
				wait.until(ExpectedConditions.presenceOfElementLocated
						(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img"))).click();
				Thread.sleep(2000);
				//Verify Creating New ticket page is displayed
				if(wait.until(ExpectedConditions.textToBePresentInElementLocated
							(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Ticket")))
				{
					System.out.println("Creating New ticket page is displayed");
				}
				else
				{
					System.out.println("Creating New ticket page is not displayed");
				}	
				driver.findElement(By.xpath
						("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();

		//Verify the last name empty popup message is displayed
			Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
			if(Alert1.getText().equals("Title cannot be none"))
			{
				System.out.println("Title cannot be none message is displayed");
				Alert1.accept();
			}
			else
			{
				System.out.println("Title cannot be none message is not displayed");
			}
			String strticktitle="Ticket title";
		//driver.findElement(By.xpath
	//("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
		driver.findElement(By.name("ticket_title")).sendKeys(strticktitle);
		driver.findElement(By.xpath
				("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
		//Verify the last name empty popup message is displayed
		
		//Enter value to product name
		Thread.sleep(2000);
		
	System.out.println("Record is created");
	//Get the newly created ticket no
	String strtickno=driver.findElement(By.xpath("//*[@id=\"tblTicketInformation\"]/table/tbody/tr[7]/td[2]")).getText();
		System.out.println(strtickno);	
	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[1]/a")).click();
	driver.findElement(By.name("search_text")).sendKeys(strtickno);
	//driver.findElement(By.name("search_text")).sendKeys("TT21");
	driver.findElement(By.name("submit")).click();
	System.out.println("yes");
	Thread.sleep(2000);
	String strticknametable=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[3]/a")).getText();
	System.out.println(strticknametable);
	if(strticknametable.equals(strticktitle))
	{
		System.out.println("New ticket is created");
	}
	else
	{
		System.out.println("New ticket is not created");
	}
	//Step 4:Don’t Select the record in the grid and click on Mass Edit button
			WebElement objMassEditBtn=driver.findElement
					(By.xpath("//*[@id=\"massdelete\"]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[2]"));
			objMassEditBtn.click();
			Thread.sleep(5000);
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
		  //Step 5:Check the record in the grid and click on Mass Edit button
		  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[1]")).click();
		  System.out.println("Record is selected");
			WebElement objmassbtn2=driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[2]"));
			objmassbtn2.click();
		
		Thread.sleep(2000);
			//  Step 6:Click on cancel button in the Mass Edit - Records Fields page  
		      //   Verify Tickets module page must be displayed
		  WebElement objCancel=driver.findElement(By.xpath("//*[@id='massedit_form']/table[2]/tbody/tr/td/input[2]"));
		  objCancel.click();
		  Thread.sleep(2000);
		////Verify Lead module page must be displayed
		  if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
		  		{
		  	System.out.println("Tickets module page is displayed");
		  		}
		  else
		  {
		  	System.out.println("Tickets module page is not displayed");
		  }
			Thread.sleep(2000);
			
		//Select the record to be edited	
			WebElement objSearchfor=driver.findElement(By.name("search_text"));
			WebElement objSearchnow=driver.findElement(By.name("submit"));
			objSearchfor.clear();
			objSearchfor.sendKeys(strtickno);
			objSearchnow.click();
			System.out.println("Record is selected");
			Thread.sleep(2000);
			Thread.sleep(2000);
			//Click on the record that is displayed after search
				  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[1]")).click();
				  
				  
				
		//Edit lead info	  
		 WebElement objEditbtn=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[8]/a[1]"));
		 objEditbtn.click();
		Thread.sleep(2000);

		//Edit the company info in the selected record IN THE SELCETD RECORD INFO PAGE
		WebElement objTitle=driver.findElement(By.name("ticket_title"));
		objTitle.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		objTitle.sendKeys(Keys.DELETE);
		String strNewTitle="EY-GSS";
		objTitle.sendKeys(strNewTitle);
		driver.findElement(By.name("button")).click();
		System.out.println("ACTION DONE AND NAME CHANGED");
		// Verify the record with changed details should be displayed in the grid


		String strchgdtitle=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[3]/a")).getText();
		System.out.println(strchgdtitle);
		if(strNewTitle.equals(strchgdtitle))
		{
			System.out.println("Record is changed and displayed");
		}
		else
		{
			System.out.println("Record is not changed ");
		}
				
}
}
