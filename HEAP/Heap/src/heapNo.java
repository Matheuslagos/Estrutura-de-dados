public class heapNo{
    private No raiz;
    private int tamanho;

    public heap(){
        this.raiz=null;
        this.tamanho=0;
        
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public int size(){
        return tamanho;
    }

    public void inserir(Object chave){
        No novoNo = new No(chave);
        if (isEmpty()){
            raiz = novoNo;

        }else{
            inserirRecursivo(raiz, novoNo);
        }
        tamanho++;
    }
    private void inserirRecursivo(No atual,No novoNo){
        if(atual.getFilhoEsquerdo() == null){
            atual.setFilhoEsquerdo(novoNo);
            novoNo.setPai(atual);
            subirNo(novoNo);
        }else if(atual.getFilhoDireito() == null){
            atual.setFilhoDireito(novoNo);
            novoNo.setPai(atual);
            subirNo(novoNo);
        }else{
            // Se ambos os filhos estão presentes, escolha o caminho com o menor tamanho
            if(atual.getFilhoEsquerdo().getFilhoEsquerdo()==null || atual.getFilhoEsquerdo().getFilhoDireito() == null){
                inserirRecursivo(atual.getFilhoEsquerdo(), novoNo);
            }else{
                inserirRecursivo(atual.getFilhoDireito(), novoNo);
            }
        }

    }
    private void subirNo(No no){
        No pai = no.getPai();
        while ((pai != null && (Integer) pai.getChave() > (Integer) no.getChave())) {
            Object temp = pai.getChave();
            pai.setChave(no.getChave());
            no.setChave(temp);
            no = pai;
            pai = no.getPai();
        }


    }





}
