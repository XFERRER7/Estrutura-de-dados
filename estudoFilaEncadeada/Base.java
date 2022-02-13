package estudoFilaEncadeada;

import java.util.Scanner;

public class Base {

	
	
	private static Scanner sc = new Scanner(System.in);
	private static Contato criarContato() {
	
	sc.skip("\\R");	
	System.out.println("Nome");
	String nome = sc.nextLine();
	System.out.println("Email");
	String email = sc.nextLine();
	System.out.println("Número");
	long num = sc.nextLong();
	
	Contato aux = new Contato(nome, email, num);
	
	return aux;
	
	}
	
	public static void main(String[] args) {
		
		
		Fila f1 = new Fila();
		
		Contato aux = null;
		
		int op;
		
		do {
			
			System.out.println("Escolha");
			System.out.println("1-Enfileirar");
			System.out.println("2-Desenfileirar");
			System.out.println("3-Encerrar programa");
			op = sc.nextInt();
			
			switch(op) {
			
			case 1:
				
				aux = criarContato();
				f1.enfileirar(aux);
				aux = null;
				
				break;
				
			case 2:
				
				aux = f1.desenfileirar();
				if(aux == null) {
					
					System.out.println("Fila vazia");
					
				}
				else {
					
					System.out.println(aux.getNome());
					System.out.println(aux.getEmail());
					System.out.println(aux.getNumero());
					
				}
				break;
				
			case 3:
				
				System.out.println("Programa encerrado");
				
				break;
				
				default:
					
					System.out.println("Número inválido");
			
			
			
			
			
			
			
			}
			
			
			
			
		}while(op !=3);
		
		
		
		
		
		
		

	}

}
