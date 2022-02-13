package listaDeExercicios;

import java.util.Scanner;

public class TestaCone {

	static Scanner sc = new Scanner(System.in);
	static Cone menu() {
		
		double r;
		double a;
		
		Cone c1 = new Cone();
		System.out.println("Informe o valor do raio");
		r = sc.nextDouble();
		
		System.out.println("Informe o valor da altura");
		a = sc.nextDouble();
		c1.setGeratriz(r, a);
		c1.setAreaLateral(r, a);
		c1.setAreaTotal(r, a);
		c1.setVolume(r, a);
		System.out.println("Geratriz: " + c1.getGeratriz());
		System.out.println("Área lateral: " + c1.getAreaLateral());
		System.out.println("Área total: " + c1.getAreaTotal());
		System.out.println("Volume: " + c1.getVolume());
		Cone aux = new Cone();
		
		return aux;	
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Cone c2 = new Cone();
		
		System.out.println("Quantos cones?");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			
			c2 = menu();
			
		}
	
	}

}
