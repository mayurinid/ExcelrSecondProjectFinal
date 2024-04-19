package com.in.ExcelRprojectnew;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountcreatePage {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Create an Account']")
	public WebElement createAccountLink;
	@FindBy(xpath = "//span[text()='Create New Customer Account']")
    public WebElement landingAccountPageText;
	@FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstname;
	@FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastname;
	@FindBy(xpath = "//input[@id='email_address']")
    public WebElement emailaddress;
	@FindBy(xpath = "//input[@id='password']")
    public WebElement password;
	@FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement pwconfirmation;
	@FindBy(xpath = "//span[text()='Create an Account']")
    public WebElement btnCreateAccount;
	@FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
    public WebElement registersuccess;
	@FindBy(xpath = "//span[text()='My Account']")
    public WebElement landingonaccountpage;
	@FindBy(xpath = "//div[contains(text(),'There is already an account with this email address.')]")
	private WebElement existingAccountMessage;
	@FindBy(xpath = "//a[text()='click here']")
    public WebElement onclicklink;
	@FindBy(xpath = "//span[text()='Reset My Password']")
    public WebElement restpasswordbtn;
	@FindBy(xpath = "//div[contains(text(),'If there is an account associated with')]")
    public WebElement restpasswordbtnsucess;
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    public WebElement clickSigninlink;
	@FindBy(xpath = "(//span[@class='base']")
    public WebElement afterclicksigninlandingpage;
	@FindBy(xpath = "//input[@id='email']")
    public WebElement loginemailaddress;
	@FindBy(xpath = "//input[@id='pass']")
    public WebElement loginpassword;
	@FindBy(xpath = "//span[text()='Sign In']")
    public WebElement clickSignin;
	@FindBy(xpath = "//span[contains(text(),'Welcome,')]")
    public WebElement aftersigninlandingpage;
	@FindBy(xpath = "(//span[text()='Create an Account'])[1]")
    public WebElement fastcreatelink;
	@FindBy(xpath = "//button[@class='action switch']")
    public WebElement signoutbtn;
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    public WebElement signoutlink;
	
	public AccountcreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void CreateAccouPageclick() {
		createAccountLink.click();
	}
	public String isLandingAccountPageTextDisplayed() {
        return landingAccountPageText.getText();
    }
	public void firstname() {
		firstname.sendKeys("Mayuri");
	}
	public void lastname() {
		lastname.sendKeys("Nidebane");
	}
	public void emailaddress() {
		emailaddress.sendKeys("rnmayuri08@gmail.com");
	}
	public void password() {
		password.sendKeys("Rnmayuri08");
	}
	public void pwconfirmation() {
		pwconfirmation.sendKeys("Rnmayuri08");
	}
	public void btnCreateAccount() {
		btnCreateAccount.click();
	}
	public String registersuccess() {
        return registersuccess.getText();
    }
	public String landingonaccountpage() {
        return landingonaccountpage.getText();
    }
	
	 public String getExistingAccountMessage() {
	       
	        String rs= existingAccountMessage.getText();
	        System.out.println(rs);
	        return rs;
	    }
	 public void onclicklink() {
		 onclicklink.click();
	 }
	 public void restpasswordbtn() {
		 restpasswordbtn.click();
	 }
	 public String restpasswordbtnsucess() {
	        return restpasswordbtnsucess.getText();
	    }
	
	 public void clickSigninlink() {
			clickSigninlink.click();
		}
	 public String afterclicksigninlandingpage() {
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",afterclicksigninlandingpage);
	        return afterclicksigninlandingpage.getText();
	    }
	 public void loginemailaddress() {
		 loginemailaddress.sendKeys("rnmayuri08@gmail.com");
		}
		public void loginpassword() {
			loginpassword.sendKeys("Rnmayuri08");
		}
		 public void clickSignin() {
				clickSignin.click();
			}
		 
		 public String aftersigninlandingpage() {
		        return aftersigninlandingpage.getText();
		    }
		 public void fastcreatelink() {
			 fastcreatelink.click();
			}
		 public void signoutbtn() {
			 signoutbtn.click();
			}
		 public void signoutlink() {
			 signoutlink.click();
			}
		 
}
