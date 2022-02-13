	package listaLinearEncadeada;


public class Lista {

public class No{
		
		private ItemCompra dados;
		private No prox;
		
		public No(ItemCompra ic) {
			
			this.dados = ic;
			this.prox = null;
			
		}
		
	    }
		
		private No primeiro;
		private int qtd;
		
		public void inserirInicio(ItemCompra aux) {
			
			No n1 = new No(aux);
			
			n1.prox = primeiro;
			
			primeiro = n1;
			
			qtd++;
					
		}
		
		public ItemCompra retirar(ItemCompra aux) {
			No ant = null;
			No no = primeiro;
			
			while(no != null && !no.dados.getDescricao().equals(aux.getDescricao())) {
				
				ant = no;
				no = no.prox;
				
			}
			
				if(no == null) return null;
				
				if(ant == null) {
					
					primeiro = no.prox;
					
				}
				else{
					
					ant.prox = no.prox;
					
				}
				
				ItemCompra ret = no.dados;
				
				qtd--;
				
				return ret;
				
		    }
				
		public ItemCompra buscar(ItemCompra aux) {
			
	        
			
			for(No no = primeiro;no != null;no = no.prox) {
            
			if(no.dados.getDescricao().equals(aux.getDescricao())) {
				
				return aux;
			}
			
			}
			return null;
			
		}
		
		public boolean vazia() {
			
			
			
			return primeiro ==null;
			
		}
		
	public int getQde() {
		
		
		
		return qtd;
		
	}
	
	public String getLista() {
		
		
		if(vazia()) System.out.println("A lista está vazia");
		
		String str = "Lista Encadeada: \n";
        for (No no = primeiro; no != null; no = no.prox)
            str = str +  " " + no.dados;
        return str + "\n";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
