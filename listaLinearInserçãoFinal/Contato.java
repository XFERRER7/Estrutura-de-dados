package listaLinearInserçãoFinal;

public class Contato {

	
	

	private String nome, endereco;
	private long cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public Contato(String n, String e, long c) {
		
		this.nome = n;
		this.endereco = e;
		this.cpf = c;
	}
	
	public String getContato(){
		String aux= nome + "\n" + endereco+ "\n" + Long.toString(cpf) + "\n";
		return aux;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
