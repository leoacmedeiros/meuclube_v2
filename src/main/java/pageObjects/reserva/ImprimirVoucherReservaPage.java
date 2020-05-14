package pageObjects.reserva;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;


public class ImprimirVoucherReservaPage extends BasePage {

	public void selecionarDataDispHotel() {
		
		By seletor = By.xpath("//div[@class='vc-grid-container grid']");
		List<WebElement> elementos = DriverFactory.getDriver().findElements(seletor);
			
		for (WebElement element : elementos) {
	        List<WebElement> numDia = element.findElements(By.xpath("//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full']"));
	        String selecionarDiaInicio = numDia.get(7).getText();
	        String selecionarDiaFim = numDia.get(8).getText();
	 
	        System.out.println("Dia início: "+selecionarDiaInicio);
	        System.out.println("Dia fim: "+selecionarDiaFim);

	        clicarBotao(By.xpath("(//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full'][text()='"+selecionarDiaInicio+"'])[1]"));
			sleep(1);
			clicarBotao(By.xpath("(//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full'][text()='"+selecionarDiaFim+"'])[1]"));

		}
}

	public void clicarBuscarPeriodoSelecionado() {
		clicarBotao(By.xpath("//div[contains(text(),'Buscar Período Selecionado')]"));
		
	}
	
	
	public void verificarPromocao() {
	   
		Boolean elementoPresente = DriverFactory.getDriver().findElements(By.xpath("//div[contains(text(),'Período Especial')]")).size() > 0;
			
		if (elementoPresente == true) {
			System.out.println("Promoção: "+elementoPresente);
			sleep(3);
			WebElement clicarCheck = DriverFactory.getDriver().findElement(By.xpath("//div[contains(text(),'Período Especial')]//parent::div//div[@class='v-input--selection-controls__input']"));
			clicarCheck.click();
			
		} else {
			System.out.println("Promoção: "+elementoPresente);
		}
		
	}
	
	public void detalharReservaHotel(String nomeHotel) {
		esperarElementoFicarVisivel2(By.xpath("(//div[contains(text(),'"+nomeHotel+"')]//parent::div//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
		clicarElementoScrollVisivel(By.xpath("(//div[contains(text(),'"+nomeHotel+"')]//parent::div//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}
	
	public void clicarBotaoVoucher() {
		clicarElementoScrollVisivel(By.xpath("//button//div[contains(text(),'Voucher')]"));
	}
	

	 public static void verificaDownloadArquivo(String folderLocation) throws InterruptedException {
	        
		 File directory = new File(folderLocation);
	        boolean downloadinFilePresence = false;
	        File[] filesList =null;
	        LOOP:
	            while(true) {
	                filesList =  directory.listFiles();
	                for (File file : filesList) {
	                    downloadinFilePresence = file.getName().contains("voucher");
	                }
	                if(downloadinFilePresence) {
	                    for(;downloadinFilePresence;) {
	                        sleep(5);
	                       continue LOOP;
	                    }
	                }else {
	                    break;
	                }
	            }
	    }
	 
	 public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().contains(fileName)) {
		          // File has been found, it can now be deleted:
		          //dirContents[i].delete();
		          
		          System.out.println("Arquivo: "+dirContents[i]);
		          return true;
		      }
		          }
		      return false;
		  }
	

}