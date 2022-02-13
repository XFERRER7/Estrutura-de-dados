package vetores;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
	      

        Scanner sc = new Scanner( System.in );
		
		System.out.println( "Digite o tamanho dos vetores A e B:" );
		int da = sc.nextInt();
		int db = sc.nextInt();
		double[] A = new double[da];
		double[] B = new double[db];
		int dc = da;
		double[] C = new double[dc];
		int op;
		
		do {
		System.out.println( "Digite os elementos do vetor A:" );
		
		for( int i = 0; i < da; i++ ){
			
			A[i] = sc.nextDouble();
			}
		
		System.out.println( "Digite os elementos do vetor B:" );
		
		for( int i = 0; i < db; i++ ) {
			
			B[i] = sc.nextDouble();	
			
			double soma = 0;
			for( int h = 0; h < db; h++) {
				soma = soma + B[h];
			}
			
			for( int e = 0; e < dc; e++ )
				C[e] = A[e] * soma;
			
		}
		
		System.out.print( "A = {\t" );
	   
		for( int i = 0; i < da; i++ ) {
        
	    System.out.printf( "%f\t", A[i] );
			
		}
		System.out.println( "}\n" );
		
		System.out.print( "B = {\t" );
		
		for( int i = 0; i < db; i++)
			System.out.printf( "%f\t", B[i] );
	
	
	System.out.println( "}\n" );
	
	System.out.print( "C = {\t" );	
			
	for( int v = 0; v < dc; v++ ) {		
			
		System.out.printf( "%f\t", C[v] );
			
		}
    System.out.println( "}\n" );
		
    
         System.out.println("Deseja executar o programa outra vez?");
         System.out.println("1-Sim");
         System.out.println("2-Não");
         op = sc.nextInt();
		
		}while(op == 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
