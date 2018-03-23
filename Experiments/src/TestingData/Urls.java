package TestingData;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class Urls {
  
  @DataProvider(name="UserNamePassword")
  public static Object[][] Provider(ITestContext context) throws Exception
  {
      String dataFile = context.getCurrentXmlTest().getParameter("dataFile");
  }
}