package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.app.base.Base;

public class SelectHotelLocator extends Base {
	//PageFactory
		@FindBy(id="radiobutton_0")
		private WebElement radioButton;
		@FindBy(id="continue")
		private WebElement continueButton;
		
		public WebElement getRadioButton() {
			return radioButton;
		}
		public WebElement getContinueButton() {
			return continueButton;
		}
		
}
