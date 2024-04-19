package com.in.ExcelRprojectnew;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class whatsnewdetailsPage {
	WebDriver driver;
	@FindBy(xpath="//li[@class=\"level0 nav-1 category-item first level-top ui-menu-item\"]")
	public WebElement whatsnewclick;
	@FindBy(xpath="//span[@class='base']")
	public WebElement whatsnewpagelanding;
	@FindBy(xpath="(//a[text()='Hoodies & Sweatshirts'])[1]")
	public WebElement hoodieslink;
	@FindBy(xpath="(//a[text()='Hoodies and Sweatshirts'])[1]")
	public WebElement hoodieslink2;
	@FindBy(xpath="(//div[@class='product-item-info'])[1]")
	public WebElement firstproductlink;
	@FindBy(xpath="(//div[@class='swatch-option text'])[1]")
	public WebElement firstproductsize;
	@FindBy(xpath="(//div[@class='swatch-option color'])[1]")
	public WebElement firstproductcolor;
	@FindBy(xpath="(//span[text()='Add to Cart'])[1]")
	public WebElement firstproductaddtocartlink;
	@FindBy(xpath="//div[contains(text(),'You added')]")
	public WebElement firstproductaddtocartsuccessfully;
	
			
					
	@FindBy(xpath="//li[@class=\"level0 nav-2 category-item level-top parent ui-menu-item\"]")
	public WebElement womenlink;
	@FindBy(xpath="//li[@class=\"level0 nav-3 category-item level-top parent ui-menu-item\"]")
	public WebElement menlink;
	@FindBy(xpath="//li[@class=\"level0 nav-4 category-item level-top parent ui-menu-item\"]")
	public WebElement gearlink;
	@FindBy(xpath="//li[@class=\"level0 nav-6 category-item last level-top ui-menu-item\"]")
	public WebElement salelink;
	@FindBy(xpath="//li[@class='item']")
	public WebElement baglink;
	@FindBy(xpath="//div[text()='The requested qty is not available']")
	public WebElement bagaddedsucesslink;
	@FindBy(xpath="//a[@class='action add']")
	public WebElement reviewlinkclick;
	@FindBy(xpath="//label[@class='rating-5']")
	public WebElement rating;
	@FindBy(xpath="//input[@name='nickname']")
	public WebElement nickname;
	@FindBy(xpath="//input[@name='title']")
	public WebElement summary;
	@FindBy(xpath="//textarea[@name='detail']")
	public WebElement review;
	@FindBy(xpath="(//button[@type='submit'])[3]")
	public WebElement submit;
	@FindBy(xpath="(//div[contains(text(),'You submitted your review for moderation.')]")
	public WebElement reviewsubmitsucessmsg;
	
	public whatsnewdetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void whatsnewclick() {
		whatsnewclick.click();
	}
	public String whatsnewpagelanding() {
		return whatsnewpagelanding.getText();
	}
	public void hoodieslink() {
		hoodieslink.click();
	}
	public void firstproductmousehoverlink() {
		Actions action=new Actions(driver);
		action.moveToElement(firstproductlink).perform();
	}
	public void firstproductsize() {
		firstproductsize.click();
	}
	public void firstproductcolor() {
		firstproductcolor.click();
	}
	public void firstproductaddtocartlink() {
		firstproductaddtocartlink.click();
	}
	public String firstproductaddtocartsuccessfully() {
		return firstproductaddtocartsuccessfully.getText();
	}
	public void womenlink() {
		womenlink.click();
	}
	public String womenlinktext() {
		return womenlink.getText();
	}
	public void menlink() {
		menlink.click();
	}
	public void gearlink() {
		gearlink.click();
	}
	public void baglink() {
		baglink.click();
	}
	public void bagcartlink() {
		firstproductlink.click();
	}
	public String bagaddedsucesslink() {
		return bagaddedsucesslink.getText();
	}
	public void firstproductlinkclick() {
		firstproductlink.click();
	}
	public void reviewlinkclick() {
		reviewlinkclick.click();
	}
	public void nickname() {
		nickname.sendKeys("Mayuri");
	}
	public void summary() {
		summary.sendKeys("Miss");
	}
	public void review() {
		review.sendKeys("This product is very Bad");
	}
	public void submit() {
		submit.click();
	}
	public void rating() {
		 
		  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", rating);
	}
	public String reviewsubmitsucessmsg() {
		return reviewsubmitsucessmsg.getText();
	}
	public void salelink() {
		salelink.click();
	}
	public void hoodieslink2() {
		hoodieslink2.click();
	}
}
