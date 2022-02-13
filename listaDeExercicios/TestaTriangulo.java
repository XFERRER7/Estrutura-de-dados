package listaDeExercicios;

import java.util.Scanner;

public class TestaTriangulo {

	private static Scanner sc = new Scanner(System.in);
	static Triangulo menu() {
		
		Triangulo aux1 = null;
		System.out.println("Informe o valor do primeiro lado");
		double lado1 = sc.nextDouble();
		System.out.println("Informe o valor do segundo lado");
		double lado2 = sc.nextDouble();
		System.out.println("Informe o valor do terceiro lado");
		double lado3 = sc.nextDouble();
		
		Triangulo t1 = new Triangulo(lado1, lado2, lado3);
		
		
		t1.angulo(lado1, lado2, lado3);
		t1.verificarTipo(lado1, lado2, lado3);
		System.out.println(t1.toString());
		
		return aux1;
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Triangulo aux = null;
			
		System.out.println("Quantos triângulos deseja analisar?");
		int q = sc.nextInt();
		for(int i = 0;i<q;i++) {
			
			aux = menu();
			
		}
		
		

	}

}
