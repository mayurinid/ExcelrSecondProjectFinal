package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class accountaddressbook extends Base{
	
	@BeforeMethod
	public void browserLunch() {
		Loadproperties();
		browserLunchMethod();
	}
@Test
	public void accountcreate() {
		AccountcreatePage cap = new AccountcreatePage(driver);
		cap.clickSigninlink();
		cap.loginemailaddress();
		cap.loginpassword();
		cap.clickSignin();
		String Actualaftersigninlanding1=cap.aftersigninlandingpage();
		String Expectedaftersigninlanding1="Welcome,";
		Assert.assertTrue(Actualaftersigninlanding1.contains(Expectedaftersigninlanding1));
		myaccountdetails mad=new myaccountdetails(driver);
		cap.signoutbtn();
		mad.myaccountlinkclick();
		mad.myaccountaddressbookclick();
		String Actualfirstproductadded1=mad.myaccountaddressbookmsg();
		String Expectedfirstproductadded1="Address Book";
		Assert.assertTrue(Actualfirstproductadded1.contains(Expectedfirstproductadded1));
		mad.addnewaddress();
		shoppingaddress sa=new shoppingaddress(driver);
	
		sa.company();
		sa.telephone();
		sa.addresss();
		sa.city();
		sa.postcode();
		sa.country();
		sa.state();
		
		mad.clickcheckbox();
		mad.saveaddressbtn();
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}


}
