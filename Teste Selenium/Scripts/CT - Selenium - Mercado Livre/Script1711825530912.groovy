import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

// Configuração do WebDriver (certifique-se de ter o driver adequado no seu path)
System.setProperty("webdriver.chrome.driver", "C:\\Users\\eduar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe")

// Inicialização do WebDriver
WebDriver driver = new ChromeDriver()

// Navegar para a página inicial do Mercado Livre
driver.get("https://www.mercadolivre.com.br/")

//Comentário abaixo para realizar o login porém é barrado com a validação do robo
//WebElement entrarContaBtn = driver.findElement(By.cssSelector("[data-link-id='login']"));
//entrarContaBtn.click()
//
//WebElement emailField = driver.findElement(By.id("user_id"))
//emailField.sendKeys("eduardosangaletti@gmail.com")
//
//WebElement continuarbtn = driver.findElement(By.id(":Rajhh:"))
//continuarbtn.click()

// Encontrar o campo de pesquisa e enviar um termo de pesquisa 
def searchField = driver.findElement(By.xpath("//input[@name='as_word']"))
searchField.sendKeys("smartphone galaxy A54")

// Encontrar o botão de pesquisa e clicar nele
def searchButton = driver.findElement(By.xpath("//button[@type='submit']"))
searchButton.click()

// Esperar alguns segundos para que a página seja carregada completamente
Thread.sleep(5000)

WebElement usernameField = driver.findElement(By.className("ui-search-item__title"))
usernameField.click()

// Esperar alguns segundos para que a página seja carregada completamente
Thread.sleep(5000)

//Encontrar e clicar no botão adicionar ao carrinho
WebElement addcarrinhobtn = driver.findElement(By.id(":R16d7a6c4um:"))
addcarrinhobtn.click()

Thread.sleep(5000)

//// Fechar o navegador
//driver.quit()
