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

Mobile.startExistingApplication('com.solodroid.solomerce', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Homepage/btn_Profile'), 0)

Mobile.tap(findTestObject('Profile/btn_EDIT'), 0)

Mobile.tap(findTestObject('Profile/btn_NameEdit'), 0)

Mobile.setText(findTestObject('Profile/setText_NameEdit'), 'Indirwan Ganteng', 0)

Mobile.tap(findTestObject('Profile/btn_OK'), 0)

Mobile.tap(findTestObject('Profile/btn_EmailEdit'), 0)

Mobile.setText(findTestObject('Profile/setText_EmailEdit'), 'ganteng@gmail.com', 0)

Mobile.tap(findTestObject('Profile/btn_OK'), 0)

Mobile.tap(findTestObject('Profile/btn_PhoneNumberEdit'), 0)

Mobile.setText(findTestObject('Profile/setText_PhoneNumberEdit'), '089870909111', 0)

Mobile.tap(findTestObject('Profile/btn_OK'), 0)

Mobile.tap(findTestObject('Profile/btn_AddressEdit'), 0)

Mobile.setText(findTestObject('Profile/setText_AddressEdit'), 'Jl.Datuk', 0)

Mobile.tap(findTestObject('Profile/btn_OK'), 0)

Mobile.tap(findTestObject('Profile/btn_BackfromEdit'), 0)

Mobile.verifyElementExist(findTestObject('Profile/textView_ProfileLayout'), 0)

