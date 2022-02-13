package arvoreBinaria;

public class Abp{

    public class No{

        private No pai;
        private No fe;
        private No fd;
        private Item dados;
        
        public No(Item d){

            this.dados = d;

        }

    }

    private No raiz;
    private int qde;



    //------------CONSTRUTOR-------------------

    public Abp(){

        this.raiz = null;
        this.qde = 0;

    }



    //---------------VAZIA E TAMANHO------------------------

    private boolean vazia(){




        return raiz == null;
    }





    public int getTamanho(){


        return qde;
    }


    //------------------------INSERIR E REMOVER----------------------------------

    public boolean inserir(Item obj){

        
        No aux = new No(obj);
        No atual = raiz;
        No ant = raiz;

        if(vazia()){
            this.raiz = aux;
            return true;

        }

        while(atual != null){

            if(obj.getNome().compareTo(atual.dados.getNome()) < 0 ){
                
                ant = atual;
                atual = atual.fe;

            }
            else{

                if(obj.getNome().compareTo(atual.dados.getNome()) > 0){

                    ant = atual;
                    atual = atual.fd;

                }

                else return false;

            }

        }
            
        aux.pai = ant;

            
        if(obj.getNome().compareTo(ant.dados.getNome()) < 0 ){

            ant.fe = aux;

            
        }
        
        else{

            ant.fd = aux;

        }

        return true;

    }





    public Item remover(Item obj){

        Item aux = null;

        No z = consultar(obj);

        if(z != null){

            aux = z.dados;
            No y = null;

            No x = null;

            if(z.fd == null || z.fe == null){
                y = z;
            }

            else{
                y = sucessor(z);
            }

            if(y.fe!=null){
                x=y.fe;
            }
            else{
                x=y.fd;
            }
            if(x!=null){
                x.pai=y.pai;
            }
            if(y.pai==null){
                raiz=x;
                if(x!=null){
                    x.pai=null;
                }  
            }
            else{
                if(y==y.pai.fe){
                    y.pai.fe=x;
                }
                else{
                    y.pai.fd=x;
                }
            }
            if(y!=z){
                z.dados=y.dados;
            }
            qde--;
        }
        return aux;
    
    }




    //------------------------PESQUISAR E CONSULTAR--------------------------------------

    public Item pesquisar(Item obj){

        No aux = consultar(obj);

        if(aux == null){

            return null;

        }

        return (new Item(aux.dados.getNome(),aux.dados.getFone()));

    }





    public No consultar(Item obj){


        No atual = raiz;

        while(atual != null){

            if(obj.getNome().compareTo(atual.dados.getNome()) < 0){

                atual = atual.fe;

            }
            else{

                if(obj.getNome().compareTo(atual.dados.getNome()) > 0){

                atual = atual.fd;

                }

                else return atual;

            }

        }

        return null;

    }



    //------------------------MAXIMO,MINIMO,ANTECESSOR E SUCESSOR---------------------------------

    private No maximo(No obj){

        if(obj == null) return null;

        No atual = obj;

        while(atual.fd != null){

            atual = atual.fd;

        }



        return atual;
    }





    private No minimo(No obj){

        if(obj == null) return null;

        No atual = obj;

        while(atual.fe != null){

            atual = atual.fe;  

        }



        return atual;
    }





    private No antecessor(No obj){

        if(obj == null) return null;

        if(obj.fe != null) return (maximo(obj.fe));

        No atual = obj.pai;
        No ant = obj;

        while(atual != null && ant.fe == null){

        ant = atual;
        atual = atual.pai;

        }

        return atual;
    
    }





    private No sucessor(No obj){

        if(obj == null) return null;

        if(obj.fd != null) return (minimo(obj.fd));

        No atual = obj.pai;
        No ant = obj;

        while(atual != null && ant == atual.fd){

            ant = atual;
            atual = atual.pai;

        }


        return atual;
    
    }

    

    



    //-----------------------VISITA EM ORDEM-------------------------------------
    public void visitaEmOrderm(StringBuffer aux){

        if(vazia()) aux.append("Árvore vazia");

        
        else{
            visitaEmOrdem(aux,this.raiz);
        }



    }

    private void visitaEmOrdem(StringBuffer aux,No obj){

        if(obj != null){

            visitaEmOrdem(aux, obj.fe);
            aux.append(obj.dados.toString());
            visitaEmOrdem(aux, obj.fd);

        }

    }


    //-----------------------VISITA PÓS ORDEM-------------------------------------
    

    public void visitaPosOrderm(StringBuffer aux){

        if(vazia()) aux.append("Árvore vazia");

        
        else{
            visitaPosOrdem(aux,this.raiz);
        }
        
    }

    private void visitaPosOrdem(StringBuffer aux,No obj){

        if(obj != null){

            visitaPosOrdem(aux, obj.fe);
            visitaPosOrdem(aux, obj.fd);
            aux.append(obj.dados.toString());


        }

    }


    //-----------------------VISITA PRÉ ORDEM-------------------------------------


    public void visitaPreOrdem(StringBuffer aux){

        if(vazia()) aux.append("Árvore vazia");

        
        else{
            visitaPreOrdem(aux,this.raiz);
        }

        
    }

    private void visitaPreOrdem(StringBuffer aux,No obj){

        if(obj != null){

            aux.append(obj.dados.toString());
            visitaPreOrdem(aux,obj.fe);
            visitaPreOrdem(aux,obj.fd);

        }


    }



    //-----------------------TESTA INTEGRIDADE-------------------------------------

    public void testaIntegridade(StringBuffer aux){

        if(vazia()) aux.append("Árvore vazia");

        else{
            testaIntegridade(aux,this.raiz);
        }

    }

    private void testaIntegridade(StringBuffer aux,No obj){

        if(obj == null) return;

        if(obj.fe != null){

            if(obj.dados.getNome().compareTo(obj.fe.dados.getNome())<0){

                aux.append("Erro!!! Pai menor que filho da esquerda.\n");
                aux.append("Pai --> "+obj.dados.getNome()+"\n");
                aux.append("Filho da esquerda --> "+obj.fe.dados.getNome()+"\n");

            }

            if(obj.fd!=null){if(obj.dados.getNome().compareTo(obj.fd.dados.getNome())>0)
                {

                    aux.append("Erro!!! Pai maior que filho da direita.\n");
                    aux.append("Pai --> "+obj.dados.getNome()+"\n");
                    aux.append("Filho da direita --> "+obj.fd.dados.getNome()+"\n");
                    
                }

            }

            testaIntegridade(aux,obj.fe);
            testaIntegridade(aux,obj.fd);

        }


    }
    
}

