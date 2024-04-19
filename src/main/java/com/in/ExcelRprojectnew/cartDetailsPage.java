package com.in.ExcelRprojectnew;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartDetailsPage {
	WebDriver driver;
	@FindBy(xpath="//a[@class='action showcart']")
	public WebElement cartlink;
	@FindBy(xpath="//a[@class='action viewcart']")
	public WebElement cartviewlink;
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public WebElement shopingcartpagesucess;
	@FindBy(xpath="//a[@class='action action-edit']")
	public WebElement editbtn;
	@FindBy(xpath="//button[@title='Update Cart']")
	public WebElement updatebtn;
	@FindBy(xpath="//div[contains(text(),'was updated in your shopping cart.')]")
	public WebElement updatedsuceessmessge;
	@FindBy(xpath="(//a[@title='Remove item'])[2]")
	public WebElement cartremoveproduct;
	@FindBy(xpath="(//a[@class='action towishlist'])[1]")
	public WebElement aadtowistlist;
	@FindBy(xpath="//div[contains(text(),'has been added to your Wish List.')]")
	public WebElement addtowishlistsucess;
	@FindBy(xpath="//a[@class='action tocompare']")
	public WebElement addtocompare;
	@FindBy(xpath="//div[contains(text(),'You added product')]")
	public WebElement addtocomparesucess;
	@FindBy(xpath="(//button[@class='action primary checkout'])[2]")
	public WebElement checkoutbtn;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement nextbtn;
	@FindBy(xpath="//button[@class='action primary checkout']")
	public WebElement placeorderbtn;
	@FindBy(xpath="//span[contains(text(),'Thank you for your purchase!')]")
	public WebElement orderplcaedmes;
	
	public cartDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void checkoutbtn() {
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutbtn);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkoutbtn);	
	}
	public void nextbtn() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextbtn);	
	}
	public void placeorderbtn() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", placeorderbtn);	
	}
	public String orderplcaedmes() {
		return orderplcaedmes.getText();
	}
	public void cartlink() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		cartlink.click();
	}
	public void cartviewlink() {
		cartviewlink.click();
	}
	public String shopingcartpagesucess() {
		return shopingcartpagesucess.getText();
	}
	public void editbtn() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",editbtn);
		editbtn.click();
	}
	public void cartremoveproduct()
	{
			cartremoveproduct.click();		
	}
	public void updatebtn()
{
		updatebtn.click();		
}
	public String updatedsuceessmessge() {
		return updatedsuceessmessge.getText();
	}
	public void addtowistlist() {
		aadtowistlist.click();
	}
	public String addtowishlistsucess() {
		return addtowishlistsucess.getText();
	}
	public void addtocompare() {
		addtocompare.click();
	}
	public String addtocomparesucess() {
		return addtocomparesucess.getText();
	}
}
