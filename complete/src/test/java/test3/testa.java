package test3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testa {
	ChromeDriver driver;
	@Test
	public void open() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
