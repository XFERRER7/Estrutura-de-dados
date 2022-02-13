package fila;

public class Cliente {
	 
	 private String nome;
	 private int idade;
	 public String getNome() {
		 return nome;
	 }
	 public void setNome(String aux) 
	 {
		 nome= aux;
	 }
	 public int getIdade() {
		 return idade;
	 }
	 public boolean setIdade(int aux) {
		 if(aux<= 0) 
		 return false;
	     idade= aux;
	 
	     return true;
	 }
	 
	
	
	
	
	
	
	
	
}
