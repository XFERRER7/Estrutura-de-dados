package arvoreBinaria;

public class Item {


    private String nome;
    private String fone;

    public Item(String n,String f){

        this.nome = n;
        this.fone = f;

    }

    public String getNome(){

        return nome;
    }

    public String getFone(){

        return fone;
    }

    @Override
    public String toString() {
        return "Item [fone = " + fone + ", nome = " + nome + "]";
    }

    

}