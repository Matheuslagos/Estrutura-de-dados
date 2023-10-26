
public class Lista {

    private No inicio;
    private No fim;
    private int size;

    public Lista() {
        inicio = new No(null, null, null);
        this.fim = new No(inicio, null, null);
        inicio.setProximo(fim);
        this.size = 0;
    }

    public int Size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object first() {
        if (isEmpty()) {
            return null;
        }
        return inicio.getProximo().getElemento();
    }

    public Object last() {
        if (isEmpty()) {
            return null;
        }
        return fim.getAnterior().getElemento();
    }

    public boolean isFirst(No no) {
        return inicio.getProximo() == no;
    }

    public boolean isLast(No no) {
        return fim.getAnterior() == no;
    }

    public void insertFisrt(Object elemento) {
        insertAfter(inicio, elemento);

    }

    public void insertLast(Object elemento) {
        insertBefore(fim, elemento);

    }

    public No insertAfter(No anterior, Object elemento) {
        No novo = new No(anterior, elemento, anterior.getProximo());
        novo.setElemento(elemento);
        novo.setAnterior(anterior);
        novo.setProximo(anterior.getProximo());

        anterior.getProximo().setAnterior(novo);
        anterior.setProximo(novo);

        size++;
        return novo;

    }

    public No insertBefore(No proximo, Object elemento) {
        No novo = new No(proximo.getAnterior(), elemento, proximo);
        novo.setElemento(elemento);
        novo.setAnterior(proximo.getAnterior());
        novo.setProximo(proximo);

        proximo.getAnterior().setProximo(novo);
        proximo.setAnterior(novo);

        size++;
        return novo;

    }
}