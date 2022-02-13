package pilhas;

import java.util.Scanner;

public class Base {
		
		static Scanner sc = new Scanner(System.in);
		static Contato criarContato() {
		
			String nome, end;
			int cpf;
			System.out.println("CPF: ");
			cpf = sc.nextInt();
			sc.skip("\\R");
			
			System.out.println("Nome: ");
			nome = sc.nextLine();
			
			System.out.println("Endereço: ");
			end = sc.nextLine();
			
			Contato aux= new Contato(nome, end, cpf);
			return aux ;
			
		}
		
		public static void main(String[] args) {
			int op ;
			
			Contato aux = null;
			
			Pilha pilha= new Pilha();
		
			do{
				System.out.println("Tamanho da pilha: ");
				op  =  sc.nextInt();
			}
			
			while(!pilha.setMaxTam(op ));
		
			do{
				
				System.out.println("Digite:");
				System.out.println("1 - empilhar um Contato.");
				System.out.println("2 - desempilhar um Contao.");
				System.out.println("3 - para ecerrar o programa.");
				op = sc.nextInt();
				switch(op){
				case 1: 
				aux = criarContato();
				if(  pilha.push(aux)) System.out.println("Sucesso.");
				
				else
					System.out.println("Erro: pilha cheia.");
				aux = null;
				break;
		
				case 2:
					aux = pilha.pop();
					if(aux == null)
						System.out.println("Erro: pilha vazia.");
					else
					
					{
						System.out.println("Nome: " + aux.getNome());
					System.out.println("Endereço: " + aux.getEndereco());
					System.out.println("CPF: " + aux.getCpf());
					}
				    
					aux = null;
					break;
					case 3:
						System.out.println("Programa encerrando.");
						
				}
				
			}while(op != 3); 
				
				
				
				
		
		}
		
		
	}


