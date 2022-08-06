package POAssignmenntwithFindBY;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class POtestngclass {
	HomePageNT homepage;
	MyAccountPage myaccPage;
	
  @Test
  public void test() {
	 /* myaccPage= homepage.login("stc123", "12345");
	  myaccPage.gotocontactUs();
	  myaccPage.logout();*/
	  
	  
	  homepage.login("stc123", "12345").gotocontactUs().logout();
	  
	  
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  homepage = new HomePageNT();
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  homepage.closeBrowser();
	  
	  
  }

}
