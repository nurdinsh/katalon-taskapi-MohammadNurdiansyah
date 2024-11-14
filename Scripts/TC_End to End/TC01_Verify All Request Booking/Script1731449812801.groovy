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
TokenResponse = WS.sendRequest(findTestObject('Auth/Create_Token'))
'step 2'
WS.verifyResponseStatusCode(TokenResponse, 200)
'step 3'
String GetToken = WS.getElementPropertyValue(TokenResponse, 'token')
'step 4'
WS.delay(2)
'step 5'
GlobalVariable.Token = GetToken
'step 6'
CreateResponse = WS.sendRequest(findTestObject('Booking/Create_Booking'))
'step 7'
WS.verifyResponseStatusCode(CreateResponse, 200)
'step 8'
Number GetId = WS.getElementPropertyValue(CreateResponse, 'bookingid')
'step 9'
WS.delay(2)
'step 9'
GlobalVariable.Id = GetId
'step 10'
WS.verifyElementPropertyValue(CreateResponse, 'bookingid', GetId)
'step 11'
WS.verifyElementPropertyValue(CreateResponse, 'booking.firstname', 'Dian')
'step 12'
WS.verifyElementPropertyValue(CreateResponse, 'booking.firstname', 'Dian')
'step 13'
WS.verifyElementPropertyValue(CreateResponse, 'booking.lastname', 'Syah')
'step 14'
WS.verifyElementPropertyValue(CreateResponse, 'booking.totalprice', 201)
'step 15'
WS.verifyElementPropertyValue(CreateResponse, 'booking.depositpaid', true)
'step 16'
WS.verifyElementPropertyValue(CreateResponse, 'booking.bookingdates.checkin', '2024-12-19')
'step 17'
WS.verifyElementPropertyValue(CreateResponse, 'booking.bookingdates.checkout', '2025-12-19')
'step 18'
WS.verifyElementPropertyValue(CreateResponse, 'booking.additionalneeds', 'Coffee')
'step 19'
WS.delay(2)
'step 20'
UpdateResponse = WS.sendRequest(findTestObject('Booking/Update_Booking'))
'step 21'
WS.verifyResponseStatusCode(UpdateResponse, 200)
'step 22'
WS.verifyElementPropertyValue(UpdateResponse, 'firstname', 'Mohammad')
'step 23'
WS.verifyElementPropertyValue(UpdateResponse, 'lastname', 'Nurdiansyah')
'step 24'
WS.verifyElementPropertyValue(UpdateResponse, 'totalprice', 200)
'step 25'
WS.verifyElementPropertyValue(UpdateResponse, 'depositpaid', true)
'step 26'
WS.verifyElementPropertyValue(UpdateResponse, 'bookingdates.checkin', '2024-12-19')
'step 27'
WS.verifyElementPropertyValue(UpdateResponse, 'bookingdates.checkout', '2025-12-19')
'step 28'
WS.verifyElementPropertyValue(UpdateResponse, 'additionalneeds', 'Coffee')
'step 29'
WS.delay(2)
'step 30'
PartialResponse = WS.sendRequest(findTestObject('Booking/Partial_Update_Booking'))
'step 31'
WS.verifyResponseStatusCode(PartialResponse, 200)
'step 32'
Number Price = WS.getElementPropertyValue(PartialResponse, 'totalprice')
'step 33'
String Deposit = WS.getElementPropertyValue(PartialResponse, 'depositpaid')
'step 34'
String Checkin = WS.getElementPropertyValue(PartialResponse, 'bookingdates.checkin')
'step 35'
String Checkout = WS.getElementPropertyValue(PartialResponse, 'bookingdates.checkout')
'step 36'
String Needs = WS.getElementPropertyValue(PartialResponse, 'additionalneeds')
'step 37'
WS.verifyElementPropertyValue(PartialResponse, 'firstname', 'Mohammad')
'step 38'
WS.verifyElementPropertyValue(PartialResponse, 'lastname', 'Nurdiansyah')
'step 39'
WS.verifyElementPropertyValue(PartialResponse, 'totalprice', Price)
'step 40'
WS.verifyElementPropertyValue(PartialResponse, 'depositpaid', Deposit)
'step 41'
WS.verifyElementPropertyValue(PartialResponse, 'bookingdates.checkin', Checkin)
'step 42'
WS.verifyElementPropertyValue(PartialResponse, 'bookingdates.checkout', Checkout)
'step 43'
WS.verifyElementPropertyValue(PartialResponse, 'additionalneeds', Needs)
'step 44'
WS.delay(2)
'step 45'
BookingIdResponse = WS.sendRequest(findTestObject('Booking/Get_ Booking_Id'))
'step 46'
WS.verifyResponseStatusCode(BookingIdResponse, 200)
'step 47'
DeleteResponse = WS.sendRequest(findTestObject('Booking/Delete_Booking'))
'step 48'
WS.verifyResponseStatusCode(DeleteResponse, 201)
