package arvoreBinaria;

import java.util.Scanner;

public class Base {


    private static Scanner sc = new Scanner(System.in);
    private static Item criaItem(){

        String nome;
        String fone;

        sc.skip("\\R");
        System.out.println("Informe o nome");
        nome = sc.nextLine();

        System.out.println("Informe o fone");
        fone = sc.nextLine();

        Item aux = new Item(nome,fone);
        
        return aux;

    }

    public static void main(String[] args) {
        
        Abp arvore = new Abp();
        Item aux = null;
        int op = 0;
        StringBuffer sb = new StringBuffer();

        do{

            System.out.println("Escolha uma das opções");
            System.out.println("1-Inserir");
            System.out.println("2-Remover");
            System.out.println("3-Pesquisar");
            System.out.println("4-consultar");
            System.out.println("5-Visita em ordem");
            System.out.println("6-Visita pré ordem");
            System.out.println("7-Visita pós ordem");
            System.out.println("8-Testa integridade");
            System.out.println("9-Encerrar programa");
            op = sc.nextInt();

            switch(op){           


                case 1:

                aux = criaItem();
                arvore.inserir(aux);
                aux = null;
                
                
                break;

               case 2:

                aux = criaItem();
                if(aux == null) System.out.println("Item não existe na árvore");
                else{
                arvore.remover(aux);
                }
                aux = null;

                break;
                


                case 3:

                aux = criaItem();
                arvore.pesquisar(aux);
                aux = null;

                break;



                case 4:

                aux = criaItem();
                System.out.println(arvore.consultar(aux));
                aux = null;

                break;
                


                case 5:
                
                aux = criaItem();
                arvore.visitaEmOrderm(sb.append(aux));

                break;



                case 6:

                aux = criaItem();
                arvore.visitaPreOrdem(sb.append(aux));

                break;
                


                case 7:

                aux = criaItem();
                arvore.visitaPosOrderm(sb.append(aux));

                break;



                case 8:

                aux = criaItem();
                arvore.testaIntegridade(sb.append(aux));

                break;
                


                default:
                
                System.out.println("Número inválido");


            }

        }while(op != 9);











    }
}