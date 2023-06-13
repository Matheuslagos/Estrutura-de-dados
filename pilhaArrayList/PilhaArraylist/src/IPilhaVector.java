public interface IPilhaVector {
    Object top() throws PilhaVaziaException;

    void push(Object o);

    Object pop() throws PilhaVaziaException;

    int size();
}
