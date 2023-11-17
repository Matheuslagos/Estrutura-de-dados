import java.util.Iterator;

class ArvoreBinariaPesquisa implements IArvoreBinariaPesquisa {
    private No raiz;

    @Override
    public void setComparator(Comparador c) {

        throw new UnsupportedOperationException("Unimplemented method 'setComparator'");
    }

    @Override
    public Comparador getComparador() {

        throw new UnsupportedOperationException("Unimplemented method 'getComparador'");
    }

    @Override
    public No pesquisar(No no, Object key) {

        throw new UnsupportedOperationException("Unimplemented method 'pesquisar'");
    }

    @Override
    public No incluir(Object key) {

        throw new UnsupportedOperationException("Unimplemented method 'incluir'");
    }

    @Override
    public Object remover(Object key) {

        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public No getRaiz() {
        return this.raiz;
    }

    @Override
    public void setRaiz(No p) {
        this.raiz = p;
    }

    @Override
    public void emOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'emOrdem'");
    }

    @Override
    public void preOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'preOrdem'");
    }

    @Override
    public void posOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'posOrdem'");
    }

    @Override
    public int altura(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'altura'");
    }

    @Override
    public int profundidade(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'profundidade'");
    }

    @Override
    public void mostrar() {

        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public Iterator nos() {

        throw new UnsupportedOperationException("Unimplemented method 'nos'");
    }

    @Override
    public Iterator elements() {

        throw new UnsupportedOperationException("Unimplemented method 'elements'");
    }

    @Override
    public int size() {

        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {

        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
