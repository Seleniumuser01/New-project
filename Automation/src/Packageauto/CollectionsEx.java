package Packageauto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CollectionsEx 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,60);
	//To create alerts>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	driver.get("http://apps.qaplanet.in/WebApp/AgeProb.html");
	//To verify the title is displayed
	Boolean res=wait.until(ExpectedConditions.titleIs("Age Problem"));
	if(res)
	{
		System.out.println("Home page is displayed");
	}
	//Enter age 
            driver.findElement(By.id("idAge")).sendKeys("10");
            //Click on Submit
            driver.findElement(By.id("idSubGo")).click();
            //wait for alert
            wait.until(ExpectedConditions.alertIsPresent());
            //Create a reference for alert
      Alert A=driver.switchTo().alert();
      //To click on OK
   
      if(A.getText().equals("Kid"))
      {
    	  System.out.println("Kid is displayed");
    	   A.accept();
      }
      driver.close();
      driver.quit();
}
}
