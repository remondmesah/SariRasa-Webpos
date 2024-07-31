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

WebUI.setText(findTestObject('Login_Sarirasa WebPOS/input_ID Sarirasa_inputNIK'), '58035')

WebUI.setEncryptedText(findTestObject('Login_Sarirasa WebPOS/input_Password_inputPassword'), 'Cg+cUiY7xQqTg1iegvaWgg==')

WebUI.click(findTestObject('Login_Sarirasa WebPOS/button_Login'))

WebUI.selectOptionByValue(findTestObject('Login_Sarirasa WebPOS/select_Tipe User Kasir 1Kasir 2Kasir 3Kasir_c131aa'), 'kasir_3', 
    true)

WebUI.selectOptionByValue(findTestObject('Login_Sarirasa WebPOS/3.Printer-Link Webposqc/select_Pilih Default PrinterPrinter HO (Gud_2b3e02'), 
    '59', true)

WebUI.click(findTestObject('Login_Sarirasa WebPOS/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/button_OK'))

WebUI.click(findTestObject('Menu Opening-Closing/div_menu opening kasir'))

WebUI.verifyElementText(findTestObject('Menu Opening-Closing/Page_Sarirasa WebPOS/h6_Masukkan Jumlah Nominal'), 'Masukkan Jumlah Nominal')

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Rp 50.000'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Hapus'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Rp 100.000'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Hapus'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Rp 500.000'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Hapus'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Rp 50.000'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Rp 100.000'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Rp 500.000'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Switch Key'))

// Define the base path for the objects
String basePath = 'Object Repository/Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_'

// Loop through the numbers 0 to 9
for (int i = 1; i <= 9; i++) {
    WebUI.click(findTestObject(basePath + i))
}

// Add an additional click for 0
WebUI.click(findTestObject(basePath + '0'))

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Switch Key'))

int targetAmount = 5000000

int clickAmount = 500000

int clickCount = targetAmount / clickAmount

for (int i = 0; i < clickCount; i++) {
    WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/02. Nominal-kasir/span_Rp 500.000'))
}

/*
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Switch Key'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_1'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_2'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_3'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_4'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_5'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_6'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_7'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_8'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_9'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_0'))
****

WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Hapus'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Switch Key'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Rp 500.000'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Rp 500.000'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Rp 500.000'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Rp 500.000'))
WebUI.doubleClick(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Rp 500.000'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Rp 500.000'))
WebUI.click(findTestObject('Object Repository/Menu Opening-Closing/Proses Opening/01. Nominal kasir/span_Rp 500.000'))

*/
WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/div_OK kasir'))

WebUI.verifyElementText(findTestObject('Menu Opening-Closing/Proses Opening/h2_Opening'), 'Opening!')

WebUI.verifyElementText(findTestObject('Menu Opening-Closing/Proses Opening/label_Nominal Cash Opening'), 'Nominal Cash Opening')

WebUI.click(findTestObject('Menu Opening-Closing/Proses Opening/button_OK'))

WebUI.verifyElementText(findTestObject('Validasi Opening/Opening Berhasil/h2_Proses Opening Kasir sudah selesai'), 'Nominal Cash Opening')

WebUI.verifyElementText(findTestObject('Validasi Opening/Opening Berhasil/div_Silahkan klik tanda (X) untuk memuat kembali halaman'), 
    'Silahkan klik tanda (X) untuk memuat kembali halaman')

WebUI.click(findTestObject('Validasi Opening/Opening Berhasil/button_'))

