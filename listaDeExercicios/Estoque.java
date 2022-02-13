package listaDeExercicios;

import java.util.Arrays;

public class Estoque {

	
	private String descricao;
	private int qde;
	private int prodNum;
	private double preco;
	private String obj1;




	public Estoque(String d, int q, int n, double p) {
		
		
		this.descricao = d;
		this.qde = q;
		this.preco = p;
		this.prodNum = n;
		
		
	}





	public void setEstoque(String d, int q, int pn,double p) { 
		
		
		this.obj1 = (d + q + pn + p);
		
	    	
	    }
		
		
		
		
			
		
		
		
	
	
	 
	public void getEstoque() {
	    System.out.println("-------------------------");
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.preco);
	    System.out.println("Número de produtos: " + this.prodNum);
		System.out.println("Quantidade:" + this.qde);
		
	}





	


	

	
	
	
	
	
	
	
	
	
}
