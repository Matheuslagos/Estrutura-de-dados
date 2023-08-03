
public interface Ino {

	Ino getFilhoDireito();

	Ino getFilhoEsquerdo();

	Ino getPai();

	Object getChave();

	void setFilhoDireito(no fD);

	void setFilhoEsquerdo(no fE);

	void setPai(Ino pai);

	void setChave(Object ch);

}