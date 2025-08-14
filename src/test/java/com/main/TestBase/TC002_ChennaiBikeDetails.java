package com.main.TestBase;
import org.testng.annotations.Test;
import com.main.pages.ChennaiBikes;
import com.main.pages.HomePage;

public class TC002_ChennaiBikeDetails extends BaseClass{
  @Test
  public void DisplayChennaiBikes() {
	    HomePage home=new HomePage(driver);
		home.clickMore();
		System.out.println("--------start Display method in Test--------");
		ChennaiBikes chennaibikes=new ChennaiBikes(driver);
		chennaibikes.usedCars();
		System.out.println("--------Display method done in Test---------");
	}
}
