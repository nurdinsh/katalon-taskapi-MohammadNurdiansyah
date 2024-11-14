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
import org.testng.asserts.Assertion as Keys

'step 1'
WebUI.callTestCase(findTestCase('Block/Create Token'), [:], FailureHandling.STOP_ON_FAILURE)

'step 2'
WebUI.callTestCase(findTestCase('Block/Create Booking'), [:], FailureHandling.STOP_ON_FAILURE)

'step 3'
UpdateResponse = WS.sendRequest(findTestObject('Booking/Update_Booking'))

'step 4'
WS.verifyResponseStatusCode(UpdateResponse, 200)

//Assertion.assertThat(UpdateResponse.getStatusCode()).isEqualTo(200)
'step 5'
WS.verifyElementPropertyValue(UpdateResponse, 'firstname', 'Mohammad')

'step 6'
WS.verifyElementPropertyValue(UpdateResponse, 'lastname', 'Nurdiansyah')

'step 7'
WS.verifyElementPropertyValue(UpdateResponse, 'totalprice', 200)

'step 8'
WS.verifyElementPropertyValue(UpdateResponse, 'depositpaid', true)

'step 9'
WS.verifyElementPropertyValue(UpdateResponse, 'bookingdates.checkin', '2024-12-19')

'step 10'
WS.verifyElementPropertyValue(UpdateResponse, 'bookingdates.checkout', '2025-12-19')

'step 11'
WS.verifyElementPropertyValue(UpdateResponse, 'additionalneeds', 'Coffee')

