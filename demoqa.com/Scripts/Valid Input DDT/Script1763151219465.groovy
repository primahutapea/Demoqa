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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.executeJavaScript('document.querySelector("footer").style.display="none";', null)
WebUI.executeJavaScript('var b=document.getElementById("fixedban"); if(b) b.style.display="none";', null)

WebUI.verifyTextPresent('Practice Form', false)

WebUI.setText(findTestObject('Object Repository/valid input 1/Page_DEMOQA/input_Name_firstName'), firstname)

WebUI.setText(findTestObject('Object Repository/valid input 1/Page_DEMOQA/input_Name_lastName'), lastname)

WebUI.setText(findTestObject('Object Repository/valid input 1/Page_DEMOQA/input_Email_userEmail'), email)

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/label_Gender_custom-control-label'))

WebUI.setText(findTestObject('Object Repository/valid input 1/Page_DEMOQA/input_(10 Digits)_userNumber'), mobile)

WebUI.setText(findTestObject('Object Repository/valid input 1/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), dateofbirth)

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/valid input 1/Page_DEMOQA/select_November 2025_react-datepicker__mont_4b2ba3'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/valid input 1/Page_DEMOQA/select_October 2025_react-datepicker__year-select'), 
    '1998', true)

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/div_Sa_react-datepicker__day react-datepick_cb92dc'))

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/valid input 1/Page_DEMOQA/input_Subjects_subjectsInput'), 'a')

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/div_Maths_react-select-2-option-1'))

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/label_Hobbies_custom-control-label'))

// ----- PATH FILE PDF -----
String projectDir = RunConfiguration.getProjectDir()
String pdfPath    = projectDir + '/Data Files/Take Home Test_updated.pdf'

println "PDF PATH = " + pdfPath

assert new File(pdfPath).exists() : "File untuk upload tidak ditemukan: " + pdfPath

WebUI.waitForElementVisible(findTestObject('valid input 1/Page_DEMOQA/input_Select picture_uploadPicture'), 10)

WebUI.uploadFile(
		findTestObject('valid input 1/Page_DEMOQA/input_Select picture_uploadPicture'),
		pdfPath
)

//WebUI.verifyTextPresent('Take Home Test_updated.pdf', false)

WebUI.setText(findTestObject('Object Repository/valid input 1/Page_DEMOQA/textarea_Current Address_currentAddress'), currentaddress)

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/div_Select State_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/div_Select State_react-select-3-option-0'))

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/div_Select City_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/div_Select City_react-select-4-option-0'))

WebUI.click(findTestObject('Object Repository/valid input 1/Page_DEMOQA/button_Delhi_submit'))

WebUI.verifyTextPresent('Thanks for submitting the form', false)

WebUI.closeBrowser()

