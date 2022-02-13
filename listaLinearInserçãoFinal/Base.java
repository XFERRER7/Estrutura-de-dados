package listaLinearInser��oFinal;

import java.util.Scanner;

public class Base {

static Scanner leia = new Scanner(System.in);
	
	static Contato criarContato(){
		
		String n, e;
		
		long c;System.out.println("CPF: ");
		c = leia.nextLong();leia.skip("\\R");
		
		System.out.println("Nome: ");
		n = leia.nextLine();
		
		System.out.println("Endere�o: ");
		e = leia.nextLine();
		
		Contato aux = new Contato(n, e, c);
		
		return aux;
		
		}
	
	
	
	public static void main(String[] args) {
		
		int op;
		Contato aux = null;
		Lista objLista= new Lista();
		
		op= 256;
		
		while(!objLista.setMaxTam(op));
		do{
		
		System.out.println("Digite:");
		System.out.println("1 -Inserir um Contato.");
		System.out.println("2 -Remover um Contato.");
		System.out.println("3 -Buscar um Contato.");
		System.out.println("4 -Mostrar a Lista.");
		System.out.println("5 -para ecerrar o programa.");
		op= leia.nextInt();
		
		switch(op){
		
		case 1: 
			aux = criarContato();
			if(objLista.insereFinal(aux)) System.out.println("Sucesso.");
			else System.out.println("Erro: Lista cheia.");
			aux = null;
			break;
			
		case 2:
			aux = criarContato();
			aux = objLista.retira(aux);
			if(aux== null) System.out.println("Erro: contato existente.");
			else
			{
			System.out.println("Nome: " + aux.getNome());
			System.out.println("Endere�o: " + aux.getEndereco());
			System.out.println("CPF: " + aux.getCpf());
			}
			aux= null;
			
			break;
			
			
		case 3: 
			aux= criarContato();
		aux= objLista.pesquisa(aux);
		if(aux== null) System.out.println("Erro: contato inexistente.");
		else{System.out.println("Nome: " + aux.getNome());
		System.out.println("Endere�o: " + aux.getEndereco());
		System.out.println("CPF: " + aux.getCpf());
		}
		aux= null;
		break;
		
		case 4:
			
			System.out.println(objLista.getLista());
			
			break;
			
			case 5:
				
				System.out.println("Programa encerrando.");
		}
		
		}while(op!= 5); 
		
		
			
	
		
		

	

	}


	}


