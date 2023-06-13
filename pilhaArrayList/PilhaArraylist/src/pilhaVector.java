import java.util.*;

public class pilhaVector implements IPilhaVector {

    ArrayList<Object> pilha = new ArrayList<>();

    public Object top() throws PilhaVaziaException {
        return pilha.get(0);
    }

    public void push(Object o) {
        pilha.add(o);
    }

    public Object pop() throws PilhaVaziaException {
        return pilha.remove(0);
    }

    public int size() {
        return pilha.size();

    }

}
