package testCase5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class About {
	
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Testcases\\src\\test\\resources\\chromedriver.exe");
	    wd=new ChromeDriver();
	
	}
	
	public static void puturl()
	{
		wd.get("https://www.saucedemo.com/");
	}
	
	public static void login(String username,String password)
	{
		WebElement user=wd.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		WebElement pass=wd.findElement(By.xpath("//input[contains(@id,'password')]"));
		WebElement login=wd.findElement(By.xpath("//input[contains(@id,'login-button')]"));
	 
		user.sendKeys(username);
		pass.sendKeys(password);
		login.click();

	}
	
	public static void aboutop()
	{
		WebElement abop=wd.findElement(By.xpath("//div[contains(@class,'bm-burger-button')]"));
		abop.click();
	   
	}
	
	public static void quit()
	{
		wd.quit();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//About.setup();
		//About.puturl();
		//About.login("standard_user", "secret_sauce");
		//About.aboutop();
		
	}

}