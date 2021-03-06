package strat_regresion_test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Envisioning extends Before_and_After_Suite{
	
	
  @Test 

  public void doubleClickOnStrat() throws InterruptedException { 
	  
		test=extent.createTest("doubleClickOnStrat");
		
		//Double Clicking on DO NOT DELETE - AUTOMATION Strat
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'AUTOMATION')]"))).doubleClick().build().perform();
		Thread.sleep(3000); // Let the user actually see something!
		String pagesubtitle = driver.findElement(By.xpath("/html/body/app-root/app-plan/div/div[2]/app-envisioning/section/header/h1/span")).getText();
		assertTrue(pagesubtitle.contains("Final Vision"));

		

  }
}
