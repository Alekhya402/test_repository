package test3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	ChromeDriver driver;
	@BeforeMethod
	public void openbrowser() {
	driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	@Test(priority=1)
	public void login() throws InterruptedException {
		
		driver.findElementByXPath("//input[@name='firstname']").sendKeys("alekhya");
		driver.findElementByXPath("//input[@name='lastname']").sendKeys("ramidi");
		driver.findElementByXPath("//input[@name='reg_email__']").sendKeys("2222222");
		Thread.sleep(3000);

	}
	@Test(priority=2)
	public void moredetails() {
		driver.findElementByXPath("//input[@autocomplete='new-password']").sendKeys("password");
		
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
