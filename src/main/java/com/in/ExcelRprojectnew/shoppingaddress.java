package com.in.ExcelRprojectnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class shoppingaddress {
WebDriver driver;
@FindBy (xpath="(//input[@name='username'])[2]") public WebElement username;
@FindBy (xpath="((//input[@name='firstname'])") public WebElement firstname;
@FindBy (xpath="(//input[@name='lastname'])") public WebElement lastname;
@FindBy (xpath="(//input[@name='company'])") public WebElement company;
@FindBy (xpath="(//input[@name='street[0]'])") public WebElement address1;
@FindBy (xpath="(//input[@name='street[]'])") public WebElement address;
@FindBy (xpath="(//input[@name='street[1]'])") public WebElement address2;
@FindBy (xpath="(//input[@name='street[2]'])") public WebElement address3;
@FindBy (xpath="(//input[@name='city'])") public WebElement city;
@FindBy (xpath="(//select[@name='region_id'])") public WebElement state;
@FindBy (xpath="(//input[@name='postcode'])") public WebElement postcode;
@FindBy (xpath="(//select[@name='country_id'])") public WebElement country;
@FindBy (xpath="(//input[@name='telephone'])") public WebElement telephone;
@FindBy (xpath="//button[@class='button action continue primary']") public WebElement next;
@FindBy (xpath="(//input[@class='input-text'])[3]") public WebElement password;
@FindBy (xpath="//button[@class='action login primary']") public WebElement loginbtn;
shoppingaddress(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void username() {
username.sendKeys("mayurinidebane08@gmail.com");
}
public void firstname() {
	firstname.sendKeys("Mayuri");
}
public void lastname() {
	lastname.sendKeys("Nidebane");
}
public void addresss() {
	address.sendKeys("Mayuri Nidebane Mahesh Nagar Bidar");
}
public void password() {
	password.sendKeys("Rnmayuri08");
}
public void loginbtn() {
	loginbtn.click();
}
public void company() {
	company.sendKeys("GNDECB");
}
public void address() {
	address1.sendKeys("Mayuri");
	address2.sendKeys("Mahesh Nagar");
	address3.sendKeys("Bidar");
}
public void city() {
	city.sendKeys("Bidar");
}
public void country() {
	Select action=new Select(country);
	action.selectByVisibleText("India");
}
public void postcode() {
	postcode.sendKeys("585401");
}
public void state() {
	Select action=new Select(state);
	action.selectByVisibleText("Karnataka");
}
public void telephone() {
	telephone.sendKeys("9591174005");
}
public void nextbtnclick() {
	next.click();
}
}
