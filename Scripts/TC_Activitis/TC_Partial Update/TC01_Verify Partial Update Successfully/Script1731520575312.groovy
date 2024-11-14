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

'step 1'
WebUI.callTestCase(findTestCase('Block/Create Token'), [:], FailureHandling.STOP_ON_FAILURE)

'step 2'
WebUI.callTestCase(findTestCase('Block/Create Booking'), [:], FailureHandling.STOP_ON_FAILURE)

'step 3'
PartialResponse = WS.sendRequest(findTestObject('Booking/Partial_Update_Booking'))

'step 4'
WS.verifyResponseStatusCode(PartialResponse, 200)

'step 5'
Number Price = WS.getElementPropertyValue(PartialResponse, 'totalprice')

'step 6'
String Checkin = WS.getElementPropertyValue(PartialResponse, 'bookingdates.checkin')

'step 7'
String Checkout = WS.getElementPropertyValue(PartialResponse, 'bookingdates.checkout')

'step 8'
String Deposit = WS.getElementPropertyValue(PartialResponse, 'depositpaid')

'step 9'
String Needs = WS.getElementPropertyValue(PartialResponse, 'additionalneeds')

'step 10'
WS.verifyElementPropertyValue(PartialResponse, 'firstname', 'Mohammad')

'step 11'
WS.verifyElementPropertyValue(PartialResponse, 'lastname', 'Nurdiansyah')

'step 12'
WS.verifyElementPropertyValue(PartialResponse, 'totalprice', Price)

'step 13'
WS.verifyElementPropertyValue(PartialResponse, 'depositpaid', Deposit)

'step 14'
WS.verifyElementPropertyValue(PartialResponse, 'bookingdates.checkin', Checkin)

'step 15'
WS.verifyElementPropertyValue(PartialResponse, 'bookingdates.checkout', Checkout)

'step 16'
WS.verifyElementPropertyValue(PartialResponse, 'additionalneeds', Needs)

