package testPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginObject;

public class LoginTestClass {
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		PageFactory.initElements(driver, LoginObject.class);
		LoginObject.usename.sendKeys("user@phptravels.com");
		LoginObject.password.sendKeys("demouser");
		LoginObject.submit.click();
		
		
	/*	LoginObject.userName(driver).sendKeys("user@phptravels.com");
		LoginObject.passWord(driver).sendKeys("demouser");
		LoginObject.loginButton(driver).click()*/;
		
		
				
		
		/*WebElement userName = driver.findElement(By.xpath("//*[@id='loginfrm']/div[3]/div[1]/label/input"));
		userName.sendKeys("user@phptravels.com");
		
		WebElement passWord = driver.findElement(By.xpath("//*[@id='loginfrm']/div[3]/div[2]/label/input"));
		passWord.sendKeys("demouser");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
		loginButton.click();
		*/
		driver.quit();
	}
	

}
