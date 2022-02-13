package estudoFilaEncadeada;

public class Fila {
	
	public class No{
		
		private Contato dados;
		private No ant;
		
		public No(Contato c) {
			
			this.dados = c;
			this.ant = null;
			
			
		}
		
		
	}
	
	
	private int qtd;
	private No inicio;
	private No fim;
	public Fila() {
		
		this.qtd = 0;
		this.inicio = null;
		this.fim = null;
		
	}
	
	public void enfileirar(Contato aux) {
		
		No no = new No(aux);
		
		
		if(vazia()) {
			
			inicio = no;
			fim = no;
			
		}
		
		else {
			
			fim.ant = no;
			fim = no;
			
			
		}
		qtd++;
	}
	
	public Contato desenfileirar() {
		
		No aux = inicio;
		if(vazia()) return null;
		
		inicio = aux.ant;
		aux.ant = null;
		
		Contato ret = aux.dados;
		
		aux.dados = null;
		
		qtd--;
		
		return ret;
		
	}
	
	
	public boolean vazia() {
		
		if(inicio == null) return true;
		
		
		return false;
		
	}
	
	
	
	
	
	
	
	
}
