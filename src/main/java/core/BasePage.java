package core;
 
import static core.DriverFactory.getDriver;
import static org.junit.Assert.fail;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

public class BasePage {

	private static String imageFileDir = System.getProperty("user.dir");

	/********* TextField e TextArea ************/

	public void escrever(By by, String texto) {
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(by)));

		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto); 
	}

	public void limparTexto(By by) {
		getDriver().findElement(by).clear();
	}

	public void forcarLimparTexto(By by) {
		getDriver().findElement(by).sendKeys(Keys.CONTROL + "a");
		getDriver().findElement(by).sendKeys(Keys.DELETE);
	}

	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}

	public String obterValorCampo(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	public String obterValorCampo(By by) {
		return getDriver().findElement(by).getAttribute("value");
	}

	public String teclarReturn(By by) {
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(by)));

		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(Keys.RETURN);
		return null;

	}

	public void teclarEscape(By by) {
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(by)));

		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(Keys.ESCAPE);

	}

	/********* Combo ************/

	public void selecionarCombo(String id, String valor) {
		waitForLoad(getDriver());
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		try {
			esperarPresencaDoLoading();
			combo.selectByVisibleText(valor);
		} catch (NoSuchElementException e) {
			System.out.println("Valor não disponível.");
		}

	}

	public void selecionarComboPorXPath(String xpath, String valor) {
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		Select combo = new Select(getDriver().findElement(By.xpath(xpath)));
		try {
			esperarPresencaDoLoading();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			System.out.println(valor);
			combo.selectByVisibleText(valor);
		} catch (NoSuchElementException e) {
			System.out.println("Valor não disponível.");
		}

	}

	public boolean selecionarComboPeloXPath(String xpath, String valor) {
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		Select combo = new Select(getDriver().findElement(By.xpath(xpath)));
		boolean retorno = false;
		try {
			// esperarPresencaDoLoading();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			System.out.println(valor);
			combo.selectByVisibleText(valor);
			retorno = true;
		} catch (NoSuchElementException e) {
			System.out.println("Valor não disponível.");
		}
		return retorno;
	}

	public boolean selecionarComboPeloTexto(String id, String valor) {
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		try {
			wait.until(ExpectedConditions.elementToBeSelected(element));
			combo.selectByVisibleText(valor);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Valor não disponível.");
		}
		return false;
	}

	public String obterValorCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public List<String> obterValoresCombo(String xPath) {
		WebElement element = getDriver().findElement(By.xpath(xPath));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public int obterQuantidadeOpcoesCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public boolean verificarOpcaoCombo(String id, String opcao) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(opcao)) {
				return true;
			}
		}
		return false;
	}

	/********* Botao ************/

	public void clicarBotao(By by) {
		waitForLoad(getDriver());
		esperarPresencaDoLoading();
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}

	public void clicarBotaoPorTexto(String texto) {
		clicarBotao(By.xpath("//button[.='" + texto + "']"));
	}

	public void clicarBotaoContainsTexto(String texto) {
		clicarBotao(By.xpath("//button[contains(text(),'" + texto + "')]"));
	}

	public void cliqueDuplo(By by) {
		Actions action = new Actions(getDriver());
		action.moveToElement(getDriver().findElement(by)).doubleClick().perform();
	}

	public String obterValueElemento(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	public boolean elementoHabilitado(By by) {
		esperarPresencaDoLoading();
		return getDriver().findElement(by).isEnabled();
	}

	/********* Radio e Check ************/

	public void clicarRadio(By by) {
		waitForLoad(getDriver());
		esperarPresencaDoLoading();
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	public void clicarRadio(String id) {
		waitForLoad(getDriver());
		esperarPresencaDoLoading();
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

	public void clicarCheck(String id) {
		waitForLoad(getDriver());
		esperarPresencaDoLoading();
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

	public void clicarCheck(By by) {
		waitForLoad(getDriver());
		esperarPresencaDoLoading();
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).isSelected();
	}

	/********* Link ************/

	public void clicarLink(String link) {
		esperarPresencaDoLoading();
		WebElement elemento = getDriver().findElement(By.linkText(link));
		scrollIntoView(elemento);

		elemento.click();
	}

	/********* Textos ************/

	public String obterTexto(By by) {
		waitForLoad(getDriver());
		esperarPresencaDoLoading();
		return getDriver().findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}

	protected boolean obterHome(String nome, String xpath) throws InterruptedException {
		Boolean achou = false;
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				// esperarPresencaDoLoading();
				if (nome.equals(DriverFactory.getDriver().findElement(By.xpath(xpath)).getText()))
					achou = true;
				break;
			} catch (Exception e) {

			}
		}
		return achou;
	}

	public String obterTextoSubstring(By by, int param1, int param2) {
		waitForLoad(getDriver());
		// esperarPresencaDoLoading();
		return getDriver().findElement(by).getText().substring(param1, param2);
	}

	/********* Alerts ************/

	public String alertaObterTexto() {
		Alert alert = getDriver().switchTo().alert();
		return alert.getText();
	}

	public String alertaObterTextoEAceita() {
		Alert alert = getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;

	}

	public String alertaObterTextoENega() {
		Alert alert = getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;

	}

	public void alertaEscrever(String valor) {
		Alert alert = getDriver().switchTo().alert();
		alert.sendKeys(valor);
		alert.accept();
	}

	/********* Frames e Janelas ************/

	public void entrarFrame(String id) {
		getDriver().switchTo().frame(id);
	}

	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}

	public void trocarJanela(String id) {
		getDriver().switchTo().window(id);
	}

	/************** JS *********************/

	public Object executarJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js.executeScript(cmd, param);
	}

	public static void scrollIntoView(WebElement elemento) {
		((JavascriptExecutor) getDriver())
				.executeScript("window.scrollTo(" + elemento.getLocation().x + "," + elemento.getLocation().y + ")");
	}

	public static void scrollPageUP() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("scroll(0, -250);");
	}

	public static void scrollElementoClicar(By by) {
		esperarPresencaDoLoading();
		JavascriptExecutor je = (JavascriptExecutor) getDriver();
		WebElement Project = getDriver().findElement(by);
		je.executeScript("arguments[0].click();", Project);
	}

	public static void scrollAteElemento(By by) {
		JavascriptExecutor je = (JavascriptExecutor) getDriver();
		WebElement Project = getDriver().findElement(by);
		je.executeScript("arguments[0].scrollIntoView();", Project);
	}

	public static void scrollPageDOWN() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("scroll(0, 1900);");
	}

	public static void clicarElementoScrollVisivel(By by) {
		esperarPresencaDoLoading();
		JavascriptExecutor je = (JavascriptExecutor) getDriver();
		WebElement Project = getDriver().findElement(by);
		je.executeScript("arguments[0];", Project);

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	/************** Tabela *********************/

	public WebElement obterCelula(String colunaBusca, String valor, String colunaAcao, String xpathTabela) {
		// procurar tabela
		WebElement tabela = getDriver().findElement(By.xpath(xpathTabela));

		// procurar coluna do registro
		int idColuna = obterIndiceColuna(colunaBusca, tabela);

		// encontrar a linha do registro
		int idLinha = obterIndiceLinha(valor, tabela, idColuna);

		// procurar coluna do botao
		int idColunaBotao = obterIndiceColuna(colunaAcao, tabela);

		// clicar no botao da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColunaBotao + "]"));
		return celula;
	}
	// public WebElement obterCelula(String colunaBusca, String valor, String
	// colunaBotao, String idTabela){
	// //procurar coluna do registro
	// WebElement tabela =
	// getDriver().findElement(By.xpath("//*[@id='"+idTabela+"']"));
	// int idColuna = obterIndiceColuna(colunaBusca, tabela);
	//
	// //encontrar a linha do registro
	// int idLinha = obterIndiceLinha(valor, tabela, idColuna);
	//
	// //procurar coluna do botao
	// int idColunaBotao = obterIndiceColuna(colunaBotao, tabela);
	//
	// //clicar no botao da celula encontrada
	// WebElement celula =
	// tabela.findElement(By.xpath(".//tr["+idLinha+"]/td["+idColunaBotao+"]"));
	// return celula;
	// }

	public void clicarBotaoTabela(String colunaBusca, String valor, String colunaBotao, String idTabela, By botao) {
		WebElement celula = obterCelula(colunaBusca, valor, colunaBotao, idTabela);
		celula.findElement(botao).click();

	}

	protected int obterIndiceLinha(String valor, WebElement tabela, int idColuna) {
		List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td[" + idColuna + "]"));
		int idLinha = -1;
		for (int i = 0; i < linhas.size(); i++) {
			if (linhas.get(i).getText().equals(valor)) {
				idLinha = i + 1;
				break;
			}
		}
		return idLinha;
	}

	protected int obterIndiceColuna(String coluna, WebElement tabela) {
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		int idColuna = -1;
		for (int i = 0; i < colunas.size(); i++) {
			if (colunas.get(i).getText().equals(coluna)) {
				idColuna = i + 1;
				break;
			}
		}
		return idColuna;
	}

	/********** Evidência ********************/
	public void evidencia(Scenario scenario) {
		// if (scenario.isFailed()) {
		scenario.embed(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
		// }
	}

	public void logRelatorio(Scenario scenario, String string) {
		scenario.write(string);
	}

	public void informarNoLog(String mensagem) {
		foto();
		fail(mensagem);
	}

	private static String nomeImagem() {
		String nomeImagem = "screen_" + data("HHmmss").toString();
		return nomeImagem;
	}

	public void foto() {
		foto(nomeImagem());
	}

	public static void foto(String nomeImagem) {
		esperarPresencaDoLoading();
		try {
			takeSnapShot(nomeImagem + ".png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void takeSnapShot(String fname) throws Exception {

		// Transforma objeto WebDriver para TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) getDriver());

		// Call getScreenshotAs method to create image file
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// String imageFileDir = System.getProperty("selenium.screenshot.dir");
		if (imageFileDir == null)
			imageFileDir = "D://Users//02522026194//eclipse-workspace//dne_novo//target//screenshots";
		// imageFileDir = System.getProperty("java.io.tmpdir");
		FileUtils.copyFile(srcFile, new File(imageFileDir, fname));
	}

	/********** Esperas ********************/

	/**
	 * 
	 * @param tempoEmSegundos
	 * @see esperarPresencaDaAmpulheta()
	 */
	public static void sleep(Integer tempoEmSegundos) {

		try {
			Thread.sleep((long) tempoEmSegundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Especifica o tempo de espera implícito na busca por elementos na página.
	 * 
	 * @param tempo
	 */
	public static void setaTempoDeEsperaDriver(int tempo) {
		getDriver().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}

	void waitForLoad(WebDriver driver) {
		new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
				.executeScript("return document.readyState").equals("complete"));
	}

	private static final int TEMPO_ESPERA_LOADING = 1;
	private static final int TEMPO_ESPERA_DEFAULT = 5;

	public static void esperarPresencaDoLoading() {
		try {
			// System.out.println("Loading...");
			int i = 2000;
			boolean aguarde = true;
			while (--i > 0 && aguarde) {
				setaTempoDeEsperaDriver(TEMPO_ESPERA_LOADING);
				sleep(1);
				// List<WebElement> lista =
				// getDriver().findElements(By.className("block-ui-message ng-binding"));
				List<WebElement> lista = getDriver()
						.findElements(By.xpath("//div[@class='v-card__text']//span[text()='Por favor, aguarde...']"));
				// System.out.println("Loading size: " + lista.size());
				setaTempoDeEsperaDriver(TEMPO_ESPERA_DEFAULT);
				aguarde = hasVisibleElementAtList(lista);

				if (aguarde)
					lista.clear();
			}
		} catch (Exception e) {
			return;
		}
	}

	public static boolean hasVisibleElementAtList(List<WebElement> lista) {
		for (WebElement element : lista) {
			// System.out.println("\n Is displayed: " + element.isDisplayed()
			// + "\n Is enabled: " + element.isEnabled() + "\n Is selected: " +
			// element.isSelected() + "\n get size: " + element.getSize());
			if (element.isDisplayed()) {
				// final WebDriverWait wait = new WebDriverWait(driver, 1);
				// wait.until(ExpectedConditions.invisibilityOf(element));
				// sleep(1);
				return true;
			}
		}
		return false;
	}

	public static void esperaElementoFicarVisivel(By by) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	public static void esperarElementoFicarVisivel2(By by) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	// Verifica se um elemento está presente ou não na tela e executa a ação
	// conforme o retorno do boolean
	public void verificarElementoPresente(By by) {

		Boolean elementoPresente = DriverFactory.getDriver().findElements(by).size() > 0;

		if (elementoPresente == true) {
			// Realizar a ação
			// clicarBotao(By.xpath("//div[contains(text(),'Período
			// Especial')]//parent::div//div[@class='v-input--selection-controls__input']//input"));

			System.out.println("O elemento é: " + elementoPresente);
		} else {
			System.out.println("O elemento é: " + elementoPresente);
		}

	}

	/********* Data ********/

	public static String data(String formato) {
		String RetornoDate = null;
		SimpleDateFormat smpleDtFmt = new SimpleDateFormat(formato);
		Calendar c = Calendar.getInstance();
		RetornoDate = smpleDtFmt.format(c.getTime()).toLowerCase();
		return RetornoDate;
	}

	public void selecionarDataInicioFim(int diaInicio, int diaFim) {
		clicarBotao(By.xpath("//div//div[@data-qa='datepickerInput'][@tabindex='0']"));

		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasInicio = hoje.plusDays(diaInicio);
		LocalDate qtdDiasFim = hoje.plusDays(diaFim);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaInicio = qtdDiasInicio.format(formatter);
		String inserirDiaFim = qtdDiasFim.format(formatter);

		clicarBotao(By.xpath("(//div[@class='datepicker__month-day'][text()='" + inserirDiaInicio + "'])[1]"));
		sleep(1);
		clicarBotao(By.xpath("(//div[@class='datepicker__month-day'][text()='" + inserirDiaFim + "'])[1]"));

	}

	/********* Fechar Navegador ********/
	public void fecharBrowser() {
		getDriver().quit();
	}

	/********* Arquivo ********/
	
	 public static void verificaDownloadArquivo(String folderLocation) throws InterruptedException {
	        
		 File directory = new File(folderLocation);
	        boolean downloadinFilePresence = false;
	        File[] filesList =null;
	           
	            while(true) {
	                filesList =  directory.listFiles();
	                for (File file : filesList) {
	                    downloadinFilePresence = file.getName().contains("voucher");
	                    //System.out.println("Achou arquivo voucher: "+downloadinFilePresence);
	                }
	                if(downloadinFilePresence) {
	                    for(;downloadinFilePresence;) {
	                        sleep(5);
	                        
	                    }
	                }else {
	                    break;
	                }
	            }
	    }
	 
	// public static String getCaminhoArquivo(String nomeArquivo) {
	// return new File("arquivos/" + nomeArquivo).getAbsolutePath();
	//
	// public void selecionarArquivo(String arquivo) {
	// getDriver().findElement(By.xpath("//input[@type='file']")).sendKeys(getDriver().getCaminhoArquivo(arquivo));
	//
	// }
	// }

	public static void anexo(By by, String caminho) {

		WebElement uploadElement = getDriver().findElement(by);

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys(caminho);

		// click the "UploadFile" button
		// getDriver().findElement(by).click();
	}

	/********* Mudar Aba ********/

	public void mudarAba(int numAba) {
		ArrayList<String> abas = new ArrayList<>(DriverFactory.getDriver().getWindowHandles());
		DriverFactory.getDriver().switchTo().window(abas.get(numAba));
	}
	
	
	/*********** Gerar Email Automaticamente ***********/

	public static String geraEmailAuto() {
		int i, nrAleatorioVogal, nrAleatorioConsoante;

		String vogal[] = { "a", "e", "i", "o", "u", }, vc = "", nome = "", consoante[] = { "b", "c", "d", "f", "g", "h",
				"j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "x", "y", "z" };

		Random random = new Random();

		for (i = 0; i <= 8; i++) {
			nrAleatorioVogal = 0 + random.nextInt(4);// escolhe uma pos de 0 a 4
			nrAleatorioConsoante = 0 + random.nextInt(19);// escolhe pos de 0 a 19
			vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
			nome = nome + vc;

		}
		return nome + "@gmail.com";
	}
	
	
	public static String geraNome() {
		int i, nrAleatorioVogal, nrAleatorioConsoante;

		String vogal[] = { "a", "e", "i", "o", "u", }, vc = "", nome = "", consoante[] = { "b", "c", "d", "f", "g", "h",
				"j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "x", "y", "z" };

		Random random = new Random();

		for (i = 0; i <= 8; i++) {
			nrAleatorioVogal = 0 + random.nextInt(4);// escolhe uma pos de 0 a 4
			nrAleatorioConsoante = 0 + random.nextInt(19);// escolhe pos de 0 a 19
			vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
			nome = nome + vc;

		}
		return nome;
	}

}
