package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRprojectnew.AccountcreatePage;
import com.in.ExcelRprojectnew.cartDetailsPage;
import com.in.ExcelRprojectnew.whatsnewdetailsPage;

public class editcartaddedproduct extends Base{
	
	@BeforeMethod
	public void browserLunch() {
		Loadproperties();
		browserLunchMethod();
	}
@Test
	public void accountcreate() throws InterruptedException {
		AccountcreatePage cap = new AccountcreatePage(driver);
		cap.clickSigninlink();
		cap.loginemailaddress();
		cap.loginpassword();
		cap.clickSignin();
		String Actualaftersigninlanding1=cap.aftersigninlandingpage();
		String Expectedaftersigninlanding1="Welcome,";
		Assert.assertTrue(Actualaftersigninlanding1.contains(Expectedaftersigninlanding1));
		whatsnewdetailsPage wdp=new whatsnewdetailsPage(driver);
		wdp.womenlink();
		String Actualwhatsnewpagelanding=wdp.whatsnewpagelanding();
		String Expectedwhatsnewpagelanding="Women";
		Assert.assertTrue(Actualwhatsnewpagelanding.contains(Expectedwhatsnewpagelanding));
		wdp.hoodieslink();
		wdp.firstproductlinkclick();
		wdp.firstproductsize();
		wdp.firstproductcolor();
		wdp.firstproductaddtocartlink();
		String Actualfirstproductadded=wdp.firstproductaddtocartsuccessfully();
		String Expectedfirstproductadded="You added";
		Assert.assertTrue(Actualfirstproductadded.contains(Expectedfirstproductadded));
		cartDetailsPage cdp=new cartDetailsPage(driver);
		Thread.sleep(1000);
		cdp.cartlink();
		cdp.cartviewlink();
			String Actualshopingsucess=cdp.shopingcartpagesucess();
		String Expectedshopingsucess="Shopping Cart";
		Assert.assertEquals(Actualshopingsucess, Expectedshopingsucess);
		cdp.editbtn();
		wdp.firstproductsize();
		wdp.firstproductcolor();
		cdp.updatebtn();
		String Actualfirstproductadded1=cdp.updatedsuceessmessge();
		String Expectedfirstproductadded1="was updated in your shopping cart.";
		Assert.assertTrue(Actualfirstproductadded1.contains(Expectedfirstproductadded1));
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}

}
