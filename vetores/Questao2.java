 package vetores;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
	
		
		
		
		Scanner sc = new Scanner(System.in);
		int s = 0;
		System.out.println("Informe o tamanho dos dois vetores(a e b).");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double[] Y = new double[a];
		double[] Z = new double[b];
		double[] X = new double[b];
		
		System.out.println("Informe os itens de a.");
		
		for( int u = 0; u < a; u++ ) {
			System.out.printf( "A[%d] = ", u );
			Y[u] = sc.nextDouble();
			
		}
		
		
		System.out.println("Informe os itens de b.");
		
		for( int n = 0; n < b; n++ ) {
			System.out.printf( "B[%d] = ", n );
			Z[n] = sc.nextDouble();
			
		}
		
		
		if(a==b) {
        System.out.println("Arrays iguais");
		for(int m=0; m<a;m++) {
			
			X[m]= Y[m]+Z[m];
					
			
		}
		
		}
		
		
		for(int k=0; k<a;k++) {
		
		System.out.println("1° grupo " + "["+ k + "]  : "+Y[k]);
		
		}
		
		for(int g=0; g<a;g++) {
			
			System.out.println("2° grupo " + "["+ g + "]  : "+Z[g]);
			
			}
		
		for(int o=0; o<a;o++) {
			
			System.out.println("3° grupo " + "["+ o + "]  : "+X[o]);
			
			}
		
		
	}
		
	}


