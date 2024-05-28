package tests;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ContactsTest extends BaseTest{
	
	@Test
	public void sendMessageFromContactFormTest() {
		
		app.click(app.menu.contactsLink);
		
		app.sendKeys(app.contacts.nameField, "Albus Dumbledore");
		app.sendKeys(app.contacts.emailField, "principal@hogwards.com");
		app.sendKeys(app.contacts.subjectField, "Admission");
		app.sendKeys(app.contacts.msgField, "do you want to be a wizard? join the magic school! ");
		app.click(app.contacts.submitBtn);
		
		
	}

}
