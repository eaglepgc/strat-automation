package strat_regresion_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class  Add_New_Priorities extends Before_and_After_Suite{
	  
	  @Test //Add New Priority
	  public void test() throws InterruptedException { 
		  
		  test=extent.createTest("Add New Priority");
		  //Scroll to bottom of page
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  //Click Add Priorities Button
		  driver.findElement(By.xpath("/html/body/app-root/app-plan/div/div[2]/app-envisioning/section/div[2]/button")).click();
		  Thread.sleep(1000); // Let the user actually see something!
		  //Entering a Description
		  driver.findElement(By.id("priorityDescription")).clear();
		  driver.findElement(By.id("priorityDescription")).sendKeys("This is a Priority Descriptionj");
		  //SELECT TAG NOT IMPLEMENTED 
		  //Entering Title
		  driver.findElement(By.id("priorityTitle")).clear();
		  driver.findElement(By.id("priorityTitle")).sendKeys("Auto Priority");
		  //Clicking Save button
		  driver.findElement(By.xpath("/html/body/div[3]/app-priority/form/div[4]/button[2]")).click();
		  Thread.sleep(10000); // Let the user actually see something!
		  //Verifying New Priority was added
		  Assert.assertTrue(driver.getPageSource().contains("Auto Priority"));
		  //Verifying Invited Status
		  /*String invitedStatus = driver.findElement(By.xpath("/html/body/app-root/app-usermgmt/div/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[3]/span/div/div")).getText();
		  assertTrue(invitedStatus.contains("Invited"));*/
		  
		  /*//Edit User- Not implemented yet
		  driver.findElement(By.xpath("/html/body/app-root/app-usermgmt/p-menu/div/ul/li[1]/a")).click();*/
		  
		
	  }
	  }
