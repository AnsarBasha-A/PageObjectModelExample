package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {
	
	@FindBy(name = "username")
	public static WebElement usename;
	
	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(xpath ="//*[@id='loginfrm']/button")
	public static WebElement submit;
	
	
	
	
	
	
	/*public static WebElement userName(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='loginfrm']/div[3]/div[1]/label/input"));
	}

	public static WebElement passWord(WebDriver driver)
	{
		 return driver.findElement(By.xpath("//*[@id='loginfrm']/div[3]/div[2]/label/input"));
	}
	
	public static WebElement loginButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
	}*/
}

