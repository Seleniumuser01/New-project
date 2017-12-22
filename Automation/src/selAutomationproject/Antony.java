package selAutomationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Antony {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,60);
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebElement objUN=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		WebElement objPD=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		WebElement objLogin=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));	
		String StrUN="qaplanet1";
		String StrPD="lab1";
		
		objUN.sendKeys(StrUN);
		objPD.sendKeys(StrPD);
		objLogin.click();
		Thread.sleep(10000);
		
		
		String strEmpName_Sibling=driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),"+"0975"+")]/following-sibling::td[3]/a")).getText();
		System.out.println(strEmpName_Sibling);
		
		
		
		
		
	}

}
