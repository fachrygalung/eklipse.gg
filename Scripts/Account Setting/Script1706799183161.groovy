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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import java.util.Random;



String profile_icon = "//div[@class='navigation d-flex show-desktop']//i[@class='ic-user']";
String accountSettings = "//div[@class='navigation d-flex show-desktop']//span[text()='Account Settings']";

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, profile_icon));

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, accountSettings));

WebUI.verifyTextPresent('Account Setting', true); //verify the page is true

//test add account button
String addAccount = "//button[text() = 'Add Account']";

String x_icon = '//img[@class="icon-close-modal float-right"]';

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, addAccount));

WebUI.verifyTextPresent('Twitch', true);

WebUI.verifyTextPresent('Kick', true);

WebUI.verifyTextPresent('Youtube', true);

WebUI.verifyTextPresent('Facebook', true);

WebUI.verifyTextPresent('Connect a new account', true);

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, x_icon));




// #PersonalDetail

//scroll to down
WebUI.scrollToElement(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//p[text() = 'Profile settings']"), 0);

//verify the username and password is corrrect
WebUI.verifyElementAttributeValue(new TestObject().addProperty('xpath', ConditionType.EQUALS, "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"), 'value', GlobalVariable.Name, 0)

WebUI.verifyElementAttributeValue(new TestObject().addProperty('xpath', ConditionType.EQUALS, "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]"), 'value', GlobalVariable.Email, 0)

//click on save changes username and email
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/button[1]"));

WebUI.verifyTextPresent('Your profile has been updated', true);

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Continue']"))


//change password
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Change Password']"))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@name='currentPassword']"), GlobalVariable.Pass);

//Generate New Random Password
String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#%^&*()-_=+";

Random random = new Random();

StringBuilder password = new StringBuilder();

for (int i = 0; i < 10; i++) {
	int randomIndex = random.nextInt(characters.length());
	char randomChar = characters.charAt(randomIndex);
	password.append(randomChar);
}

String newPass = password.toString();

System.out.println("new password is : "+ newPass);

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@name='newPassword']"), newPass);

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@name='confirmPassword']"), newPass);

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]"))

WebUI.verifyTextPresent('Your profile has been updated', true);

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Continue']"))





//back to home
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//span[text()='Home']"))


