package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addproductwithoutsignin extends Base{
	
	@BeforeMethod
	public void browserLunch() {
		Loadproperties();
		browserLunchMethod();
	}
@Test
	public void accountcreate() {	
			whatsnewdetailsPage wdp=new whatsnewdetailsPage(driver);
		wdp.womenlink();
		String Actualwhatsnewpagelanding=wdp.whatsnewpagelanding();
		String Expectedwhatsnewpagelanding="Women";
		Assert.assertTrue(Actualwhatsnewpagelanding.contains(Expectedwhatsnewpagelanding));
		wdp.hoodieslink();
		wdp.firstproductmousehoverlink();
		wdp.firstproductsize();
		wdp.firstproductcolor();
		wdp.firstproductaddtocartlink();
		String Actualfirstproductadded=wdp.firstproductaddtocartsuccessfully();
		String Expectedfirstproductadded="You added";
		Assert.assertTrue(Actualfirstproductadded.contains(Expectedfirstproductadded));
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}

}
