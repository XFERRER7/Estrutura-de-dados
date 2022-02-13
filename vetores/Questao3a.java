package vetores;

import java.util.Scanner;

public class Questao3a {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int r=0;
		System.out.println("Informe o tamanho dos dois vetores(a e b).");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double[] Y = new double[a];
		double[] Z = new double[b];
		double[] X = new double[a];
		double[] V = new double[b];
		double[] I = new double[a];
		//Lê de dados
		System.out.println("Informe os itens de A.");
		for( int u = 0; u < a; u++ ) {
			System.out.printf( "A[%d] = ", u );
			Y[u] = sc.nextDouble();
			
		}
		
		
		System.out.println("Informe os itens de b.");
		
		for( int n = 0; n < b; n++ ) {
			System.out.printf( "B[%d] = ", n );
			Z[n] = sc.nextDouble();
			
		}
			
		//Imprime os valores dos vetores
		for(int o=0;o<a;o++) {
			
			System.out.println("Vetor A :" + Y[o]);
			
		}
		
		for(int op=0;op<b;op++) {
			
			System.out.println("Vetor B :" + Z[op]);
			
		}	
		
		
		for(int i = 0;i<a;i++) {
			
			X[i] = Y[i];
			System.out.println("Vetor união a: "+ X[i]);
			
			
		}
		
		for(int z=0;z<b;z++) {
			
			V[z] = Z[z]; 
			
			
			System.out.println("Vetor união b: "+ V[z]);
			
			}
		
		
		for(int i = 0;i<a;i++) {
			
			if(V[i]==X[i]) {
				
				I[i] = V[i];
				
				System.out.println("Conjunto interseção:" + I[i]);
			
			}
			
			
			else if(Y[i] == Z[i]) {
				
				I[i] = V[i];
			}
			
			else 
				System.out.println("Sem conjunto interseção");
			
			
		}
		
		
		

	}

}
