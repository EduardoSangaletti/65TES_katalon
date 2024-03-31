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

import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver

// Configuração do WebDriver (certifique-se de ter o driver adequado no seu path)
System.setProperty("webdriver.chrome.driver", "C:\\Users\\eduar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe")

// Inicialização do WebDriver
WebDriver driver = new ChromeDriver()
//WebDriver driver = new FirefoxDriver()

// Navegar para a página de login
driver.get("https://www.moodle.udesc.br/login/index.php")

// Encontrar os elementos de entrada (campos de texto e botão) usando seus IDs, nomes ou outros seletores
WebElement usernameField = driver.findElement(By.id("username"))
WebElement passwordField = driver.findElement(By.id("password"))

// Preencher os campos de usuário e senha
usernameField.sendKeys("digite aqui seu cpf")
passwordField.sendKeys("digite aqui sua senha")

// Encontrar e clicar no botão de login
WebElement loginButton = driver.findElement(By.id("loginbtn"))
loginButton.click()

// Esperar alguns segundos para que a página seja carregada completamente
Thread.sleep(5000)

// Verificar se o login foi bem-sucedido verificando se há um elemento específico na página após o login
if (driver.getCurrentUrl().contains("https://www.moodle.udesc.br/my/")) {
    println("Login bem-sucedido!")
} else {
    println("Login falhou!")
}


// Fechar o navegador
//driver.quit()
