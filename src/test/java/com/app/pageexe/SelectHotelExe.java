package com.app.pageexe;

import com.app.base.Base;
import com.app.locator.SearchHotelLocator;
import com.app.locator.SelectHotelLocator;

public class SelectHotelExe extends SelectHotelLocator {
	public static void radioButton() 
	{
		Base.elementClick(new SelectHotelLocator().getRadioButton());
		
	}
	public static void continueButton() 
	{
		Base.elementClick(new SelectHotelLocator().getContinueButton());
		
	}

}
