package selAutomationproject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_17_VTigerCRM_CreateEmail {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\New chrome download\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//URL
		driver.get("http://classroom:8888/index.php?action=Login&module=Users");
		//Create webdriverwait object
		WebDriverWait wait=new WebDriverWait(driver,60);
		
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
			//Click on the Email module link
			wait.until(ExpectedConditions.presenceOfElementLocated
						(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[16]/a"))).click();
			//Verify products module page must be displayed
			if(wait.until(ExpectedConditions.presenceOfElementLocated
					(By.xpath("//table[@class='small']/tbody/tr[2]/td/a"))).isDisplayed())	
				{
				System.out.println("Email module page is displayed");
				}		
			else
			{
				System.out.println(" Email module page not displayed");
			}	
			
			//Click on compose link
	WebElement objCompose=driver.findElement(By.linkText("Compose"));
	objCompose.click();
	//String ID=driver.getWindowHandle();
	Set<String>IDS=driver.getWindowHandles();
	Iterator<String> ITR=IDS.iterator();
	String first_ID=ITR.next();
	String SECOND_ID=ITR.next();
	System.out.println(first_ID);
	System.out.println(SECOND_ID);
	//System.out.println(ID);
	//Always navigate to second id compose email
	driver.switchTo().window(SECOND_ID);
	System.out.println("Navigating to new browser");
	Thread.sleep(2000);
	//NAVIGATION............................
	WebElement objIcon=driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[3]/span[1]/img"));
	objIcon.click();
	Thread.sleep(2000);
	System.out.println("clicked");
	//next navigation
	Set<String>IDS1=driver.getWindowHandles();
	for(String ID3:IDS1)
	{
		System.out.println(ID3);
		driver.switchTo().window(ID3);
	}
	
	Thread.sleep(2000);
	System.out.println("clicked second time");
	Thread.sleep(2000);
	String strname="jones";
	WebElement objSearchbox=driver.findElement(By.name("search_text"));
	WebElement objSearchBTN=driver.findElement(By.name("search"));
	objSearchbox.sendKeys(strname);	
	//Get the mail into string
	String strMailto=driver.findElement
			(By.xpath("//*[@id=\"ListViewContents\"]/form/table[1]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[5]")).getText();
	System.out.println("mail from 2nd browser is" + strMailto);
	//Get the name into another string
	String strMailName=driver.findElement
			(By.xpath("//*[@id=\"ListViewContents\"]/form/table[1]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]")).getText();
	System.out.println("name from 2nd browser is" + strMailName);
	driver.findElement(By.id("1")).click();
	//Navigate to email
	Thread.sleep(2000);
	driver.switchTo().window(SECOND_ID);
	Thread.sleep(2000);
	if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
			("/html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td"),"Compose E-Mail")))
{
	System.out.println("Yes");
}
else
{
	System.out.println("No");
}
	SimpleDateFormat date=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
	Date d=new Date();
	String today=date.format(d);

	//String strSubject="Nice message12"+today;
	String strcheck="testing12345";
	driver.findElement(By.name("subject")).sendKeys(strcheck);
	//Create object for robot class
	Robot rt=new Robot();
	StringSelection ss=new StringSelection("dskjfhjsdgvjdfgjkbdfukhgdfkhguidfhgiudhfguioh");
	//Set image path to default window
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
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
	//String printme="strMailName"+"strMailto"+","";
	//System.out.println(printme);
	
	String strTofield=driver.findElement(By.id("parent_name")).getAttribute("value");
	System.out.println(strTofield);
	if(strTofield.contains(strMailName))
	{
	System.out.println("To field is verified");	
	}
	else
	{
		System.out.println("To field is not verified");	
	}
	
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td/input[2]")).click();	
	
	/*String expected="haha";
    String actual="HAHA<haha>";
    
    if(actual.contains(expected)) {
    	System.out.println("passed");
    }
    else
    {
    	System.out.println("Failed'");
    }
	
*/
//Verify the email page is verified
	driver.switchTo().window(first_ID);
	Thread.sleep(2000);
if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
	{
	System.out.println("Email page is displayed");
}
else
{
	System.out.println("Email page is not displayed");
}
//enter the subject
driver.findElement(By.name("search_text")).sendKeys(strcheck);
driver.findElement(By.name("find")).click();
String strEmailName_Sibling=driver.findElement(By.xpath("//div[@id='rssScroll']/descendant::b[contains(text(),'testing12345')]")).getText();
System.out.println(strEmailName_Sibling);

if(strEmailName_Sibling.equals(strcheck))
{
	System.out.println("Email is displayed");
}
else
{
	System.out.println("Email is not displayed");
}

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
