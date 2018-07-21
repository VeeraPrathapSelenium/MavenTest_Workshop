package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	
	@Test
	public static void launchBrowser()
	{
		
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	}

}
