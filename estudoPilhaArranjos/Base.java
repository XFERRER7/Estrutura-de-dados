package estudoPilhaArranjos;

import java.util.Scanner;

public class Base {

	
	private static Scanner sc = new Scanner(System.in);
	private static Aluno criarAluno() {
		
		sc.skip("\\R");
		System.out.println("Nome");
		String nome = sc.nextLine();
		
		System.out.println("Idade");
		int i = sc.nextInt();
		
		System.out.println("Turma");
		int t = sc.nextInt();
		
		
		
		Aluno aux = new Aluno(nome, i, t);
		
		
		return aux;
		
	}
	
	public static void main(String[] args) {
		
		Pilha p1 = new Pilha();
		
		Aluno aux = null;
		
		int op;
		
		do{
			System.out.println("Tamanho da pilha: ");
			op  =  sc.nextInt();
		
		}while(!p1.setTam(op));
	
		
		do {
		System.out.println("Escolha");
		System.out.println("1-Empilhar");
		System.out.println("2-Desempilhar");
		System.out.println("3-Encerrar programa");
		op = sc.nextInt();
		
		
		switch(op) {
		
		
		
		case 1:
			
			aux = criarAluno();
			if(p1.push(aux)) System.out.println("Sucesso");
			
			else 
				System.out.println("Pilha cheia");
			
			aux = null;
			
			break;
			
		case 2:
			
			
			aux = p1.pop();
            
			if(aux == null) {
				
				System.out.println("Pilha vazia");
				
			}
			else {
				System.out.println(aux.getNome());
				System.out.println(aux.getTurma());
			    System.out.println(aux.getIdade());
			}
			aux = null;
			
			break;
			
		case 3:
			
			System.out.println("Programa encerrando");
			
			break;
			
			
			default:
		
				System.out.println("Número inválido");
				
				
				
		}
		
		
		
		}while(op != 3);
		

	}

}
