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

WebUI.navigateToUrl('https://webposqc.missarirasa.com/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_ID Sarirasa_inputNIK'))

WebUI.setText(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_ID Sarirasa_inputNIK'), '58035')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_Password_inputPassword'), 'Cg+cUiY7xQqTg1iegvaWgg==')

WebUI.click(findTestObject('Object Repository/Login_Sarirasa WebPOS/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Tipe User Kasir 1Kasir 2Kasir 3Kasir_c131aa'), 
    'kasir_1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Tipe User Kasir 1Kasir 2Kasir 3Kasir_c131aa'), 
    'kasir_2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Tipe User Kasir 1Kasir 2Kasir 3Kasir_c131aa'), 
    'kasir_3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Tipe User Kasir 1Kasir 2Kasir 3Kasir_c131aa'), 
    'kasir_4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Tipe User Kasir 1Kasir 2Kasir 3Kasir_c131aa'), 
    'kasir_3', true)

WebUI.selectOptionByValue(findTestObject('Login_Sarirasa WebPOS/3.Printer-Link Webposqc/select_Pilih Default PrinterPrinter HO (Gud_2b3e02'),
	'59', true)

WebUI.selectOptionByValue(findTestObject('Login_Sarirasa WebPOS/3.Printer-Link Webposqc/select_Pilih Default PrinterPrinter HO (Gud_2b3e02'),
	'94', true)

WebUI.selectOptionByValue(findTestObject('Login_Sarirasa WebPOS/3.Printer-Link Webposqc/select_Pilih Default PrinterPrinter HO (Gud_2b3e02'),
	'59', true)


/*
WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '59', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '75', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '76', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '77', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '78', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '79', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '80', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '81', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '82', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '83', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '59', true)
*/


WebUI.click(findTestObject('Login_Sarirasa WebPOS/button_Simpan'))

WebUI.click(findTestObject('Login_Sarirasa WebPOS/button_Batal'))

WebUI.click(findTestObject('Login_Sarirasa WebPOS/button_Simpan'))

WebUI.click(findTestObject('Login_Sarirasa WebPOS/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Login_Sarirasa WebPOS/span_LOGOUT'))

WebUI.delay(3)

