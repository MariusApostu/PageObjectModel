package tests;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class WindowHandleExample extends BaseTest {
	
	
	@Test
	public void windowHandleExample() {
		
		driver.get("https://keybooks.ro/event/seminar-of-modern-art/");
		
		
		driver.switchTo().frame(app.getWebElement(app.genericEvent.mapFrame));
		app.scrollVertically(900);
		app.click(app.genericEvent.viewLargerMapLink);
		
	}

}
