package robosaipos;

public class robo {

	public static void main(String[] args) throws InterruptedException {
		
		String ifoodmat= "ifoodmat";
		String ifoodmok= "ifoodmok";
		String ddmat = "ddmat";
		String ddmok = "ddmok";
		
		metodos r = new metodos();
		
	//	String url = "jdbc:mysql://127.0.0.1:3306/saipos";
	//	String usuario = "root";
		//String senha = "98345156";
		
		//r.conectaraobanco(url,usuario,senha);
		
		
		
		r.abrirPagina();
		
		 

		
		 r.preenchercampodata(12,12, 2023,13,12,2023,"londrina",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
		
		
		
		
		 r.cidade();
	
		
		//pegando rolandia 
		
		
			
			r.preenchercampodata(12,12, 2023,13,12,2023,"rolandia",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
			
			
			
			r.cidade();
			
			//pegando toledo
			
		
				
				    r.preenchercampodata(12,12, 2023,13,12,2023,"toledo",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
				
				    r.cidade();
				
				    //pegando curitiba
					r.preenchercampodata(12,12, 2023,13,12,2023,"curitiba",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
					
					
				
					//pegando cascavel
				
					  r.cidade();
						
				      r.preenchercampodata(12,12, 2023,13,12,2023,"cascavel",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
						
						
						
						
						
						
						
						//pegando maringa
						
						
						
					      r.cidade();
							
						  r.preenchercampodata(12,12, 2023,13,12,2023,"maringa",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
					
						  r.cidade();
						  
						  //pegando ibipora	
						 r.preenchercampodata(12,12, 2023,13,12,2023,"ibipora",ifoodmat,ifoodmok,ddmat,ddmok,"0","ifoodrobet");
								
								
						  r.cidade();	
						  //pegando cambe
						  r.preenchercampodata(12,12, 2023,13,12,2023,"cambe",ifoodmat,ifoodmok,ddmat,ddmok,"ddrobert","ifoodrobet");
							
						  //pegando arapongas			
					       r.cidade();
											
				          r.preenchercampodata(12,12, 2023,13,12,2023,"arapongas",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
					
				
			              //pegando umuarama
											
				          r.cidade();				
											
												
			              r.preenchercampodata(12,12, 2023,13,12,2023,"umuarama",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
												
												
				          //pegando arapongas
												
			               r.cidade();								
												
												  
													
		             	 r.preenchercampodata(12,12, 2023,13,12,2023,"campo mourao",ifoodmat,ifoodmok,ddmat,ddmok,"0","0"); 
												
												
			              r.cidade();								
				 
				 
				         r.preenchercampodata(12,12, 2023,13,12,2023,"apucarana",ifoodmat,ifoodmok,ddmat,ddmok,"0","0"); 
												
											
				         r.cidade();							
				 
				 
				         r.preenchercampodata(12,12, 2023,13,12,2023,"cianorte",ifoodmat,ifoodmok,ddmat,ddmok,"0","0"); 			
				 
				         r.cidade();	
							
					
				         r.preenchercampodata(12,12, 2023,13,12,2023,"jundiai",ifoodmat,ifoodmok,ddmat,ddmok,"0","0");
				 
				 
				
				 

	}

}
