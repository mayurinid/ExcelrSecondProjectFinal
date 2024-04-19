package com.in.ExcelRprojectnew;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccountdetails {
	WebDriver driver;
	@FindBy(xpath="//a[text()='My Account']")
	public WebElement myaccountlinkclick;
	@FindBy(xpath="(//li[@class='nav item'])[1]")
	public WebElement myaccountorderlinkclick;
	@FindBy(xpath="//a[@class='action view']")
	public WebElement myaccountorderviewlinkclick;
	@FindBy(xpath="(//li[@class='nav item'])[3]")
	public WebElement myaccountwishlist;
	@FindBy(xpath="//a[@data-role='remove']")
	public WebElement myaccountwishlistremove;
	@FindBy(xpath="//div[contains(text(),'has been removed from your Wish List.')]")
	public WebElement myaccountwishlistremovesucessmsg;
	@FindBy(xpath="(//a[@id='compare-clear-all'])")
	public WebElement myaccountcompareclear;
	@FindBy(xpath="//button[@class='action-primary action-accept']")
	public WebElement myaccountcompareokbtn;
	@FindBy(xpath="//div[contains(text(),'You cleared the')]")
	public WebElement myaccountcompareremovesucessmsg;
	@FindBy(xpath="(//li[@class='nav item'])[9]")
	public WebElement myaccountreviewclick;
	@FindBy(xpath="(//li[@class='nav item'])[6]")
	public WebElement myaccountinformationclick;
	@FindBy(xpath="(//li[@class='nav item'])[5]")
	public WebElement myaccountaddressbookclick;
	@FindBy(xpath="//span[@class='base']")
	public WebElement myaccountaddressbookmsg;
	@FindBy(xpath="//a[@class='action more']")
	public WebElement myaccountreviewseedetails;
	@FindBy(xpath="//button[@class='action save primary']")
	public WebElement myaccountsavebutton;
	@FindBy(xpath="//div[contains(text(),'You saved the account information.')]")
	public WebElement myaccountinfosavesucessmsg;
	@FindBy(xpath="//button[@class='action primary add']")
	public WebElement addnewaddress;
	@FindBy(xpath="//input[@name='default_shipping']")
	public WebElement clickcheckbox;
	@FindBy(xpath="//button[@class='action save primary']")
	public WebElement saveaddressbtn;
	
	public myaccountdetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickcheckbox() {
		clickcheckbox.click();
	}
	public void saveaddressbtn() {
		saveaddressbtn.click();
	}
	public String myaccountinfosavesucessmsg() {
		return myaccountinfosavesucessmsg.getText();
	}
	public void addnewaddress() {
		addnewaddress.click();
	}
	public void myaccountaddressbookclick() {
		myaccountaddressbookclick.click();
		}
	public void myaccountsavebutton() {
		myaccountsavebutton.click();
	}
	public void myaccountreviewseedetails() {
		myaccountreviewseedetails.click();
	}
	public void myaccountinformationclick() {
		myaccountinformationclick.click();
		}
	public void myaccountreviewclick() {
		myaccountreviewclick.click();
		}
	public String myaccountaddressbookmsg() {
		return myaccountaddressbookmsg.getText();
	}
	public void myaccountorderviewlinkclick() {
		myaccountorderviewlinkclick.click();
	}
	public void myaccountorderlinkclick() {
		myaccountorderlinkclick.click();
	}
	public void myaccountlinkclick()
{
		myaccountlinkclick.click();		
}
	public void myaccountwishlist() {
		myaccountwishlist.click();
	}
	public void myaccountwishlistremove() {
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",myaccountwishlistremove);
		
	}
	public String myaccountwishlistremovesucessmsg() {
		return myaccountwishlistremovesucessmsg.getText();
	}
	public void myaccountcompareclear() {
		myaccountcompareclear.click();
	}
	public void myaccountcompareokbtn() {
		myaccountcompareokbtn.click();
	}
	public String myaccountcompareremovesucessmsg() {
		return myaccountcompareremovesucessmsg.getText();
	}
}
