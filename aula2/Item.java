package aula2;



public class Item {

	public Item(String desc, int qt, int pri) {
		
		String descricao = desc;
		int quantidade = qt;
		int prioridade = pri;
		
	}
	
	
	
	public void setDescricao(String aux) {
		
		String descricao = null;
	
		aux = descricao;
	
	}
	public void setQuantidade(int aux) {
		
		int quantidade = 0;
	
		aux = quantidade;
	}
	public void setPrioridade(int aux) {
		
		int prioridade = 0;
	
		aux = prioridade;
	
	}
	
	public String getDescricao() {
		
		String descricao = null;
	
		return descricao;
	
	}

	public int getQuantidade () {
		
		int quantidade = 0;
	
		return quantidade;
	
	}

	public int getPrioridade () { 
		
		int prioridade = 0;
	
		return prioridade;
	
	}

	@Override
	public String toString() {
		return "Item [getDescricao()=" + getDescricao() + ", getQuantidade()=" + getQuantidade() + ", getPrioridade()="
				+ getPrioridade() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
