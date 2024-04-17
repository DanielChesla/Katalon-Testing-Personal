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

WebUI.navigateToUrl('https://danielchesla.com/loan.html')

WebUI.setText(findTestObject('Object Repository/Page_Loan Amortization Calculator/input_Principal Amount_principal'), '100000')

WebUI.setText(findTestObject('Object Repository/Page_Loan Amortization Calculator/input_Annual Interest Rate ()_interest'), 
    '6.9')

WebUI.setText(findTestObject('Object Repository/Page_Loan Amortization Calculator/input_Loan Term (years)_term'), '30')

WebUI.click(findTestObject('Object Repository/Page_Loan Amortization Calculator/button_Calculate'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Loan Amortization Calculator/h2_Results'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Loan Amortization Calculator/p_Monthly Payment 658.60'), 
    'Monthly Payment: $658.60')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Loan Amortization Calculator/p_Total Interest Paid 137096.05'), 
    'Total Interest Paid: $137096.05')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Loan Amortization Calculator/td_360'), '360')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Loan Amortization Calculator/td_658.60'), '$658.60')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Loan Amortization Calculator/td_654.83'), '$654.83')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Loan Amortization Calculator/td_3.77'), '$3.77')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Loan Amortization Calculator/td_-0.00'), '$-0.00')

WebUI.closeBrowser()

