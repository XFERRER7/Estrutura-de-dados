package listaDeExercicios;

public class Agenda {
	

		private int maxTam, ultimo;
		private Contato1[] vetor;
		public Agenda() {
			maxTam= ultimo = 0;
			vetor = null;
			}
		public int getMaxTam(){
			return maxTam;
			}
		public boolean setMaxTam(int aux)
		{if(aux< 2) return false;
		maxTam= aux;
		ultimo = 0;
		vetor = new Contato1[maxTam];
		return true;
		}
		public boolean listaVazia(){
			return ultimo == 0;
			}
		public boolean listaCheia(){
			return ultimo == maxTam;
			
		}
		
		public boolean setContato(Contato1 aux){
			if(listaCheia()) return false;
		    int pos = 0;
			while(pos<ultimo && aux.getTelefone() > vetor[pos].getTelefone()) pos++;
			if(pos== ultimo) { 
			vetor[ultimo] = aux;
				ultimo++;
				
				return true;
				} 
			for(int i = ultimo;i > pos;i--)
			{
				vetor[i] = vetor[i-1];
			}
			vetor[pos] = aux;
			ultimo++;
			return true;
			}
		
		    public Contato1 buscarContato(Contato1 aux){	
			if(listaVazia()) return null;
			int i = 0;
			while(i<ultimo && aux.getTelefone() != vetor[i].getTelefone()) i++;
			if(i == ultimo) return null;
			
			Contato1 ret = new Contato1(vetor[i].getNome(),vetor[i].getEmail(),vetor[i].getTelefone());
			return ret;
			}
		
		
		
	        public Contato1 excluirContato(Contato1 aux){
	        	if(listaVazia()) return null;
		
	        	int i = 0;
	        	while(i<ultimo && aux.getTelefone() != vetor[i].getTelefone()) i++;
	        	if(i == ultimo) return null;
		
	        	Contato1 ret = vetor[i];
	        	ultimo--;
	        	for(int j = i;j<ultimo;j++) vetor[j] = vetor[j+1];
	        	vetor[ultimo] = null;
	        	return ret;
		
	        }
	        
	        
	        public String getContato(){
	        	if(listaVazia()) return "Lista vazia!\n";
	        	String aux= "";
	        	for(int i=0; i<ultimo; i++)aux= aux+ vetor[i].getContato() + "\n";return aux;
	        	
	        
	        } 
		
	        
	        public void modificarContato(String novoNome,String novoEmail, long novoTel) {
	        	
	        	
	        	
	        	for(int i=0; i<ultimo; i++) {
	        		
	        		
	        		vetor[i].setNome(novoNome);
	        		vetor[i].setEmail(novoEmail);
	        		vetor[i].setTelefone(novoTel);
	        		
	        		
	        	}
	        	
	        	
	        	
	        }
	        
	        
	        
	        
	        
}
