	package listaLinearEncadeada;

import java.util.Scanner;

public class Base {

	
	private static Scanner leia = new Scanner(System.in);
	private static ItemCompra obtemItemCompra() {
		
		leia.skip("\\R");
		System.out.println("Informe: ");
		System.out.println("A descrição");
		String d = leia.nextLine();
		System.out.println("A quantidade: ");
		int q = leia.nextInt();
		System.out.println("Preço");
		double p = leia.nextDouble();
		
		ItemCompra aux = new ItemCompra(d,q,p);
		
		
		
		
		return aux;
		
	}
	
	public static void main(String[] args) {
		int op = 0;
		Lista l1 = new Lista();
		ItemCompra aux = null;
		
		
		
		do {
			
			System.out.println("Escolha uma opção");
			System.out.println("1-Inserir item");
			System.out.println("2-Remover item");
			System.out.println("3-Pesquisa item");
			System.out.println("4-Mostrar lista");
			System.out.println("5-Encerrar programa");
			op = leia.nextInt();
			
			switch(op){
				
			
			
			case 1: //Inserir no ínicio
				
				aux = obtemItemCompra();
				l1.inserirInicio(aux);
				aux = null;
				System.out.println("Tamanho: " + l1.getQde());
				break;
				
			case 2: //Retirar
				
				aux = obtemItemCompra();
				aux = l1.retirar(aux);
				
				if(aux==null) {
					
					System.out.println("Item não existe na lista");
					
				}
				else {
				
				System.out.println("Descrição: " + aux.getDescricao());
				System.out.println("Quantidade: " + aux.getQde());
				System.out.println("Preço: " + aux.getPreco());
				
				}
				aux = null;
				
				System.out.println("Tamanho: " + l1.getQde());
				
				break;
				
				
			case 3://Buscar na lista
				
				aux = obtemItemCompra();
				aux = l1.buscar(aux);
				
				if(aux==null)System.out.println("Item não existe na lista");
				
				else {
					
					System.out.println("Descrição: " + aux.getDescricao());
					System.out.println("Quantidade: " + aux.getQde());
					System.out.println("Preço: " + aux.getPreco());
					
				     }
				
				aux = null;
				
				break;
				
				
			case 4: //Mostrar lista
				
				System.out.println(l1.getLista());
				
				
				break;
				
			case 5://Encerrar programa
				
				System.out.println("Programa encerrado");
				
				break;
				
				
			default:
					
				System.out.println("Número inválido");
				
			}
			
			
			
			
			
			
		}while(op!=5);
		
		
		
		
		
		
		
		
		
		
		

	}

}
