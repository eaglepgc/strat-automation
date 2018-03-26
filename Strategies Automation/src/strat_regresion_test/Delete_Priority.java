package strat_regresion_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Delete_Priority extends Before_and_After_Suite{
	  
	  @Test //Add New Priority
	  public void deletePriority() throws InterruptedException { 
		  
		  test=extent.createTest("deletePriority");
		  
		  //Clicking the Delete icon
		  driver.findElement(By.xpath("/html/body/app-root/app-plan/div/div[2]/app-envisioning/section/p-datatable/div/div[1]/table/tbody/tr/td[3]/span/button[2]")).click();
		  Thread.sleep(3000); // Let the user actually see something!
		  //Verifying Priority is gone
		  Assert.assertFalse(driver.getPageSource().contains("Auto Edited Priority uniuqe awofwwoafn"));
		  
	  }
}
