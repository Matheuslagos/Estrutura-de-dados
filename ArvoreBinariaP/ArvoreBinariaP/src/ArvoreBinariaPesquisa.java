import java.util.Iterator;

class ArvoreBinariaPesquisa {
    private No raiz;
    private Comparador comparador;
   
    public void setComparator(Comparador c) {
        this.comparador = c;
    }

    public Comparador getComparador() {
        return this.comparador;
    }
   
    public No getRaiz() {
        return this.raiz;
    }

   
    public void setRaiz(No p) {
        this.raiz = p;
    }

    public No pesquisar(No no, Object chave) {
        int comparacao = comparador.comparar(chave, no.getChave());
        if (comparacao == 0){
            return no;
        }
        else if(comparacao < 0){
            return pesquisar(no.getFilhoEsquerdo(),chave);
        }
        else{
            return pesquisar(no.getFilhoDireito(), chave);
        }
        
    }

   
    public No incluir(Object chave) {
        raiz = inserirRecursivo(raiz, chave);
        return raiz;
        
        
    }
    private No inserirRecursivo(No no, Object chave) {
        if (no == null) {
            return new No(chave);
        }

        int comparacao = comparador.comparar(chave, no.getChave());

        if (comparacao < 0) {
            no.setFilhoEsquerdo(inserirRecursivo(no.getFilhoEsquerdo(), chave));
            no.getFilhoEsquerdo().setPai(no);
        } else if (comparacao > 0) {
            no.setFilhoDireito(inserirRecursivo(no.getFilhoDireito(), chave));
            no.getFilhoDireito().setPai(no);
        }

        return no;
    }
   
    public Object remover(Object chave) {

        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    public void emOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'emOrdem'");
    }
  
    public void preOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'preOrdem'");
    }
  
    public void posOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'posOrdem'");
    }
 
    public int altura(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'altura'");
    }

   
    public int profundidade(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'profundidade'");
    }

   
    public void mostrar() {

        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

   
    public Iterator nos() {

        throw new UnsupportedOperationException("Unimplemented method 'nos'");
    }

   
    public Iterator elements() {

        throw new UnsupportedOperationException("Unimplemented method 'elements'");
    }

   
    public int size() {

        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

   
    public boolean isEmpty() {

        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
