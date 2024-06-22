package testCase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidlogin {
	
	public static WebDriver wd;
	
	public static void setup()
	{
	  System.setProperty("Webdriver", "C:\\Users\\sowmi\\eclipse-workspace\\Testcases\\src\\test\\resources\\chromedriver.exe");	
	  wd=new ChromeDriver();
	}
	
	public static void puturl()
	{
		wd.get("https://www.saucedemo.com/");
	}
	
	public static void invalidLogins(String username,String password)
	{
		WebElement user=wd.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
		WebElement pass=wd.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		
		user.sendKeys(username);
	    pass.sendKeys(password);
	}
	
	public static void loginclick()
	{
		WebElement login=wd.findElement(By.xpath("//input[contains(@id,'login-button')]"));
	    login.click();

	}

	public static void quit()
	{
		wd.quit();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invalidlogin.setup();
		//Invalidlogin.puturl();
		//Invalidlogin.invalidLogins("standard_user", "secret_sauce");
		
		
		
	}

}