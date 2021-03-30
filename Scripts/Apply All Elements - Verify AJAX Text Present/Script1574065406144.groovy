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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('To enable the Smart Wait function for the whole project in Katalon Studio, navigate to Project > Settings > Execution> Select Enable in Default Smart Wait.')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.tutorialzine.com/2009/09/simple-ajax-website-jquery/demo.html')

WebUI.click(findTestObject('Page_AjaxDemo/a_Page 1'))

WebUI.verifyTextPresent('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam feugiat neque vel metus sodales auctor sed et arcu. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus cursus tellus ac urna sollicitudin viverra.', 
    false)

WebUI.click(findTestObject('Page_AjaxDemo/a_Page 2'))

WebUI.verifyElementText(findTestObject('Page_AjaxDemo/div_Page2_Content'), 'Aliquam imperdiet tempor facilisis. Sed elementum ultrices vulputate. In hac habitasse platea dictumst. In et accumsan turpis. Nullam laoreet posuere eros ac iaculis. Nullam ut velit arcu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam erat volutpat.')

WebUI.closeBrowser()

