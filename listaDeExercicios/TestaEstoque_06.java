package listaDeExercicios;

import java.util.Scanner;

public class TestaEstoque_06 {

	
	private static Scanner sc = new Scanner(System.in);
	
	private static Estoque obtemObj() {
		
	String d; 
	int q; 
	int n;
	double p;
	
	
	    
	    
	    

	
	  
	    
	    System.out.println("Informe:");	
		System.out.println("A descri��o do produto");
		d = sc.nextLine();
		
		System.out.println("A quantidade");
		q = sc.nextInt();
		
		System.out.println("O n�mero de produtos");
		n = sc.nextInt();
		 
		System.out.println("O pre�o");
		p = sc.nextDouble();
		sc.skip("\\R");
		Estoque obj = new Estoque(d, q, n, p);
        Estoque aux = new Estoque(d, q, n, p);
	    
        obj.setEstoque(d, q, n, p);
        
	    
		
	    
		return aux;	
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	    Estoque[] obj = new Estoque[9];
	
		Estoque aux = null;
		
		
		for(int i = 0;i<9;i++) {
			
		
	   	 
			
			 
			 
			 aux = obtemObj(); 
			 obj[i] = aux;
		     
			 
		}
		 
		 
	 
		 for(int z = 0;z<9;z++) {
			 
			 
			 obj[z].getEstoque();			 
			 
		 }
		
		
		
		
		

	}


}