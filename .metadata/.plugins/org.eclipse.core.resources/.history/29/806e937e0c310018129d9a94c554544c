package strat_regresion_test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import base.Before_and_After_Suite;


public class Institution_Selector_Cobb extends Before_and_After_Suite {
	
  @Test
  public void institution_selector_cobb() throws InterruptedException {
	  
		test=extent.createTest("Inst Selector");

	  driver.findElement(By.className("ng-untouched")).sendKeys("Cobb County School District");
	  driver.findElement(By.className("pointer")).click();
	  Thread.sleep(2000); // Let the user actually see something!
	  Assert.assertEquals(driver.getTitle(), "eProve™ strategies"); // confirms it is ont the correct page by verifying the title
		
  }
}
