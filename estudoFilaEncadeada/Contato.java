package estudoFilaEncadeada;

public class Contato {

	
	private String nome;
	private String email;
	private long numero;
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
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	
	public Contato(String n, String e, long num) {
		
		this.nome = n;
		this.email = e;
		this.numero = num;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
