package com.app.locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.app.base.Base;

public class SearchHotelLocator extends Base {
	//PageFactory
		@FindBy(id="location")
		private WebElement location;
		@FindBy(id="hotels")
		private WebElement hotel;
		@FindBy(id="room_type")
		private WebElement roomType;
		@FindBy(id="room_nos")
		private WebElement roomNos;
		@FindBy(id="datepick_in")
		private WebElement datePickIn;
		@FindBy(id="datepick_out")
		private WebElement datePickOut ;
		@FindBy(id="adult_room")
		private WebElement adults;
		@FindBy(id="child_room")
		private WebElement children ;
		@FindBy(id="Submit")
		private WebElement submitButt;
		
		public WebElement getLocation() {
			return location;
		}
		
		public WebElement getHotels() {
			return hotel;
		}
		public WebElement getRoomType() {
			return roomType;
			
		}
		public WebElement getRoomNos() {
			return roomNos;
		}
		
		public  WebElement dateIn() {
			return datePickIn;
		}
		public  WebElement dateOut() {
			return datePickOut;
		}
		
		public  WebElement getAdult() {
			return adults;
		}
		
		public WebElement getChildren() {
			return children;
		}
		
		public WebElement submitButton() {
			 return submitButt;
		}


}
