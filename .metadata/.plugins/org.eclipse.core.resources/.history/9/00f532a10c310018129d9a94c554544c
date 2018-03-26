package strat_regresion_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Nav_Dashboard extends Before_and_After_Suite {
	  
	@Test //Navigating to Strategies Dashboard Page
	  public void mystrategies() throws InterruptedException {
		  
			test=extent.createTest("Navigating to My Strategies");

		  //Clicking Hamburger Menu
		  driver.findElement(By.className("icon-menu")).click();
		  Thread.sleep(2000); // Let the user actually see something!
		  //Clicking "My Strategies"
		  driver.findElement(By.xpath("/html/body/div[2]/app-left-nav/div/div[4]/div[1]/a/span")).click();
		  Thread.sleep(2000); // Let the user actually see something!
		  Assert.assertEquals(driver.getTitle(), "eProve™ strategies"); // confirms it is on the correct page by verifying the title
		 }
	}