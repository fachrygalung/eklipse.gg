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
import com.kms.katalon.core.testobject.ConditionType as ConditionType


/*WebUI.openBrowser('https://eklipse.gg')

WebUI.maximizeWindow()

String signUp_btn = '//div/a[@class= \'btn btn-register\']'

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, signUp_btn))

String loginLink = '//p[@class=\'login-link\']/a'

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, loginLink))

WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'username'), GlobalVariable.Email)

WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'password'), GlobalVariable.Pass)

String submit = '//button[@type=\'submit\']'

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, submit))

try {
    WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//button[text()=\'Skip for now\']'))
}
catch (Exception e) {
} */

//after login
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[text()=\'Edited Clips\']'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[text()=\'Edited Clips\']'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//button[text() = \'Convert to TikTok / Shorts / Reels\']'))

WebUI.uploadFile(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//input[@type="file"]'), '/Users/abdulraffi/Katalon Studio/QA Test Eklipse/Data Files/Valorant.mp4')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//p[text()=\'Valorant\']'))

String Battle_Valorant = '//div[@class="MuiBox-root css-1nwm8s6"]/div[1]//div[@role="tablist"]/div[4]'

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, Battle_Valorant))

WebUI.click(new TestObject().addProperty('id', ConditionType.EQUALS, 'continue-editing-btn'))


WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Next']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Text']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@class='MuiBox-root css-1j1mnsu']//input[@type='checkbox']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//div[@class="MuiBox-root css-8vbifb"]/div[5]/p'))


WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Confirm']"))

Thread.sleep(3000);

WebUI.verifyTextPresent("Thank you", true)

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Got it!']"))

//back to home
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//span[text()='Home']"))

WebUI.closeBrowser();







