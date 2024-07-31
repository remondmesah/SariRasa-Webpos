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

WebUI.navigateToUrl('http://172.25.5.52:8383/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_ID Sarirasa_inputNIK'))

WebUI.setText(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_ID Sarirasa_inputNIK'), '61653')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_Password_inputPassword'), 'Cg+cUiY7xQqTg1iegvaWgg==')

WebUI.click(findTestObject('Object Repository/Login_Sarirasa WebPOS/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Tipe User Kasir 1Kasir 2Kasir 3Kasir_c131aa'), 
    'kasir_4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Login_Sarirasa WebPOS/select_Pilih Default PrinterPrinter HO (Gud_45e032'), 
    '59', true)

WebUI.click(findTestObject('Object Repository/Login_Sarirasa WebPOS/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Login_Sarirasa WebPOS/button_OK'))

WebUI.verifyElementPresent(findTestObject('Validasi Opening/History-Opening/div_sedang opening  nominal  Rp5.000.000,-  by  SURIPTO  SURIPTO  belum closing  ORDER'), 
    0)

WebUI.click(findTestObject('Order/div_ORDER'))

WebUI.click(findTestObject('Order/div_101'))

WebUI.click(findTestObject('Order/span_Order'))

