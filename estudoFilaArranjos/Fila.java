package estudoFilaArranjos;

public class Fila {

	private int tam;
	private int fim;
	private Jogador vetor[];
	
	
	public Fila() {
		
		this.tam = 0;
		this.fim = 0;
		this.vetor = new Jogador[2];
		
	}
	
	
	public boolean enfileirar(Jogador aux) {
		
		if(cheia())return false;
		
		vetor[fim] = aux;
		
		fim++;
		
		return true;
		
	}
	
	public Jogador desenfileirar() {
		
		if(vazia()) return null;
		
		Jogador aux = vetor[0];
		
		fim--;
		
		for(int i = 0;i<fim;i++) {
			
			vetor[i] = vetor[i+1];
			
		}
		
		vetor[fim] = null;
		
		
		return aux;
		
	}
	
	public boolean vazia() {
		
		
		return fim == 0;
		
	}
	
	public boolean cheia() {
		
		
		return fim == tam;
		
	}


	public int getTam() {
		return tam;
	}


	public boolean setTam(int t) {
		
		
		if(t<2) return false;
		
		fim = 0;
		
		this.tam = t;
		
		this.vetor = new Jogador[tam];
		
		return true;
	}
	
	
	
	
	
	
	
	
}
