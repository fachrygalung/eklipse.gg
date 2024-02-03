import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.ui.SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType

String signUp_btn = "//div/a[@class= 'btn btn-register']";
String submit = "//button[@type='submit']";
String registerPageVerif = "Get started on Eklipse";
String successRegister = "Welcome to Eklipse";
Boolean isRegisterSuccess;


//WebUI.openBrowser("https://eklipse.gg");

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, signUp_btn));

WebUI.verifyTextPresent(registerPageVerif, true, FailureHandling.STOP_ON_FAILURE);

WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'name'), GlobalVariable.Name);

WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'email'), GlobalVariable.Email);

WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'password'), GlobalVariable.Pass);

WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'password_confirmation'), GlobalVariable.Pass);

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, submit));

try{ 
	WebUI.verifyTextPresent(successRegister, true);
	isRegisterSuccess = true;
	
}catch (Exception e) {
	isRegisterSuccess = false;//false because already have the account
	
}


String dropdownOne = "//div[@class='col-md-6 mx-md-auto p-0']/div[1]//div[@class='dropdown']/button";
String dropdownTwo = "//div[@class='col-md-6 mx-md-auto p-0']/div[2]//div[@class='dropdown']/button";
String selectListOne = "//a[@role='button'][6]//span[text()='Other']";
String selectListTwo = "//a[@role='button'][6]//span[text()='Music']";
String chooseRadio = "//div[@class='col-md-6 mx-md-auto p-0']/div[3]/div/div[2]";
String continue_btn = "//button[text()='Continue']";
String skipForNow = "//button[text()='Skip for Now']";

//Register Flow to fill the interest field
if(isRegisterSuccess) {
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, dropdownOne));
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, selectListOne));
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, dropdownTwo));
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, selectListTwo));
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, chooseRadio));
	
	WebUI.click(new TestObject().addProperty('id', ConditionType.EQUALS, 'cookie-close-icon'));
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, continue_btn));
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, skipForNow));
	
	//close pop-up premium
	try {
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Skip for now']"));
		
	}catch (Exception e) {
		
		
		
	}
}//Finished


//if user already registered, it will run login flow
else {
	String loginLink = "//p[@class='login-link']/a"
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, loginLink));
	
	WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'username'), GlobalVariable.Email);
	
	WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'password'), GlobalVariable.Pass);
	
	WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, submit));
	
	
	
	try {
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, dropdownOne));
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, selectListOne));
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, dropdownTwo));
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, selectListTwo));
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, chooseRadio));
		
		WebUI.click(new TestObject().addProperty('id', ConditionType.EQUALS, 'cookie-close-icon'));
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, continue_btn));
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, skipForNow));
	}
	catch (Exception e) {
	
	}
	
	//close pop-up
	try {
		
		WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Skip for now']"));
		
	}catch (Exception e) {
		
		
		
	}
}//Finished

