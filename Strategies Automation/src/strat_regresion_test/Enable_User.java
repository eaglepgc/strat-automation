package strat_regresion_test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Before_and_After_Suite;

public class Enable_User extends Before_and_After_Suite{
	  
	  @Test //Enable User
	  public void test() throws InterruptedException { 
		  
			test=extent.createTest("Enable User");
			
			  //Clicking Action Menu 
			  driver.findElement(By.xpath("//html/body/app-root/app-usermgmt/div/div/p-datatable/div/div[1]/table/tbody/tr[2]/td[5]/span/div/i")).click();
			  Thread.sleep(3000); // Let the user actually see something!
			  //Click Enable
			  driver.findElement(By.xpath("//html/body/app-root/app-usermgmt/p-menu/div/ul/li[3]/a")).click();
			  Thread.sleep(3000); // Let the user actually see something!
			  //Verifying Enabled Status
			  String enabledStatus = driver.findElement(By.xpath("//html/body/app-root/app-usermgmt/div/div/p-datatable/div/div[1]/table/tbody/tr[2]/td[3]/span/div/div")).getText();
			  assertTrue(enabledStatus.contains("Enabled"));
			  
	  }			
}
