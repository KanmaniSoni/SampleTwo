package com.app.exe;
import com.app.base.Base;
import com.app.locator.SearchHotelLocator;
import com.app.pageexe.BookHotelExe;
import com.app.pageexe.LoginPageExe;
import org.junit.Test;
import org.junit.Before;
import com.app.pageexe.SearchHotelExe;
import com.app.pageexe.SelectHotelExe;

public class Exe extends LoginPageExe{
	
	@Before
	public void setUp()
	{
		browserLaunch();
		loadUrl(Base.prop_reuse("url"));
	}
	@Test
	public void testLogin() {
		username();
		password();
		loginButton();
	}
	@Test
	public void testSearchHotel()
	{
		SearchHotelExe.location();
		SearchHotelExe.hotels();
		SearchHotelExe.roomType();
		SearchHotelExe.roomNos();
		SearchHotelExe.datePickIn();
		SearchHotelExe.datePickOut();
		SearchHotelExe.adults();
		SearchHotelExe.children();
		SearchHotelExe.submit();
	}
	@Test
	public void testSelectHotel()
	{
		SelectHotelExe.radioButton();
		SelectHotelExe.continueButton();
	}
	@Test
	public void testBookHotel()
	{
		BookHotelExe.firstName();
		BookHotelExe.lastName();
		BookHotelExe.address();
		BookHotelExe.ccNumber();
		BookHotelExe.ccType();
		BookHotelExe.expiryMonth();
		BookHotelExe.expiryYear();
		BookHotelExe.cvvNumber();
	}
	@Test
	public void closeApp()
	{
		driver.quit();
	}
	
}
