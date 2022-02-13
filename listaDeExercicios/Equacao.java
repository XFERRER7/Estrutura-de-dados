package listaDeExercicios;

public class Equacao {

	private double a;
	private double b;
	private double c;
	private double resultado;
	private double x1;
	private double x2;
	private double delta;
	
	
	
	
	public Equacao(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
  
	public double caucularDelta(double a, double b, double c) {
		
		
		this.delta =(Math.pow(-b,2)-(4*a*c));
		
		
		
		
		return delta;
		
	}
	
	
	public double caucularX() {
		
		
        x1 = ((-b) + Math.sqrt(delta))/(2*a);
		
		x2 = ((-b) - Math.sqrt(delta))/(2*a);
		
		return resultado;
		
	}
	
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	
	
	@Override
	public String toString() {
		return "Equacao [a = " + a + ", b = " + b + ", c = " + c + ", Raiz 1 =  " + x1 + ", Raiz 2 = " + x2
				+ ", delta = " + delta + "]";
	}
	
	
	
	
	
	
	
	
	
}
