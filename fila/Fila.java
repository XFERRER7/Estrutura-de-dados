package fila;

public class Fila {
	
	private int maxTam;
	private int fim; 
	private Cliente vetor[];
	public Fila() {
		maxTam= 2;
	fim= 0;
	vetor= new Cliente[2];
	}
	public boolean filaVazia() {
		return fim== 0;
	}
	public boolean filaCheia() {
		return fim == maxTam;
	}
	public int getMaxTam() {
		return maxTam;
	}public boolean setMaxTam(int aux) {
		if(aux< 2) return  false;
		fim= 0;
		maxTam= aux;
		vetor= new Cliente[maxTam];
		return true;
	}
	public boolean enfileirar(Cliente aux) {
		if(filaCheia()) return false;
		vetor[fim] = aux;
		fim++;
		return true;
		}
	public Cliente desenfileirar() {
		if(filaVazia()) return null;
		Cliente aux= vetor[0];
		fim--;
		for(int i= 0; i< fim; i++) {
			vetor[i] = vetor[i+1];
			}vetor[fim] = null;
			return aux;
	}
	
	
	
	
	
	
	
}
