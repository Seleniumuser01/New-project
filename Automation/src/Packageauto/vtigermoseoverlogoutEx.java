package Packageauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtigermoseoverlogoutEx {
	public static void main(String[] args) throws Exception
	{
		
	
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//URL
	driver.get("http://classroom:8888/index.php?action=Login&module=Users");
	//Username
	driver.findElement(By.name("user_name")).sendKeys("qaplanet1");
	//Password
	driver.findElement(By.name("user_password")).sendKeys("user1");
	//Login click
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(2000);
	Actions A=new Actions(driver);
	driver.findElement(By.xpath("//div[@id='stuffcont_46']/table/tbody/tr[2]/td/a/img")).click();
	System.out.println("click on image");
	Thread.sleep(2000);
	WebElement objimage=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
		
//Move to image
	A.moveToElement(objimage).perform();
	driver.findElement(By.linkText("Sign Out")).click();
	System.out.println("Success");
	driver.close();
	driver.quit();

	
}
}