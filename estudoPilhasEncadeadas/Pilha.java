package estudoPilhasEncadeadas;

public class Pilha {

	
		public class No {
			
			
		private Time dados;
		private No prox;
			
			
			public No(Time t) {
				
				
				this.dados = t;
				this.prox = null;
				
				
				
			}
			
		}
	
	
		private No topo;
		private int tam;
		
		public Pilha() {
			
			
			this.tam = 0;
			this.topo = null;
			
		}
		
		public void push(Time aux) {
			
			No no = new No(aux);
			
			no.prox = topo;
			
			topo = no;
			
			tam++;
			
		}
		
		public Time pop() {
			
			No no = topo;
			
			if(vazia()) return null;
			
			topo = no.prox;
			
			no.prox = null;
			
			tam--;
			
			Time ret = no.dados;
			
			no.dados = null;
			
			return ret;
			
		}
	
	
	
		public boolean vazia() {
			
			
			
			
			return topo == null;
			
		}
		
	
		public int getTam() {
		
		
		return tam;
		
		}
	
	    
	
	
}
