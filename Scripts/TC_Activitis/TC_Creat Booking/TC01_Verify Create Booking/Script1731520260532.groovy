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
CreateResponse = WS.sendRequest(findTestObject('Booking/Create_Booking'))

'step 2'
WS.verifyResponseStatusCode(CreateResponse, 200)

'step 3'
Number GetId = WS.getElementPropertyValue(CreateResponse, 'bookingid')

'step 4'
WS.verifyElementPropertyValue(CreateResponse, 'bookingid', GetId)

'step 5'
WS.verifyElementPropertyValue(CreateResponse, 'booking.firstname', 'Dian')

'step 7'
WS.verifyElementPropertyValue(CreateResponse, 'booking.lastname', 'Syah')

'step 8'
WS.verifyElementPropertyValue(CreateResponse, 'booking.totalprice', 201)

'step 9'
WS.verifyElementPropertyValue(CreateResponse, 'booking.depositpaid', true)

'step 10'
WS.verifyElementPropertyValue(CreateResponse, 'booking.bookingdates.checkin', '2024-12-19')

'step 11'
WS.verifyElementPropertyValue(CreateResponse, 'booking.bookingdates.checkout', '2025-12-19')

'step 12'
WS.verifyElementPropertyValue(CreateResponse, 'booking.additionalneeds', 'Coffee')
