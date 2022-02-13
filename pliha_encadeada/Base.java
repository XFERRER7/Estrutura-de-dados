package pliha_encadeada;

import java.util.Scanner;

import pliha_encadeada.Livro;
import pliha_encadeada.Pilha;


public class Base {

	//11, 12, 23, 14, 25, 50, 8, 18, 29, 10
	
	private static Scanner sc = new Scanner(System.in);
	private static Livro obtemLivro() {
		sc.skip("\\R");
		System.out.println("Título do livro ");
		String t = sc.nextLine();
		System.out.println("Nome do autor ");
		String n = sc.nextLine();
		System.out.println("Editora do livro ");
		String e = sc.nextLine();
		
		Livro aux = new Livro(t, n, e);
		
		return aux;
		
		  
		
	}

	
	
	public static void main(String[] args) {
		
		
		int op = 0;
		
		Pilha p1 = new Pilha();
		Livro aux = null;
		
		
		do {
			System.out.println("Digite:");
			System.out.println("1-Empilhar");
			System.out.println("2-Desempilhar");
			System.out.println("3-Método");
			System.out.println("4-Enfileirar");
			System.out.println("5-Enfileirar");
	        op = sc.nextInt();
			
			switch(op) {
			
			case 1:
			    
				aux = obtemLivro();
				p1.empilhar(aux);
				aux = null;
				
				
				break;
				
			case 2:
				
				aux = p1.desempilhar();
				if(aux == null) System.out.println("Pilha vazia");
				else System.out.println(aux.getLivro());
				aux = null;
				break;
				
			case 3:
				
				System.out.println("Sucesso");
				
				break;
				
			case 4:
				
				
				break;
				
				
			case 5:
				
				
				break;
			
				
				
			}
		}while(op != 8);
		
		
		
		
		

	}

}
