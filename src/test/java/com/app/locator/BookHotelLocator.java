package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelLocator {
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnumber;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id="book_now")
	private WebElement bookHotel;
	
	public WebElement getFirstName() {
		return firstname;
	}
	
	public WebElement getLastName() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCCNumber() {
		return ccnumber;
	}
	public WebElement getCCType() {
		return cctype;
	}
	public WebElement getExpiryMonth() {
		return expirymonth;
	}
	public WebElement getExpiryYear() {
		return expiryyear;
	}
	public WebElement getCvvNumber() {
		return expiryyear;
	}
	
	public WebElement bookHotel() {
		return bookHotel;
	}

}
