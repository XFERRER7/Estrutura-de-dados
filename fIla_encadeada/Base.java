package fIla_encadeada;

import java.util.Scanner;

public class Base {
	
	//11, 12, 23, 14, 25, 50, 8, 18, 29, 10
	
	private static Scanner sc = new Scanner(System.in);
	
	    public static Cliente obtemCliente() {
		
		sc.skip("\\R");
		System.out.println("Informe o nome do cliente ");
		String n = sc.nextLine();
		System.out.println("Informe o CPF");
		int c = sc.nextInt();
		System.out.println("Informe o telefone");
		int t = sc.nextInt();
		
		Cliente aux = new Cliente(n, c, t);
		
		return aux;
		
	}
	
	
	public static void main(String[] args) {
		
        int op = 0;

        Fila f1 = new Fila();
        
        Cliente aux = null;
        
        
		
		do {
			
			
			System.out.println("Digite:");
			System.out.println("1-Para enfileirar");
			System.out.println("2-Para desenfileirar");
			System.out.println("3-Para encerrar");
            op = sc.nextInt();
            
            switch(op) {
            
            
            case 1:
            	
            	aux = obtemCliente();
            	f1.enfileirar(aux);
            	aux = null;
            	
            	break;
            	
            case 2:
            	
            	aux = f1.desenfileirar();
            	if(aux==null) System.out.println("Fila vazia");
            	else System.out.println(aux.getCliente());
            	aux = null;
            	
            	break;
            	
            case 3:
            	
            	
            	System.out.println("Programa encerrado");
            	
            	
            	break;
            	
            	default:
            		
            		
            		System.out.println("Número inválido");
            		
            }
			
		}while(op != 3);
		
	}

}
