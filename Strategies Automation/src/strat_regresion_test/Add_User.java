package strat_regresion_test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Add_User extends Before_and_After_Suite{
  
  @Test //Add user
  public void addUser() throws InterruptedException { 
	  
		test=extent.createTest("addUser");

	  //Adding a user
	  driver.findElement(By.xpath("/html/body/app-root/app-usermgmt/div/div/div/button")).click();
	  Thread.sleep(1000); // Let the user actually see something!
	  driver.findElement(By.name("email")).sendKeys("removing-autostratuser@yopmail.com");
	  driver.findElement(By.className("ui-dropdown-trigger")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  //Click on "Admin" with force visible trick.
	  int ok_size=driver.findElements(By.xpath("//ul/li[3]/span")).size();
	  driver.findElements(By.xpath("//ul/li[3]/span")).get(ok_size-1).click();
	  Thread.sleep(2000); // Let the user actually see something!
	  //Sending access email
	  driver.findElement(By.className("checkbox-branded")).click();
	  Thread.sleep(2000); // Let the user actually see something!
	  //Click Submit
	  driver.findElement(By.xpath("/html/body/div[3]/app-add-user/div/form/div[4]/button[2]")).click();
	  Thread.sleep(10000); // Let the user actually see something!
	  Assert.assertTrue(driver.getPageSource().contains("DO NOT DELETE-Automation A1"));
	  //Verifying Invited Status
	  String invitedStatus = driver.findElement(By.xpath("/html/body/app-root/app-usermgmt/div/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[3]/span/div/div")).getText();
	  assertTrue(invitedStatus.contains("Invited"));
	  
	  /*//Edit User- Not implemented yet
	  driver.findElement(By.xpath("/html/body/app-root/app-usermgmt/p-menu/div/ul/li[1]/a")).click();*/
	  
	
  }
  }
