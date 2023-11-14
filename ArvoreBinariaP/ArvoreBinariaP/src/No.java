public class No implements Ino {

    private Ino filhoDireito;
    private Ino filhoEsquerdo;
    private Ino pai;
    private Object chave;

    // Construtor
    public No(Object chave) {
        this.chave = chave;
        this.filhoDireito = null;
        this.filhoEsquerdo = null;
        this.pai = null;
    }

    // Métodos da interface Ino
    @Override
    public Ino getFilhoDireito() {
        return this.filhoDireito;
    }

    @Override
    public Ino getFilhoEsquerdo() {
        return this.filhoEsquerdo;
    }

    @Override
    public Ino getPai() {
        return this.pai;
    }

    @Override
    public Object getChave() {
        return this.chave;
    }

    @Override
    public void setFilhoDireito(No fD) {
        this.filhoDireito = fD;
    }

    @Override
    public void setFilhoEsquerdo(No fE) {
        this.filhoEsquerdo = fE;
    }

    @Override
    public void setPai(Ino pai) {
        this.pai = pai;
    }

    @Override
    public void setChave(Object ch) {
        this.chave = ch;
    }
}
