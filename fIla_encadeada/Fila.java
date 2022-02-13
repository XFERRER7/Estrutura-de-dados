package fIla_encadeada;



public class Fila {

	public class No{
		
		private Cliente dados;
		private No ant;
		
		public No(Cliente c) {
			
			this.dados = c;
			this.ant = null;
			
			
		}
		
		
	}
	
	private No inicio;
	private No fim;
	private int tam;
	
	public void enfileirar(Cliente aux) {
				
		No no = new No(aux);
		if(vazia()) {
			
			inicio = no;
			fim = no;
			
		}
		
		else {
		
		fim.ant = no;
	    
	    fim = no;
	    
		}
		
		tam++;
	}
	
	public Cliente desenfileirar() {
		if(vazia()) return null;
		
		No no = inicio;
		
		inicio = no.ant;
		
		no.ant = null;
        
		Cliente ret = no.dados;
		
		tam--;
		
		if(inicio==null) fim=null;
		
		return ret;
		
	}
	
	public boolean vazia() {
		
		
		
		
		return inicio == null;
		
		
		
	}
	
	public int getTamanho() {
		return tam;
		
		
		
	}
	
	public Fila() {
		
		this.tam = 0;
		this.fim = null;
		this.inicio = null;
		
		
		
		
	}
	
	
	
	
	
	
}
