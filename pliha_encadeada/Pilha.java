package pliha_encadeada;


public class Pilha {

	
	private class No {
		
		private Livro dados;
		private No prox;
		
		
		public No(Livro l) {
			this.dados = l;
			this.prox = null;
		}	
		
	}
	
	private No topo;
	private int qtd;
	
	
	
	public void empilhar(Livro aux) {
		
		No no1 = new No(aux);
		
		no1.prox = topo;
		
		topo = no1;
		
		qtd++;
		
		
		
	}
	
	public Livro desempilhar() {
		if(vazia()) return null;
		
		No aux = topo;
		
		topo = aux.prox;
		
		aux.prox = null;
		
		qtd--;
		
		Livro ret = aux.dados;
		
		aux.dados = null;
		
		return ret;
		
		
	}
	
	public boolean vazia() {
		return topo == null;
		
		
	}

	public int getQtd() {
		return qtd;
	}
	
	
	public Pilha() {
		
		this.qtd = 0;
		this.topo = null;
		
	}
	
	
	
	
	
	
	
	
	
	
}
