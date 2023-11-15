
public interface Ino {

	Ino getFilhoDireito();

	Ino getFilhoEsquerdo();

	Ino getPai();

	Object getChave();

	void setFilhoDireito(No fD);

	void setFilhoEsquerdo(No fE);

	void setPai(Ino pai);

	void setChave(Object ch);

}