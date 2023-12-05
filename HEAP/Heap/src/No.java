public class No{

    private No filhoDireito;
    private No filhoEsquerdo;
    private No pai;
    private Object chave;

    // Construtor
    public No(Object chave) {
        this.chave = chave;
        this.filhoDireito = null;
        this.filhoEsquerdo = null;
        this.pai = null;
    }
    
    public No getFilhoDireito() {
        return this.filhoDireito;
    }

    
    public No getFilhoEsquerdo() {
        return this.filhoEsquerdo;
    }

    
    public No getPai() {
        return this.pai;
    }

    
    public Object getChave() {
        return this.chave;
    }

    
    public void setFilhoDireito(No filhodireito) {
        this.filhoDireito = filhodireito;
    }

    
    public void setFilhoEsquerdo(No filhoesquerdo) {
        this.filhoEsquerdo = filhoesquerdo;
    }

    
    public void setPai(No pai) {
        this.pai = pai;
    }

    
    public void setChave(Object chave) {
        this.chave = chave;
    }
}
