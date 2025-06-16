package com.app.pageexe;

import com.app.base.Base;
import com.app.locator.SearchHotelLocator;
import com.app.locator.BookHotelLocator;

public class BookHotelExe extends BookHotelLocator{
	public static void firstName()
	{
	     Base.inputKey(new BookHotelLocator().getFirstName(), Base.exread(1,2));
	}
	public static void lastName()
	{
	     Base.inputKey(new BookHotelLocator().getLastName(), Base.exread(1,3));
	}
	public static void address()
	{
	     Base.inputKey(new BookHotelLocator().getAddress(), Base.exread(1,4));
	}
	public static void ccNumber()
	{
	     Base.inputKey(new BookHotelLocator().getCCNumber(), Base.exread(1,5));
	}
	public static void ccType()
	{
		Base.selectIndex(new BookHotelLocator().getCCType(),2);
	}
	public static void expiryMonth()
	{
		Base.selectIndex(new BookHotelLocator().getExpiryMonth(),2);
	}
	public static void expiryYear()
	{
		Base.selectIndex(new BookHotelLocator().getExpiryYear(),2);
	}
	public static void cvvNumber()
	{
	     Base.inputKey(new BookHotelLocator().getCvvNumber(), Base.exread(1,6));
	}
	public static void book()
	{
	     Base.elementClick(new BookHotelLocator().bookHotel());
	}

	
	
}
