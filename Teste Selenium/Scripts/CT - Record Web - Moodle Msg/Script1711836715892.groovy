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

WebUI.navigateToUrl('https://www.moodle.udesc.br/my/')

WebUI.click(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_Painel (Visitante)  UDESC.edu/a_Acessar'))

WebUI.setText(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_Acesso ao site  UDESC.edu/input_CPF_username'), 
    'digite aqui seu cpf')

WebUI.setEncryptedText(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_Acesso ao site  UDESC.edu/input_Senha_password'), 
    'digite aqui sua senha (criptografada)')

WebUI.click(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_Acesso ao site  UDESC.edu/button_Acessar'))

WebUI.click(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_Painel  UDESC.edu/div_Categoria do curso                     _50ba62'))

WebUI.click(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_Curso 20241 CEAVI Testes de Software  _438895/a_Plano de Testes  Tarefa'))

WebUI.click(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_20241_CEAVI_ESO06 - 20241_65TES Plano _486f68/span_Comentrios (0)'))

WebUI.setText(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_20241_CEAVI_ESO06 - 20241_65TES Plano _486f68/textarea_Comentrio_content'), 
    'ola')

WebUI.click(findTestObject('Object Repository/CT - Record Web - Moodle Msg/Page_20241_CEAVI_ESO06 - 20241_65TES Plano _486f68/a_Salvar comentrio'))

