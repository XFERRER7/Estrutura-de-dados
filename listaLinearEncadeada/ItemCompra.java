package listaLinearEncadeada;

public class ItemCompra {

	private String descricao;
	private int qde;
	private double preco;
	
	public ItemCompra(String d, int q, double p) {
		
		
		this.descricao = d;
		this.preco = p;
		this.qde = q;
		
		
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQde() {
		return qde;
	}
	public boolean setQde(int qde) {
		this.qde = qde;
		
		if(qde<0) return false;
		
		return true;
		
		
	}
	public double getPreco() {
		return preco;
	}
	public boolean setPreco(double preco) {
		this.preco = preco;
		
		if(preco<0)return false;
		return true;
	}
	@Override
	public String toString() {
		return "ItemCompra [descricao=" + descricao + ", qde=" + qde + ", preco=" + preco + "]";
	}
	
	
	
	
}
