package listaDeExercicios;

public class Triangulo {

	
	private double l1;
	private double l2;
	private double l3;
	private String tipo;
	private String angulo;
	public Triangulo(double l1, double l2, double l3) {
		
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		
	}
	
	public double getL1() {
		return l1;
	}
	public void setL1(double l1) {
		
		
		
		this.l1 = l1;
	}
	public double getL2() {
		return l2;
	}
	public void setL2(double l2) {
		this.l2 = l2;
	}
	public double getL3() {
		return l3;
	}
	public void setL3(double l3) {
		this.l3 = l3;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String verificarTipo(double l1, double l2,double l3) {
		
		if(l1==l2 && l2==l3) {
			
			this.tipo = "Equilátero";
		}
		else if(l1==l2 && l1!=l3 || l2==l3 && l2!=l1) {
			
			this.tipo = "Isósceles";
			
		}
		else if(l1!=l2 && l2!=l3) {
			
			this.tipo = "Escaleno";
			
		}
			
			
			return tipo;
		
	}
	
	public String angulo(double l1,double l2,double l3) {
		
		if((Math.pow(l2,2) + Math.pow(l3,2) > Math.pow(l1,2))) {
		angulo = "Acutângulo";
		}
		else if((Math.pow(l2,2) + Math.pow(l3,2) < Math.pow(l1,2))) {
		angulo = "Obtusângulo";
		}
		else if((Math.pow(l2,2) + Math.pow(l3,2) == Math.pow(l1,2))) {
				angulo = "Retângulo";
		}
		
		return angulo;
		
		
		
		
		
		
	}
	public String getAngulo() {
		return angulo;
	}
	public void setAngulo(String angulo) {
		this.angulo = angulo;
	}

	@Override
	public String toString() {
		return "Triangulo [Lado 1 = " + l1 + ", Lado 2 = " + l2 + ", Lado 3 = " + l3 + ", Tipo = " + tipo + ", Ângulo = " + angulo + "]";
	}
	
	
	
	
	
	
}
