package fila;

import java.util.Scanner;

public class Base {

	
	private static Scanner sc = new Scanner(System.in);
    private static Cliente criarCliente() {
	  Cliente aux= new Cliente();
    System.out.println("Nome: ");
    sc.skip("\\R");
    String n= sc.nextLine();
    aux.setNome(n);
    
    int i;
    
    do
{
  	  System.out.println("Idade: ");
    i= sc.nextInt();
}     while(!aux.setIdade(i));
     return aux;
}
	
    private static Fila mostrarFila(Fila orig) {
    	Fila aux= new Fila();
    aux.setMaxTam(orig.getMaxTam());
    Cliente cli;
    while(!orig.filaVazia()) {
    	cli= orig.desenfileirar();
    	System.out.println("Nome:" + cli.getNome()+"\n"+"Idade:"+ cli.getIdade());
    	aux.enfileirar(cli);
    	}
    return aux;
    }
	
	public static void main(String[] args) {
		Fila obj= new Fila();	
		 int op;
		    do{System.out.println("Tamanho da fila: ");
		    op= sc.nextInt();
		    }
		    while(!obj.setMaxTam(op));
		    
		    Cliente aux;
		    do
		    {
		    System.out.println("Digite:");
		    System.out.println("1 -enfileirar cliente.");
		    System.out.println("2 -desenfileirar cliente.");
		    System.out.println("3 -mostrar fila.");
		    System.out.println("4 -encerrar.");
		    op= sc.nextInt();
		    switch(op) {
		    
		    case 1:
		    aux= criarCliente();
		    if(obj.enfileirar(aux)) 
		    	System.out.println("Sucesso!");
		    else {
		    	System.out.println("Fila cheia!");
		    aux= null;
		    
		    }
		    break;
		    case 2:
		    	aux= obj.desenfileirar();
		    if(aux == null)
		    	{
		    	System.out.println("Fila vazia!");
		    	}
		    else
		    {	
		    	System.out.println("Sucesso: cliente desenfileirado");
		    	System.out.println(aux.getNome()+"\n"+aux.getIdade());
		    	}
		    break;
		    case 3:
		    	obj= mostrarFila(obj);
		    break;
		    case 4: 
		    	System.out.println("Programencerrando");
		    break;
		    default:
		    	System.out.println("Opção inválida. Tente novamente.");
		    }
		    
		    }while(op!= 4);
	
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    }
		
		
		}
		
	
      
      
