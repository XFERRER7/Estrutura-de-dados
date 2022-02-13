package estudoFilaArranjos;

public class Jogador {

	
	private String nome;
	private String clube;
	private int idade;
	
	public Jogador(String n, String c, int i) {
		
		this.nome = n;
		this.clube = c;
		this.idade = i;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClube() {
		return clube;
	}

	public void setClube(String clube) {
		this.clube = clube;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
}
