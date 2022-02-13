package listaDeExercicios;

import java.util.Scanner;

public class TestaEquacao {

	private static Scanner sc = new Scanner(System.in);

	private static Equacao menu() {
		
		
		System.out.println("Informe o valor de a");
		double a = sc.nextDouble();
		System.out.println("Informe o valor de b");
		double b = sc.nextDouble();
		System.out.println("Informe o valor de c");
		double c = sc.nextDouble();
		
		Equacao e1 = new Equacao(a, b, c);
		
		
		e1.caucularDelta(a, b, c);
		
		e1.caucularX();
	
		System.out.println(e1.toString());
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Equacao aux = null;
		
		System.out.println("Quantas equações deseja caucular?");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			
			
			aux = menu();
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
