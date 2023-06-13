
public interface Pilha {

    public int sizePreta();

    public int sizeVermelha();

    public boolean isEmptyPreta();

    public boolean isEmptyVermelha();

    public Object topPreta() throws PilhaVaziaExcecao;

    public Object topVermelha() throws PilhaVaziaExcecao;

    public void pushPreta(Object o);

    public void pushVermelha(Object o);

    public Object popPreta() throws PilhaVaziaExcecao;

    public Object popVermelha() throws PilhaVaziaExcecao;
}
