
public class pilhaVector implements IPilhaVector {

    int elementos[];
    int topo;

    public pilhaVector() {
        elementos = new int[10];
        topo = -1;
    }

    @Override
    public Object top() throws PilhaVaziaException {
        return elementos[topo];

    }

    @Override
    public void push(Object o) {
        if (topo == elementos.length - 1) {
            int aux[] = new int[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
        topo++;
        elementos[topo] = (int) o;

    }

    @Override
    public Object pop() throws PilhaVaziaException {
        if (isEmpty()) {
            throw new PilhaVaziaException("Pilha Vazia");
        } else {
            Object o;
            o = elementos[topo];
            topo--;
            return o;
        }

    }

    @Override
    public int size() {
        return topo + 1;

    }

    public void empty() {
        if (isEmpty()) {
            while (!isEmpty()) {
                pop();
            }
        }
        else{
            throw new PilhaVaziaException("Pilha Vazia")
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

}
