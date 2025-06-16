package com.app.pageexe;

import com.app.base.Base;
import com.app.locator.LoginPageLocator;
import com.app.locator.SearchHotelLocator;

public class SearchHotelExe extends SearchHotelLocator {
	public static void location() {
		Base.selectIndex(new SearchHotelLocator().getLocation(),2);
	}
	public static void hotels() {
		Base.selectIndex(new SearchHotelLocator().getHotels(),2);
	}
	public static void roomType() {
		Base.selectIndex(new SearchHotelLocator().getRoomType(),3);
	}
	public static void roomNos() {
		Base.selectIndex(new SearchHotelLocator().getRoomNos(),3);
	}
	public static void datePickIn() {
		Base.inputKey(new SearchHotelLocator().dateIn(), Base.exread(1,10));
	}
	public static void datePickOut() {
		Base.inputKey(new SearchHotelLocator().dateOut(), Base.exread(1,11));
	}
	public static void adults() {
		Base.selectIndex(new SearchHotelLocator().getAdult(),3);
	}
	public static void children() {
		Base.selectIndex(new SearchHotelLocator().getChildren(),3);
	}
	public static void submit() 
	{
		Base.elementClick(new SearchHotelLocator().submitButton());
		
	}

}
