package listaDeExercicios;

public class Contato1 {
	private String nome;
	private String email;
	private long telefone;
	
	
	
	public Contato1(String n, String e, long t) {
		
		this.nome = n;
		this.email = e;
		this.telefone = t;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long novoTel) {
		this.telefone = novoTel;
	}	
	
	
	public String getContato(){
		String aux= nome + "\n" + email + "\n" + Long.toString(telefone) + "\n";
		return aux;
	}
	
	
	
}
