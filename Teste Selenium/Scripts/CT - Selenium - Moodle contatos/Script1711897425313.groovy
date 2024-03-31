

import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
WebElement loginBtn = driver.findElement(By.id("loginbtn"))
loginBtn.click()

// Esperar alguns segundos para que a página seja carregada completamente
Thread.sleep(5000)

WebElement usuarioBtn = driver.findElement(By.className("usermenu"))
usuarioBtn.click()

Thread.sleep(3000)

WebElement mensagemBtn = driver.findElement(By.linkText("Mensagens"))
mensagemBtn.click()

WebElement grupoBtn = driver.findElement(By.id("view-overview-group-messages-toggle"))
grupoBtn.click()

Thread.sleep(3000)

