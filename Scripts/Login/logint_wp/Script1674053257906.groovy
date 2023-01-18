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

WebUI.openBrowser(rawUri = GlobalVariable.connect)

WebUI.click(findTestObject('Register_WP/click_cookies'))

WebUI.click(findTestObject('Register_WP/click_wp'))

WebUI.click(findTestObject('Register_WP/click_register'))

WebUI.setText(findTestObject('Register_WP/name'), name)

WebUI.setText(findTestObject('Register_WP/surname'), surname)

WebUI.setText(findTestObject('Register_WP/email'), email)

WebUI.click(findTestObject('Register_WP/click_gender'))

WebUI.selectOptionByLabel(findTestObject('Register_WP/click_gender'), gender, false)

WebUI.setText(findTestObject('Register_WP/day'), day)

WebUI.selectOptionByLabel(findTestObject('Register_WP/month'), month, false)

WebUI.setText(findTestObject('Register_WP/year'), year)

String wrong = WebUI.getText(findTestObject('Object Repository/Register_WP/error'))

assert not_correct == wrong

WebUI.closeBrowser()

