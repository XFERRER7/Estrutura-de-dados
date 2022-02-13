package estudoPilhaArranjos;

public class Pilha {

	
	
	private int tam, topo;
	private Aluno vetor[];
	
	
	public int getTam() {
		return tam;
	}
	
	public boolean setTam(int t) {
		if(t<2) return false;
		
		topo = 0;
		
		tam = t;
		
		vetor = new Aluno[tam];
		
		return true;
		
	}

	public Pilha() {
		
		tam = 2;
		topo = 0;
		vetor = new Aluno[2];
	}
	public boolean pilhaCheia() {
		
		
		
		return topo == tam;
	}
	
	public boolean pilhaVazia() {
		
		
		
		return topo == 0;
	}
	
	
	public boolean push(Aluno aux) {
		
		if(pilhaCheia())return false;
		
		vetor[topo] = aux;
		
		topo++;
		
		return true;
		
	}
	
	public Aluno pop() {
		
		
		if(pilhaVazia()) return null;
		
		topo--;
		
		Aluno aux = vetor[topo];
		
		vetor[topo] = null;
		
		return aux;
		
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
