package testPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Up;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginObject;
import pageObject.UpdateObject;

public class UpdateProfileDetails {

	@Test
	public void updateProfile()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		
		
		PageFactory.initElements(driver, LoginObject.class);
		LoginObject.usename.sendKeys("user@phptravels.com");
		LoginObject.password.sendKeys("demouser");
		LoginObject.submit.click();
		
		PageFactory.initElements(driver,UpdateObject.class);
		UpdateObject.myprofile.click();
		UpdateObject.phonenumber.sendKeys("12546786");
		UpdateObject.city.sendKeys("Los angles");
		UpdateObject.submitbutton.click();
	
		
		
		
		
		/*LoginObject.userName(driver).sendKeys("user@phptravels.com");
		LoginObject.passWord(driver).sendKeys("demouser");
		LoginObject.loginButton(driver).click();
		
		UpdateObject.myProfile(driver).click();
		UpdateObject.city(driver).sendKeys("12546786");
		UpdateObject.city(driver).sendKeys("Los angles");
		UpdateObject.submitButton(driver).click();
	*/
		

		/*WebElement userName = driver.findElement(By.xpath("//*[@id='loginfrm']/div[3]/div[1]/label/input"));
		userName.sendKeys("user@phptravels.com");

		WebElement passWord = driver.findElement(By.xpath("//*[@id='loginfrm']/div[3]/div[2]/label/input"));
		passWord.sendKeys("demouser");

		WebElement loginButton = driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
		loginButton.click();

		WebElement profile = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
		profile.click();
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("12546786");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Los angles");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='profilefrm']/div/div/div[7]/div/button"));
		submit.click();*/


	}
}
