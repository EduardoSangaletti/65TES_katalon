# 65TES_katalon
Testes Katalon Studio

Link para baixar o chromedriver para windows 64 e versão do google chrome 123.0.6312.86 (utilizada nesse projeto)
https://storage.googleapis.com/chrome-for-testing-public/123.0.6312.86/win64/chromedriver-win64.zip

Link verificar outras versões (mais recentes):
https://googlechromelabs.github.io/chrome-for-testing/#stable

Link verificar outras versões (mais antigas):
https://chromedriver.chromium.org/downloads

Após isso baixar o arquivo extrair, e configurar o seu local em cada arquivo katalon:
Exemplo: 
// Configuração do WebDriver (certifique-se de ter o driver adequado no seu path)
System.setProperty("webdriver.chrome.driver", "C:\\Users\\eduar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe")
// Inicialização do WebDriver
WebDriver driver = new ChromeDriver()
