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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.automationtesting.in/Index.html')

WebUI.click(findTestObject('Object Repository/Page_Index/button_Skip Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_SwitchTo'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_Alerts'))

WebUI.click(findTestObject('Object Repository/Page_Alerts/a_Alert with Textbox'))

WebUI.click(findTestObject('Object Repository/Page_Alerts/div_click the button to demonstrate the pro_24a297'))

WebUI.click(findTestObject('Object Repository/Page_Alerts/button_click the button to demonstrate the _b1783c'))

WebUI.click(findTestObject('Object Repository/Page_Alerts/button_click the button to demonstrate the _b1783c'))

WebUI.click(findTestObject('Object Repository/Page_Alerts/button_click the button to demonstrate the _b1783c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alerts/p_Hello Automation Testing user How are you today'), 
    0)

