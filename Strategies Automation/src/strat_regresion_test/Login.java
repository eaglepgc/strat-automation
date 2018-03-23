package strat_regresion_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Login extends Before_and_After_Suite {

	
	
	@Test //(dataProvider="UserNamePassword", dataProviderClass=Urls.class)
	public void login() throws InterruptedException {
		test=extent.createTest("Login as Admin");

		Thread.sleep(2000); // Let the user actually see something!
		driver.findElement(By.name("email")).clear(); // clears text
		driver.findElement(By.name("email")).sendKeys("stephen.jones@soltech.net");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Password1!");
		Thread.sleep(2000); // Let the user actually see something!
		driver.findElement(By.className("auth-btn")).click();
		Thread.sleep(2000); // Let the user actually see something!
		Assert.assertEquals(driver.getTitle(), "eProve� strategies"); // confirms it is on the correct page  by verifying the title
	}
	
	
}
