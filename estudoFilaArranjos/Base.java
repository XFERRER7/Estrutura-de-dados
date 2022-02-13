package estudoFilaArranjos;

import java.util.Scanner;

public class Base {

	private static Scanner sc = new Scanner(System.in);
	private static Jogador criarJogador() {
	
	sc.skip("\\R");	
	System.out.println("Nome");
	String nome = sc.nextLine();
	System.out.println("Clube");
	String clube = sc.nextLine();
	System.out.println("Idade");
	int idade = sc.nextInt();
	
	Jogador aux = new Jogador(nome, clube, idade);
	
	return aux;
	
	}
	
	public static void main(String[] args) {
		
		
		Fila f1 = new Fila();
		
		Jogador aux = null;
		
		int op;
		
		do {
			
			System.out.println("Informe o tamnaho da fila");
			op = sc.nextInt();
			
		}while(!f1.setTam(op));
		
		
		do {
			System.out.println("Escolha");
			System.out.println("1-Enfileirar");
			System.out.println("2-Desenfileirar");
			System.out.println("3-Encerrar programa");
			op = sc.nextInt();
			
			switch(op) {
			
			
			case 1:
				
				aux = criarJogador();
				if(f1.enfileirar(aux)){
					
					System.out.println("Sucesso");
					
				}
				else {
					
					System.out.println("Fila cheia");
					
				}
				aux = null;
				
				break;
				
			case 2:
				
				aux = f1.desenfileirar();
				if(aux == null) {
					
					System.out.println("Fila vazia");
					
				}
				else {
					
					System.out.println(aux.getNome());
					System.out.println(aux.getClube());
					System.out.println(aux.getIdade());
					
				}
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
