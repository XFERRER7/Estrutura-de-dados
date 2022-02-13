package listaDeExercicios;

public class Cone {

	private double raio;
	private double altura;
	private double geratriz;
	private double areaLateral;
	private double areaTotal;
	private double volume;
	
	



	public double getGeratriz() {
		
		
		return geratriz;
	}




	public void setGeratriz(double raio, double altura) {
		
		
		
		this.geratriz = Math.sqrt((altura*altura)+(raio*raio));;
	}




	public double getRaio() {
		return raio;
	}




	public void setRaio(double raio) {
		this.raio = raio;
	}




	public double getAltura() {
		return altura;
	}




	public void setAltura(double altura) {
		this.altura = altura;
	}




	public double getAreaLateral() {
		return areaLateral;
	}




	public void setAreaLateral(double raio, double altura) {
		this.areaLateral = (3.14*raio*geratriz);
	}




	public double getAreaTotal() {
		return areaTotal;
	}




	public void setAreaTotal(double raio, double altura) {
		this.areaTotal = (3.14*raio*(geratriz+raio));
	}




	public double getVolume() {
		return volume;
	}




	public void setVolume(double raio, double altura) {
		this.volume = (1.0/3.0*3.14*raio*raio*altura);
	}




	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}
	
	
	
	
	
	
	
	
	
	
	
		
}
