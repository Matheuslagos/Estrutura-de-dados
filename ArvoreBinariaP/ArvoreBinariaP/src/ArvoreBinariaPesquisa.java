import java.util.Iterator;

/*CRIAR 2 ARRAYLIST PARA O ITERATOR */

class ArvoreBinariaPesquisa {
    private No raiz;
    private Comparador comparador;
    private int size;

    public ArvoreBinariaPesquisa(Comparador comparador) {
        this.comparador = comparador;
    }

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

    /** ----------------------------------------------------------- */
    public No pesquisar(Object chave) {
        return pesquisaRecursiva(raiz, chave);
    }

    private No pesquisaRecursiva(No no, Object chave) {
        if (no == null || chave == null) {
            return null;
        }

        int comparacao = comparador.comparar(chave, no.getChave());
        if (comparacao == 0) {
            return no;
        } else if (comparacao < 0) {
            return pesquisaRecursiva(no.getFilhoEsquerdo(), chave);
        } else {
            return pesquisaRecursiva(no.getFilhoDireito(), chave);
        }
    }

    public No incluir(Object chave) {
        raiz = incluirRecursivo(raiz, chave);
        return raiz;

    }

    private No incluirRecursivo(No no, Object chave) {
        if (no == null) {
            return new No(chave);
        }

        int comparacao = comparador.comparar(chave, no.getChave());

        if (comparacao < 0) {
            no.setFilhoEsquerdo(incluirRecursivo(no.getFilhoEsquerdo(), chave));
            no.getFilhoEsquerdo().setPai(no);
        } else if (comparacao > 0) {
            no.setFilhoDireito(incluirRecursivo(no.getFilhoDireito(), chave));
            no.getFilhoDireito().setPai(no);
        }
        size++;
        return no;
    }

    public Object remover(Object chave) {
        /** PARA REMOVER UM AVÔ COM 2 FILHOS EU VOU PARA O FILHO MENOR E FAÇO UM INORDER O PRIMEIRO NO VAI SER O SUBSTITUTO DO FILHO DO AVO, */
        size--;
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getFilhoEsquerdo());
            System.out.println(no.getChave());
            emOrdem(no.getFilhoDireito());
        }

    }

    public void preOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'preOrdem'");
    }

    public void posOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'posOrdem'");
    }

    public int altura(no.getRaiz) {
        int h=0;
        for()

    }

    public int profundidade(No no) {
        if(getRaiz()==no){
            return 0;
        }else{
            return 1+profundidade(no.getPai());
        }
    }

    public void mostrar() {

        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    public Iterator nos() {

        
    }

    public Iterator elements() {

        
    }

    public int size() {
        return size;        
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
