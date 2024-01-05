package robosaipos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;



public class metodos {
	
	private static WebDriverWait wait;
	
	private static WebDriver driver;
	 static String saipos;
	 static String login;
	 static String senha;

	
	 
	public WebDriver abrirPagina() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
       // options.addArguments("--headless");
        options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);
	    driver.get("https://conta.saipos.com/#/app/sale/delivery/kanban/search-customer");
	     saipos = driver.getWindowHandle();
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   
	    System.out.println("saipos aberta");
	    
	    //Duration a = Duration.ofSeconds(30);
   	   // WebDriverWait wait = new WebDriverWait(driver, a); 
	    
	    WebElement emailField= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[ng-model='lctrl.account.email']")));
        
        
        // digitando o emial no campo de login 
        emailField.sendKeys("atendimento04.matsuri@gmail.com");
        
        // digitar no campo de senha
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[ng-model='lctrl.account.password']")));
        
        passwordField.sendKeys("Matsuri@123");
        
        
        // Esperar 10 segundos ap s digitar o login e a senha
        Thread.sleep(3000);
        
        //clicando na seta de abertura depois de digitar login e senha
     WebElement loginButton = driver.findElement(By.cssSelector("[ng-click='lctrl.login()']"));
     loginButton.click();
     
     // Esperar 10 segundos ap s digitar o login e a senha
     Thread.sleep(2000);
     
     WebElement derrubar =driver.findElement(By.xpath("/html/body/div[2]/div[2]/p[2]/button[2]"));
     derrubar.click();   
	    
	    
	    return driver;
	}
	
	
        public void qualcidade(String cidade) {
        	
        	
        	    
        	    JavascriptExecutor js = (JavascriptExecutor) driver;
        	
        	switch(cidade) {
        	
        	case "apucarana":
        		   WebElement botaoapucarana = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_2")));
       	        botaoapucarana.click();
       	        break;
        	case "arapongas":
        		WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_4")));
    	        buttonElement.click();
    	        break;
        	case "cambe":    
        		WebElement buttonElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_6")));
    	        buttonElement1.click();
    	        break;
        	case "campo mourao":
        		  WebElement buttonElement2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_7")));
      	        buttonElement2.click();
      	      break;
        	case "cascavel":  
        		 WebElement buttonElement3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_8")));
     	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement3);
     	       buttonElement3.click();
     	       break; 
        	case "curitiba":
        		 WebElement buttonElement9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='filteredarray_10']")));
     	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement9);
     	       buttonElement9.click();
        	   break;
        	case"ibipora":   
        		 WebElement buttonElement4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_11")));
     	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement4);
     	       buttonElement4.click();
     	        break;
        	case"londrina":    
        		 WebElement buttonElement5 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_13")));
     	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement5);
     	       buttonElement5.click();
     	        break;
        	case "maringa":   
        		WebElement buttonElement6 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_14")));
    	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement6);
    	        buttonElement6.click();
    	        break;
        	case "rolandia":   
        	 WebElement buttonElement8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='filteredarray_16']")));
 	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement8);
 	       buttonElement8.click();
        	   break;
        	case "toledo": 
        		 WebElement botao = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_17")));
     	        js.executeScript("arguments[0].scrollIntoView(true);", botao);
     	       botao.click();
    	         break;
        	case "umuarama":    
        		 WebElement buttonElement7 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_18")));
     	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement7);
     	        buttonElement7.click();
     	       break; 
    	         
        	case "jundiai":    
       		 WebElement buttonElement11 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_12")));
    	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement11);
    	        buttonElement11.click();
    	       break; 
        	   
        	case "cianorte":    
       		 WebElement buttonElement12 = wait.until(ExpectedConditions.elementToBeClickable(By.id("filteredarray_9")));
    	        js.executeScript("arguments[0].scrollIntoView(true);",  buttonElement12);
    	        buttonElement12.click();
    	       break;  
        	   
        	   
        	   
        	   
        	}
        	
        	
        	
        }
	
	
	public void clicmenu() {
		
 	 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-trigger\"]")));
		element.click();
	}
	
	
	public void vendasporperiodo() {
		
		
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app.report.sales-by-period\"]")));
		    
		    element.click();
	}
	
	public int quantosdias(int ano,int mes) {
		
		YearMonth yearMonth = YearMonth.of(ano, mes);
        int dias = yearMonth.lengthOfMonth();
        
        return dias;
		
	}
	
	public void campodata(int dia, int mes, int ano) {
		  List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"datePickerSaipos\"]"));
		   
		  String data = String.format("%02d/%02d/%04d", dia, mes, ano);

		    for(WebElement element : elements) {
		    	 element.clear();
		        element.sendKeys(data);
		    }
		
		
	}
	
	
	public void preencherCampoDataPorMes(int dia, int mes, int ano) {
	    // Primeiro, obtém a quantidade de dias no mês especificado.
	    int diasNoMes = quantosdias(ano, mes);

	    // Depois, faz um loop de 1 até diasNoMes, e para cada dia, chama o método campodata.
	    for ( ; dia <= diasNoMes; dia++) {
	        campodata(dia, mes, ano);
	        try {
				Thread.sleep(5000);
				buscar();
				Thread.sleep(5000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        

	       
	    }
	}
	
	
	public void preenchercampodata(int diaInicial, int mesInicial, int anoInicial, int diaFinal, int mesFinal, int anoFinal, String cidade,String ifoodmat, String ifoodmok,String ddmat, String ddmok,  String ddrobert , String ifoodrobet) {
	    LocalDate dataAtual = LocalDate.of(anoInicial, mesInicial, diaInicial);
	    LocalDate dataFinal = LocalDate.of(anoFinal, mesFinal, diaFinal);
	    
	    String janta ="Janta";
	    String almoço = "Almoço";

	    
        try {
        	 // selecione a cidade
        	System.out.println("selecionando cidade");
        	 Thread.sleep(5000);
	           qualcidade(cidade); 
	           Thread.sleep(5000);
	           
	           //clica no menu
	           clicmenu();
	           Thread.sleep(5000);
	           
	           //vendas por periodo
	           vendasporperiodo();
	           Thread.sleep(5000);
	           
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
	    
	    
	    
	    
	    
	    
	    int diasNoIntervalo = (int) ChronoUnit.DAYS.between(dataAtual, dataFinal);

	    for (int i = 0; i <= diasNoIntervalo; i++) {
	        int dia = dataAtual.getDayOfMonth();
	        int mes = dataAtual.getMonthValue();
	        int ano = dataAtual.getYear();
            
	        campodata(dia, mes, ano);
	       // String data = dia+"/"+ mes+"/"+ano;
	        
	        LocalDate date = LocalDate.of(ano, mes, dia);
	        String data = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

	        try {
	            Thread.sleep(5000);
	           
	            
	           
	           //clicando no nome da loja marca
	           nomedaloja();
	           Thread.sleep(2000);
	           
	           //clicando na marca 
	           loja(cidade,ifoodmat);
	           Thread.sleep(3000);
	           turno(almoço);
	            buscar();
	            Thread.sleep(3000);
	            int pedido =  numeropedido();
	            String faturamento = faturamento();
	            String marca= "ifood matsuri";
	           
	            
	           inserirconectar(cidade,marca,pedido,data,faturamento ,almoço ) ;
	            Thread.sleep(3000);
	            
	            turno(janta);
	            buscar();
	            Thread.sleep(3000);
	            
	            pedido =  numeropedido();
	           faturamento = faturamento();
	            
	            
	            inserirconectar(cidade,marca,pedido,data,faturamento ,janta) ;
	            //passo 1
	            
	            
	            
	            
	            Thread.sleep(3000);
	            nomedaloja();
	            //clicando na marca 
		           loja(cidade,ifoodmok);
		           Thread.sleep(3000);
		           turno(almoço);
		            buscar();
		            Thread.sleep(3000);
		            pedido =  numeropedido();
		          faturamento = faturamento();
		           marca= "ifood Mok the poke";
		           
		            
		           inserirconectar(cidade,marca,pedido,data,faturamento, almoço ) ;
		            Thread.sleep(3000);
	            
		            turno(janta);
		            buscar();
		            Thread.sleep(3000);
		            
		            pedido =  numeropedido();
		           faturamento = faturamento();
		            
		            
		            inserirconectar(cidade,marca,pedido,data,faturamento ,janta) ;
		            //passo 2
		            
		            
		            
		            
		            
		            
		            Thread.sleep(3000);
		            nomedaloja();
		            //clicando na marca 
			           loja(cidade,ddmat);
			           Thread.sleep(3000);
			           turno(almoço);
			            buscar();
			            Thread.sleep(3000);
			            pedido =  numeropedido();
			          faturamento = faturamento();
			           marca= "Dd matsuri";
			          
			            
			           inserirconectar(cidade,marca,pedido,data,faturamento,almoço  ) ;
			            Thread.sleep(3000);
			            
			            
			            turno(janta);
			            buscar();
			            Thread.sleep(3000);
			            
			            pedido =  numeropedido();
			           faturamento = faturamento();
			            
			            
			            inserirconectar(cidade,marca,pedido,data,faturamento ,janta) ;
			            //passo 3
			            
			            
			            
			            
			            
	          
			            Thread.sleep(3000);
			            nomedaloja();
			            //clicando na marca 
				           loja(cidade,ddmok);
				           Thread.sleep(3000);
				           turno(almoço);
				            buscar();
				           
				            Thread.sleep(3000);
				            pedido =  numeropedido();
				          faturamento = faturamento();
				           marca= "Dd mok";
				          
				            
				           inserirconectar(cidade,marca,pedido,data,faturamento, almoço ) ;
				            Thread.sleep(3000);
				            
				            turno(janta);
				            buscar();
				            Thread.sleep(3000);
				            
				            pedido =  numeropedido();
				           faturamento = faturamento();
				            
				            
				            inserirconectar(cidade,marca,pedido,data,faturamento ,janta) ;
				            //passo 4
				            
				             
				            
				            
				            
				            
				            
                          String verificacao = "0"; 
				            
                          if(verificacao.equals(ddrobert)) {
                        	  System.out.println("não tem robert nessa cidade");
                        	  //faz nada 
                        	  
				            
                          } else {
                        	  Thread.sleep(3000);
                        	  nomedaloja();
                        	  //clicando na marca 
					           loja(cidade,ddrobert);
					           Thread.sleep(3000);
					           turno(almoço);
					            buscar();
					           
					            Thread.sleep(3000);
					            pedido =  numeropedido();
					          faturamento = faturamento();
					           marca= "Dd robert";
					          
					            
					           inserirconectar(cidade,marca,pedido,data,faturamento, almoço  ) ;
					            Thread.sleep(3000); 
					            turno(janta);
					            buscar();
					            Thread.sleep(3000);
					            
					            pedido =  numeropedido();
					           faturamento = faturamento();
					            
					            
					            inserirconectar(cidade,marca,pedido,data,faturamento ,janta) ;
					            //passo 5  
					            
					            
					            
					            
					            
                          }
	  		
	  		            
                           if(verificacao.equals(ifoodrobet)) {
                        	   System.out.println("não tem robert nessa cidade");
                        	  //faz nada 
                        	  
				            
                          } else {
                        	  Thread.sleep(3000);
                        	  nomedaloja();
                        	  //clicando na marca 
					           loja(cidade,ifoodrobet);
					           Thread.sleep(3000);
					           turno(almoço);
					            buscar();
					            Thread.sleep(3000);
					            pedido =  numeropedido();
					          faturamento = faturamento();
					           marca= "ifood robert";
					           
					            
					           inserirconectar(cidade,marca,pedido,data,faturamento, almoço ) ;
					            Thread.sleep(3000); 
					            
					            turno(janta);
					            buscar();
					            Thread.sleep(3000);
					            
					            pedido =  numeropedido();
					           faturamento = faturamento();
					            
					            
					            inserirconectar(cidade,marca,pedido,data,faturamento ,janta) ;
					            //passo 6   
					            
					            
                          }  
                          
                          
                          
                          
	          
	            
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        dataAtual = dataAtual.plusDays(1);
	    }
	}
	
	
	
	
	
	
	
	
	public void buscar() {
		
		
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/data/div/div/div[3]/div[2]/div[6]/button")));
	    button.click();
	}
	
	
	
	//pegando informação de numero de pedidos no dia 
	public int numeropedido() {
		
		 WebElement elemento = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/data/div/div/div[3]/div[3]/div[1]/div[1]/div[2]")));
		 String textoDoElemento = elemento.getText();
		 int numero = Integer.parseInt(textoDoElemento);
		 return numero;
	}
	
	//pegando o numero de faturamento do dia 
	public String faturamento() {
		
		WebElement elemento = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/data/div/div/div[3]/div[3]/div[1]/div[3]/div[2]")));

		 String textoDoElemento = elemento.getText();
		// int numero = Integer.parseInt(textoDoElemento);
		 return textoDoElemento;
	}
	

	
	
	
	//pega os dados e insere no banco de dados 
	public void inserirconectar( String cidade,String marca, int numeroDePedido, String data, String numerodefaturamento , String periodo) {
		
		  String url = "jdbc:mysql://127.0.0.1:3306/saipos";
	  		String usuario = "root";
	  		String senha = "98345156";
		
		
	    // String SQL para inserir dados
	    String sql = "INSERT INTO cidades (Cidade,marca,dia,Numerodepedido,Numerodefaturamento, periodo) VALUES (?, ?, ? , ?, ?,?)";

	    try (Connection connection = DriverManager.getConnection(url, usuario, senha);
	         PreparedStatement statement = connection.prepareStatement(sql)) {
	        
	        // Define os valores para os parâmetros da consulta SQL
	        statement.setString(1, cidade);
	        statement.setString(2, marca);
	        statement.setString(3,data);
	        statement.setInt(4, numeroDePedido);
	        statement.setString(5, numerodefaturamento);
	        statement.setString(6, periodo);

	        // Executa a consulta SQL
	        int rowsInserted = statement.executeUpdate();

	        if (rowsInserted > 0) {
	            System.out.println("Um novo registro foi inserido com sucesso!");
	        }
	    } catch (SQLException e) {
	        System.out.println("Ocorreu um erro ao inserir dados na tabela.");
	        e.printStackTrace();
	    }
	}
	
	
	
	//selciona o menu de cidades
	public static void cidade() {
		 By locator = By.cssSelector("span[ng-if='hctrl.userService.getCurrentStore().short_name']");
		    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		    WebElement botaocidade = wait.until(ExpectedConditions.elementToBeClickable(locator));
		    botaocidade.click();
	}
	
	
	

	


	//clica no campo para seleciona a loja 
	public void nomedaloja() {
		
		WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/data/div/div/div[3]/div[2]/div[2]/div/div/div")));

		elementToClick.click();
	}
	
	
	
	
	public void loja(String cidade,String l) {
		
		WebElement inputElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/data/div/div/div[3]/div[2]/div[2]/div/div/div/div/div/input")));
		

	switch(cidade) {
	case "cascavel":
		switch (l) {
		  
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go cascavel (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;
		
	case "londrina":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood) (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood) (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto) (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto) (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;	
		
	case "apucarana":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go - apucarana (pr) (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke - apucarana (pr) (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;	
		
		
	case "arapongas":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood) (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood) (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto) (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto) (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;	
		
		
	case "cambe":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go - cambé (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke - cambé (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto)" + Keys.ENTER);
			break;
		case "ifoodrobet":
			inputElement.sendKeys("roberto's pastel (ifood)" + Keys.ENTER);
			break;	
		case "ddrobert":
			inputElement.sendKeys("roberto's pastel (delivery direto)" + Keys.ENTER);
			break;	
	 }
		break;	
		
	case "campo mourao":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;		
		
	case "curitiba":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke - curitiba (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go - curitiba (pr) (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke - curitiba (pr) (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;	
		
		
	case "rolandia":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke - rolândia (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go - rolândia (pr) (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke - rolândia (pr) (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;
		
	case "umuarama":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;	
		
	case "maringa":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;	
		
	case "ibipora":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood) (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto) (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto)" + Keys.ENTER);
			break;
		case "ifoodrobet":
			inputElement.sendKeys("roberto's pastel (ifood) (ifood)" + Keys.ENTER);
			break;	
			
			
	 }
		break;	
		
	case "toledo":
		switch (l) {
		
		case "ifoodmat":
			inputElement.sendKeys("matsuri to go (ifood)" + Keys.ENTER);
			break;
		case "ifoodmok":	
			inputElement.sendKeys("mok the poke (ifood)" + Keys.ENTER);
			break;
		case "ddmat":	
			inputElement.sendKeys("matsuri to go (delivery direto)" + Keys.ENTER);
			break;
		case "ddmok":	
			inputElement.sendKeys("mok the poke (delivery direto)" + Keys.ENTER);
			break;
	 }
		break;	
		
	    }
	}
	
	
	
	//seleciona o turno 
	public void turno(String turno) {
		
		 WebElement campo = driver.findElement(By.xpath("//*[@id=\"content\"]/data/div/div/div[3]/div[1]/div[4]/div/div/div"));

	        // Clica no campo
	        campo.click();
	        
         WebElement tur = driver.findElement(By.xpath("//*[@id=\"content\"]/data/div/div/div[3]/div[1]/div[4]/div/div/div/div/div/input"));
	        // Digita "janta" ou "almoço" dependendo do parâmetro passado
	        tur.sendKeys(turno + Keys.ENTER);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
