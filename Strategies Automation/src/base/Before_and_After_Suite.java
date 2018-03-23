package base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Before_and_After_Suite {
	public static 
	 
	WebDriver driver;
	String baseURL;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@Parameters ("browser")
	
	@BeforeSuite
	
	public void setUp(String browser) {
		// This selects the Chrome Driver and opens it//
		// must use your driver's location//
		baseURL= "http://devstrategies.advanc-ed.org:8113/";
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "c:/Java_Drivers_Selenium/chromedriver.exe");
			driver = new ChromeDriver();
		
		} else if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "c:/Java_Drivers_Selenium/geckodriver.exe");
			driver = new FirefoxDriver();
	

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	@BeforeSuite
	
	public void startReport()
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
	}
	@AfterMethod
	  public void getResult(ITestResult result)
	{
		  if(result.getStatus() == ITestResult.FAILURE)
		  {
			
			  test.fail(MarkupHelper.createLabel(result.getName()+ " - Test Case Failed for the below reason(s)", ExtentColor.RED));
			  test.fail(result.getThrowable());
			  }
		  else if(result.getStatus() == ITestResult.SUCCESS)
		  {
			  test.pass(MarkupHelper.createLabel(result.getName()+ " - Test Case PASSED", ExtentColor.GREEN)); 
			  }
		  else
		  {
			  test.skip(MarkupHelper.createLabel(result.getName()+ " - Test Case SKIPPED", ExtentColor.YELLOW));
			  test.skip(result.getThrowable());
		  }
	  }
	  
	  
		@AfterSuite
		public void endReport(){
			extent.flush();
			driver.quit();
		}

	  }