import java.util.Iterator;

class ArvoreBinariaPesquisa {
    private No raiz;
    private Comparador comparador;

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

        return no;
    }

    public Object remover(Object chave) {

        throw new UnsupportedOperationException("Unimplemented method 'remover'");
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
