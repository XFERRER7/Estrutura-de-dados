package estudoPilhasEncadeadas;

import java.util.Scanner;

public class Base {

	
	
	
	private static Scanner sc = new Scanner(System.in);
	private static Time criarTime() {
		
		
		
		sc.skip("\\R");
		System.out.println("Nome");
		String nome = sc.nextLine();
		
		System.out.println("Estádio");
		String estadio = sc.nextLine();
		
		System.out.println("Número de títulos");
		int numT = sc.nextInt();
		
		Time aux = new Time(nome, estadio, numT);
		
		return aux;
		
	}
	
	
	
	public static void main(String[] args) {


		Time aux = null;
		
		Pilha p1 = new Pilha();
		
		int op;
		
		do {
		
		System.out.println("Digite");
		System.out.println("1-Empilhar");
		System.out.println("2-Desempilhar");
		System.out.println("3-Encerrar programa");
		op = sc.nextInt();
		
		
			
			switch(op) {
			
			
			case 1:
				
				aux = criarTime();
				p1.push(aux);
				aux = null;
				
				break;
				
			case 2:
				
				aux = p1.pop();
				
				if(aux == null) {
				   
				   System.out.println("A pilha está vazia");
				   
				}
				
				else
					
					System.out.println(aux.toString());
					
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
