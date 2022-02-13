package estudoPilhasEncadeadas;

public class Time {

	
	private String nome;
	private String estadio;
	private int numTitulos;
	
	
	public Time(String n,String e, int nt) {
		
		this.nome = n;
		this.estadio = e;
		this.numTitulos = nt;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEstadio() {
		return estadio;
	}


	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}


	public int getNumTitulos() {
		return numTitulos;
	}


	public void setNumTitulos(int numTitulos) {
		this.numTitulos = numTitulos;
	}


	@Override
	public String toString() {
		return "Time [nome = " + nome + ", estadio = " + estadio + ", numTitulos = " + numTitulos + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
