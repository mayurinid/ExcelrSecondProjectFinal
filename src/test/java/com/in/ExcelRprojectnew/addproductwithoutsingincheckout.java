package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addproductwithoutsingincheckout extends Base{
	
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
		wdp.firstproductmousehoverlink();
		wdp.firstproductsize();
		wdp.firstproductcolor();
		wdp.firstproductaddtocartlink();
		String Actualfirstproductadded=wdp.firstproductaddtocartsuccessfully();
		String Expectedfirstproductadded="You added";
		Assert.assertTrue(Actualfirstproductadded.contains(Expectedfirstproductadded));
		cartDetailsPage cdp=new cartDetailsPage(driver);
		Thread.sleep(2000);
		cdp.cartlink();
		cdp.cartviewlink();
			String Actualshopingsucess=cdp.shopingcartpagesucess();
		String Expectedshopingsucess="Shopping Cart";
		Assert.assertEquals(Actualshopingsucess, Expectedshopingsucess);
		
		Thread.sleep(2000);
		cdp.checkoutbtn();
		Thread.sleep(2000);
		shoppingaddress sa=new shoppingaddress(driver);
//		sa.username();
//		Thread.sleep(2000);
//		sa.password();
//		sa.loginbtn();
//		Thread.sleep(2000);
//		sa.firstname();
//		sa.lastname();
		Thread.sleep(2000);
		sa.company();
		sa.address();
		sa.city();
		sa.postcode();
		sa.country();
		sa.state();
		sa.telephone();
		Thread.sleep(4000);
		sa.nextbtnclick();
		
		Thread.sleep(2000);		
cdp.nextbtn();
Thread.sleep(2000);	
cdp.placeorderbtn();
String Actualshopingsucess1=cdp.orderplcaedmes();
String Expectedshopingsucess1="Thank you for your purchase!";
Assert.assertEquals(Actualshopingsucess1, Expectedshopingsucess1);
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}

}
