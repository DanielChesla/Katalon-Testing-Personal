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

WebUI.maximizeWindow()

//Testing Git process//

WebUI.navigateToUrl('https://danielchesla.com/')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daniel Cheslas personal website/h1_This is Daniels new page using bootstrap'), 
    'This is Daniel\'s new page using bootstrap')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daniel Cheslas personal website/div_About Me'), 'About Me')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daniel Cheslas personal website/div_Skills'), 'Skills')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daniel Cheslas personal website/div_Industries'), 'Industries')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daniel Cheslas personal website/div_Education'), 'Education')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Daniel Cheslas personal website/a_Go to my home page'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Daniel Cheslas personal website/a_View me on GitHub'))

