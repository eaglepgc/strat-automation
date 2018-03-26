package strat_regresion_test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class AddBeliefs extends Before_and_After_Suite
{
	
	
	  @Test
	  
	  public void addBeliefs() throws InterruptedException { 
		  
			test=extent.createTest("addBeliefs");
			
			//Enter text into AddPurpose
			driver.findElement(By.xpath("/html/body/app-root/app-plan/div/div[2]/app-envisioning/section/ul/li[3]/app-rich-content/div[2]/div[3]/div[2]")).clear();
			driver.findElement(By.xpath("/html/body/app-root/app-plan/div/div[2]/app-envisioning/section/ul/li[3]/app-rich-content/div[2]/div[3]/div[2]")).sendKeys("This is a Belief");
			Thread.sleep(7000); // Let the user actually see something!
			//Verify the save
			//driver.navigate().refresh();// refresh page
			String pagesubtitle = driver.findElement(By.xpath("/html/body/app-root/app-plan/div/div[2]/app-envisioning/section/ul/li[3]/app-rich-content/div[2]/div[3]/div[2]")).getText();
			assertTrue(pagesubtitle.contains("This is a Belief"));
	  }
	}
