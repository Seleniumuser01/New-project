package selAutomationproject;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_5_VtigerCRM_CreateOrg 
{
	public static void main(String[] args) throws Exception {
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
			
	//Click on the Organizations link
  WebElement objOrg=driver.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[6]/a"));
objOrg.click();
Thread.sleep(2000);
	//Verify the Organizations page should be displayed 
if(wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
		{
	System.out.println("Organizations page is displayed");
		}
else
{
	System.out.println("Organizations page is not displayed");
}
//Click on +icon to create new organization
WebElement objAddOrgicon=driver.findElement
(By.xpath("//table[@class='small']/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img"));
objAddOrgicon.click();
//Verify the Creating New Organization page must be displayed
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Organization")))
{
	System.out.println("Creating New Organization page is displayed");
}
else
{
	System.out.println("Creating New Organization page is not displayed");
}
//Scroll Creating New Organization page little down 
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)", "");
//CLICK ON SAVE
driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[22]/td/div/input[1]")).click();
//	Wait for alert message popup

Alert A=wait.until(ExpectedConditions.alertIsPresent());
//Verify the alert message as "Organization Name cannot be empty".
if(A.getText().equals("Organization Name cannot be empty"))
{
	System.out.println("Organization Name cannot be empty message is displayed ");
	A.accept();
}
else
{
	System.out.println("Organization Name cannot be empty message is not displayed ");
}
//1) Enter the Organization Name
//2) Scroll Creating New Organization page little down 
//3) Click on Save button
SimpleDateFormat date=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
Date d=new Date();
String today=date.format(d);

String strOrgName="Hi"+today;
driver.findElement(By.name("accountname")).sendKeys(strOrgName);
JavascriptExecutor jse1 = (JavascriptExecutor)driver;
jse1.executeScript("window.scrollBy(0,250)", "");
driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[22]/td/div/input[1]")).click();
//Verify the  Organization Information page must be displayed
Thread.sleep(2000);
//store created org  number in a string
String objOrgNo=driver.findElement(By.xpath("//*[@id='tblOrganizationInformation']/table/tbody/tr[1]/td[4]")).getText();
System.out.println("newly created");
System.out.println(objOrgNo);
	


//Verify the  Organization Information page must be displayed
String strNewOrgInfo=driver.findElement
(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[2]/tbody/tr/td[2]/div/table[1]/tbody/tr/td/span[1]")).getText();
System.out.println(strNewOrgInfo);
if(strNewOrgInfo.equals("["+objOrgNo+" ] "+strOrgName+" - Organization Information"))
		{
	System.out.println("Organization information is displayed");
		}
else
{
	System.out.println("Organization information is not displayed");
}
//Click on organizations link 
driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[1]/a")).click();
//Verify organizations module page must be displayed
driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]/a")).click();
//Verify organizations module page must be displayed
if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
		{
	System.out.println("organizations module page is displayed");
		}
else
{
System.out.println("organizations module page is not displayed");		
}
Thread.sleep(2000);
//Webelement for search box
WebElement objSearchfor=driver.findElement(By.xpath("//*[@id='searchAcc']/form/table/tbody/tr[1]/td[3]/input"));
System.out.println("searching text");
WebElement objSearchnow=driver.findElement(By.xpath("//*[@id='searchAcc']/form/table/tbody/tr[1]/td[6]/input"));
System.out.println("submitting text");
objSearchfor.sendKeys(objOrgNo);
//Click on search  now
objSearchnow.click();
Thread.sleep(2000);

//Store the organizaton name newly created in a string FROM THE  organizations MODULE PAGE
String objOrglistedname=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[3]")).getText();
System.out.println(objOrglistedname);
if(strOrgName.equals(objOrglistedname))
{
	System.out.println(" New Organization is created");
}
else
{
	System.out.println(" New Organization is  not created");
	}

	//Mouse over on signout link
	Actions act=new Actions(driver);
	WebElement objimage=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));

	//Move to image
		act.moveToElement(objimage).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("Logout successful");
		Thread.sleep(2000);
		//Wait for home page to be displayed
			if(wait.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM")))
			{
				System.out.println("Home page is displayed");
			}
			else
			{
				System.out.println("Home page is not displayed");
			}
		driver.close();
		driver.quit();


}
}	

