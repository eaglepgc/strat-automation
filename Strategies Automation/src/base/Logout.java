package base;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout extends Before_and_After_Suite{
  @Test 
public void test() throws InterruptedException {
		test=extent.createTest("Logout");

	  driver.findElement(By.className("welcome-txt")).click();
	  driver.findElement(By.className("fa-sign-out")).click();
	  Thread.sleep(2000); // Let the user actually see something!
	  //Assert.assertEquals(driver.findElement(By.className("auth-btn")),"auth-btn"); // confirms it is ont the correct page by verifying the title
		
  }
}
