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

WebUI.setText(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_ID Sarirasa_inputNIK'), '61653')

WebUI.setText(findTestObject('Object Repository/Login_Sarirasa WebPOS/input_Password_inputPassword'), 'salah password')

WebUI.click(findTestObject('Object Repository/Login_Sarirasa WebPOS/button_Login'))

WebUI.verifyElementText(findTestObject('Login_Sarirasa WebPOS/1.Validasi Login/div_Maaf, Data tidak sesuai. Silahkan coba lagi'), 
    'Maaf, Id tidak ditemukan', FailureHandling.OPTIONAL)

