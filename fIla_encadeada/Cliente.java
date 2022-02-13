package fIla_encadeada;

public class Cliente {

	
	private int cpf;
	private String nome;
	private int fone;
	
	public Cliente(String n, int c, int t) {
		
		this.cpf = c;
		this.fone = t;
		this.nome = n;
		
	}


	
	public String getCliente() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", fone=" + fone + "]";
	}
	
	
	
	
	
	
	
	
}
