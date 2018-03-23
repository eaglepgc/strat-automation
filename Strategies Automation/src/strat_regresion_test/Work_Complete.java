package strat_regresion_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Work_Complete extends Before_and_After_Suite{
	  
	  @Test //Add user
	  public void test() throws InterruptedException { 
		  
			test=extent.createTest("Add user");
			
			//Click on the "Is your work completed?" button
			driver.findElement(By.className("ui-inputswitch-off")).click();
			//Verify it is on
			driver.findElement(By.className("ui-inputswitch-onlabel")).isDisplayed();
			//Click on the "Is your work completed?" button
			driver.findElement(By.className("ui-inputswitch-on")).click();
			//Verify it is off
			driver.findElement(By.className("ui-inputswitch-offlabel")).isDisplayed();


						
	  }
}
			
			
