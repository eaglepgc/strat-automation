package strat_regresion_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Dashboard_regresion extends Before_and_After_Suite{
	
	
  @Test
  public void NewStrategy() throws InterruptedException {
		test=extent.createTest("NewStrategy");
				
	  //New Strategy
	  //Click "New Strategy" button
	  driver.findElement(By.xpath("//html/body/app-root/app-strategies/app-dashboard/div/div/div/button")).click();
	  Thread.sleep(1000); // Let the user actually see something!
	  //Type new strategy Name
	  driver.findElement(By.id("strategyName")).sendKeys("1A Automation Strat");
	  //Select Dates
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[2]/div/p-calendar[1]/span/input")).sendKeys("05/05/2020");
	  Thread.sleep(3000); // Let the user actually see something!
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[2]/div/p-calendar[2]/span/input")).sendKeys("10/10/2020");
	  Thread.sleep(3000); // Let the user actually see something!
	  // Click in neutral area to close date boxes
	  driver.findElement(By.xpath("/html/body/div[3]")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  // Click Save
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[3]/button[2]")).click();
	  Thread.sleep(5000); // Let the user actually see something!
	  // See taht "1A Automation Strat" is on the page
	  Assert.assertTrue(driver.getPageSource().contains("1A Automation Strat"));
 
	  //Edit Strategy
	  //Click Action Menu
	  driver.findElement(By.xpath("/html/body/app-root/app-strategies/app-dashboard/div/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[8]/span/div/i")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  //Click Edit
	  driver.findElement(By.xpath("/html/body/app-root/app-strategies/app-dashboard/p-menu/div/ul/li[2]/a")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  //Change Name
	  driver.findElement(By.id("strategyName")).clear();
	  driver.findElement(By.id("strategyName")).sendKeys("1A Automation Strat Edited");
	  //Change Dates
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[2]/div/p-calendar[1]/span/input")).clear();
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[2]/div/p-calendar[1]/span/input")).sendKeys("10/05/2020");
	  Thread.sleep(3000); // Let the user actually see something!
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[2]/div/p-calendar[2]/span/input")).clear();
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[2]/div/p-calendar[2]/span/input")).sendKeys("10/10/2025");
	  Thread.sleep(3000); // Let the user actually see something!
	  // Click in neutral area to close date boxes
	  driver.findElement(By.xpath("/html/body/div[3]")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  // Click Save
	  driver.findElement(By.xpath("/html/body/div[3]/app-strategy-details/form/div[3]/button[2]")).click();
	  Thread.sleep(5000); // Let the user actually see something!
	  // See that "1A Automation Strat Edited" is on the page
	  Assert.assertTrue(driver.getPageSource().contains("1A Automation Strat Edited"));
	 	  
  	 /* //Copy Strategy
	  //Click Action Menu
	  driver.findElement(By.xpath("/html/body/app-root/app-strategies/app-dashboard/div/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[8]/span/div/i")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  //Click Copy
	  driver.findElement(By.xpath("/html/body/app-root/app-strategies/app-dashboard/p-menu/div/ul/li[5]/a")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  //COPY NOT DONE
*/    
	  //Delete Strategy
	  //Click Action Menu
	  driver.findElement(By.xpath("/html/body/app-root/app-strategies/app-dashboard/div/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[8]/span/div/i")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  //Click Delete
	  driver.findElement(By.xpath("/html/body/app-root/app-strategies/app-dashboard/p-menu/div/ul/li[4]/a")).click();
	  Thread.sleep(3000); // Let the user actually see something!
	  //Click Delete on double-dare model
	  driver.findElement(By.xpath("/html/body/app-root/app-strategies/app-dashboard/p-dialog/div/div[3]/p-footer/button[2]/span")).click();
	  Thread.sleep(10000); // Let the user actually see something!
	  // See that "1A Automation Strat Edited" is NOT on the page
	  Assert.assertFalse(driver.getPageSource().contains("1A Automation Strat Edited"));
  }
}
