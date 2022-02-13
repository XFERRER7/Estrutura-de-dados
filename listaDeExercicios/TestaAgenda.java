package listaDeExercicios;

import java.util.Scanner;


public class TestaAgenda {
	
	
	
	private static Scanner sc = new Scanner(System.in);
	private static Contato1 menu() {
		
		sc.skip("\\R");
		System.out.println("Informe o nome do contato");
		String n = sc.nextLine();
		
		System.out.println("Informe o email");
		String e = sc.nextLine();
		
		System.out.println("Informe o telefone");
		int t = sc.nextInt();
		
		
		Contato1 aux = new Contato1(n, e, t);
		
		return aux;
	
	}
		
		
		public static void main(String[] args) {
		
		
			int op;
			Contato1 aux= null;
			Agenda objAgenda= new Agenda();
			
			op= 256;
			
			while(!objAgenda.setMaxTam(op));
			do{System.out.println("Digite:");
			System.out.println("1 -Inserir um Contato.");
			System.out.println("2 -Excluir um Contato.");
			System.out.println("3 -Buscar um Contato.");
			System.out.println("4 -Modificar contato.");
			System.out.println("5 -para ecerrar o programa.");
			op= sc.nextInt();
			switch(op){
			case 1: 
				aux= menu();
				if(objAgenda.setContato(aux)) System.out.println("Sucesso.");
				else System.out.println("Erro: Lista cheia.");
				aux = null;
				break;
				
			case 2:
				aux= menu();
				aux= objAgenda.excluirContato(aux);
				
				if(aux== null) System.out.println("Contato não existe na agenda.");
				else
				{
					System.out.println("Nome: " + aux.getNome());
				System.out.println("Endereço: " + aux.getEmail());
				System.out.println("Telefone: " + aux.getTelefone());
				System.out.println("Contato removido");
				}
				aux= null;
				
				break;
				
				
			case 3: 
				aux= menu();
			aux= objAgenda.buscarContato(aux);
			if(aux== null) System.out.println("Contato não existe na agenda");
			else{System.out.println("Nome: " + aux.getNome());
			System.out.println("Endereço: " + aux.getEmail());
			System.out.println("Telefone: " + aux.getTelefone());
			}
			aux= null;
			break;
			
			case 4:
				aux = menu();
				aux = objAgenda.buscarContato(aux);
				sc.skip("\\R");
				System.out.println("Novo nome");
				String no = sc.nextLine();
				System.out.println("Novo email");
				String em = sc.nextLine();
				System.out.println("Novo telefone");
				long te = sc.nextLong();
				objAgenda.modificarContato(no, em, te);
				System.out.println("Contato modificado");
				
				break;
				
				case 5:
					
					System.out.println("Programa encerrando.");
			}
			
			}while(op!= 5); 
			
			
				
		
			
			

		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
