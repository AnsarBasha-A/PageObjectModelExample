package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateObject {

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement myprofile;

	@FindBy(name = "phonenumber")
	public static WebElement phonenumber;

	@FindBy(name ="city")
	public static WebElement city;

	@FindBy (xpath ="//*[@id='profilefrm']/div/div/div[7]/div/button")
	public static WebElement submitbutton;







	/*public static WebElement myProfile(WebDriver driver)
	{

		return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
	}	

public static WebElement phoneNumber(WebDriver driver)
{

	return driver.findElement(By.name("phone"));
}

public static WebElement city(WebDriver driver)
{
	return driver.findElement(By.name("city"));
}

public static WebElement submitButton(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[@id='profilefrm']/div/div/div[7]/div/button"));*/
}

