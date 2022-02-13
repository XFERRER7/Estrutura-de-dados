package aula2;

import java.util.Scanner;

public class Base {
	
	
	
	static Scanner leia= new Scanner(System.in);
	
	public static Item obtemItem() {
	
	String desc;
	int qt, pri;
	System.out.println("Quantidade:");
	qt = Integer.parseInt(leia.next());
	
	System.out.println("Prioridade:");
	pri= Integer.parseInt(leia.next());
	leia.skip("\\R");
	
	System.out.println("Descrição:");
	
	desc= leia.nextLine();
	
	Item aux= new Item(desc, qt, pri);
	
	return aux;
	
	
	
	}
	
	
	public static void main(String[] args) {
	
		int tam = 33;

		Item [] vetA = new Item [5];
	

		for (int i = 0; i < 5; i++) {
		
						
			vetA[i] = obtemItem();
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			
			
		System.out.println(vetA[i].toString());	
			
			
			
			
			
			
			
		}
		
		
		
	}

}
