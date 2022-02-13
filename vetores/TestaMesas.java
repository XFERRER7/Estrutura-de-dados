package vetores;

import java.util.Scanner;

public class TestaMesas {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int numMesas;
		int cont = 1;
		int codM = 0;
		int op = 0;

		do {
		    System.out.println("Informe o número de mesas");
		    numMesas = sc.nextInt();
		    if(numMesas < 50|| numMesas > 200) {
		    System.out.println("Número de mesas deve ser maior que 50 e menor que 200");
		    }
		    else
		        System.out.println("Número de mesas registrado");
		    
		}while(numMesas < 50 || numMesas > 200);

		int mesa[] = new int[numMesas];
		int cod[] = new int[numMesas];
		int lugares[] = new int [numMesas * 6];

		for(int i = 0;i<numMesas;i++){
		 
		 cod[i] = cont++; 
		 lugares[i] = 6;
		 System.out.println("Mesa disponível(código): " + cod[i] + "-(" + lugares[i] + " lugares)");
		 
		}
		do{
		    
		System.out.println("Qual código de mesa escolhido");
		codM = sc.nextInt();

		for(int i = 0;i<numMesas;i++){

		if(codM == cod[i]){

		    System.out.println("Quantos lugares deseja reservar?");
		    int lgr = sc.nextInt();

		    if(lugares[i] >= 1 && lugares[i] <= 6){

		        lugares[i] = lugares[i] - lgr;
		        
		        }
		        else{
		    
		        System.out.println("Lugares esgotados na mesa " + cod[i]);
		        
		        }

		    for(int a =0;a<numMesas;a++){
		    System.out.println("Mesa disponível(código): " + cod[a] + "-(" + lugares[a] + " lugares)");
		    }

		}


		}
		System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
		System.out.println("Reservar mais mesas?");
		op = sc.nextInt();
		}while(op !=2);
		
		}
		
		
	}


