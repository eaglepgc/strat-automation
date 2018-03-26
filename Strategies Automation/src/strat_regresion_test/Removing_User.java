package strat_regresion_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Removing_User extends Before_and_After_Suite{
	  
	  @Test //Remove user
	  public void removingUser() throws InterruptedException { 
		  
			test=extent.createTest("removingUser");
			//Clicking Action Menu 
			  driver.findElement(By.xpath("/html/body/app-root/app-usermgmt/div/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[5]/span/div/i")).click();
			  Thread.sleep(3000); // Let the user actually see something!
		      //Clicking Remove
			  driver.findElement(By.xpath("/html/body/app-root/app-usermgmt/p-menu/div/ul/li[3]/a/span[2]")).click();
			  Thread.sleep(5000); // Let the user actually see something!
			  //Clicking Yes, Remove
			  driver.findElement(By.xpath("//html/body/app-root/app-usermgmt/p-dialog/div/div[3]/p-footer/button[2]")).click();
			  Thread.sleep(10000); // Let the user actually see something!
			  Assert.assertFalse(driver.getPageSource().contains("DO NOT DELETE-Automation A1"));
 
  }
}
