import java.util.Iterator;

/*CRIAR 2 ARRAYLIST PARA O ITERATOR */

class ArvoreBinariaPesquisa {
    private No raiz;
    private Comparador comparador;
    private int size;

    public ArvoreBinariaPesquisa(Comparador comparador) {
        this.comparador = comparador;
    }

    public void setComparator(Comparador c) {
        this.comparador = c;
    }

    public Comparador getComparador() {
        return this.comparador;
    }

    public No getRaiz() {
        return this.raiz;
    }

    public void setRaiz(No p) {
        this.raiz = p;
    }

    /** ----------------------------------------------------------- */
    public No pesquisar(Object chave) {
        return pesquisaRecursiva(raiz, chave);
    }

    private No pesquisaRecursiva(No no, Object chave) {
        if (no == null || chave == null) {
            return null;
        }

        int comparacao = comparador.comparar(chave, no.getChave());
        if (comparacao == 0) {
            return no;
        } else if (comparacao < 0) {
            return pesquisaRecursiva(no.getFilhoEsquerdo(), chave);
        } else {
            return pesquisaRecursiva(no.getFilhoDireito(), chave);
        }
    }

    public No incluir(Object chave) {
        raiz = incluirRecursivo(raiz, chave);
        return raiz;

    }

    private No incluirRecursivo(No no, Object chave) {
        if (no == null) {
            return new No(chave);
        }

        int comparacao = comparador.comparar(chave, no.getChave());

        if (comparacao < 0) {
            no.setFilhoEsquerdo(incluirRecursivo(no.getFilhoEsquerdo(), chave));
            no.getFilhoEsquerdo().setPai(no);
        } else if (comparacao > 0) {
            no.setFilhoDireito(incluirRecursivo(no.getFilhoDireito(), chave));
            no.getFilhoDireito().setPai(no);
        }
        size++;
        return no;
    }

    public Object remover(Object chave) {
    raiz = removerRecursivo(raiz, chave);
    return chave;
}

private No removerRecursivo(No no, Object chave) {
    if (no == null) {
        return null; // Chave não encontrada, nada a fazer
    }

    int comparacao = comparador.comparar(chave, no.getChave());

    if (comparacao < 0) {
        no.setFilhoEsquerdo(removerRecursivo(no.getFilhoEsquerdo(), chave));
    } else if (comparacao > 0) {
        no.setFilhoDireito(removerRecursivo(no.getFilhoDireito(), chave));
    } else {
        // Caso 1 e 2: Nó a ser removido encontrado
        if (no.getFilhoEsquerdo() == null) {
            size--;
            return no.getFilhoDireito();
        } else if (no.getFilhoDireito() == null) {
            size--;
            return no.getFilhoEsquerdo();
        }

        // Caso 3: Nó a ser removido tem dois filhos
        no.setChave(encontrarMenorChave(no.getFilhoDireito()));
        no.setFilhoDireito(removerRecursivo(no.getFilhoDireito(), no.getChave()));
    }

    return no;
}

private Object encontrarMenorChave(No no) {
    return (no.getFilhoEsquerdo() == null) ? no.getChave() : encontrarMenorChave(no.getFilhoEsquerdo());
}

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getFilhoEsquerdo());
            System.out.println(no.getChave());
            emOrdem(no.getFilhoDireito());
        }

    }

    public void preOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'preOrdem'");
    }

    public void posOrdem(No no) {

        throw new UnsupportedOperationException("Unimplemented method 'posOrdem'");
    }

    public int altura(No no) {
    if (no == null) {
        return 0;
    } else {
        int alturaEsquerda = altura(no.getFilhoEsquerdo());
        int alturaDireita = altura(no.getFilhoDireito());
        return Math.max(alturaEsquerda, alturaDireita) + 1;
        }
    }

    public int profundidade(No no) {
        if(getRaiz()==no){
            return 0;
        }else{
            return 1+profundidade(no.getPai());
        }
    }

    public void mostrar() {
    if (raiz == null) {
        System.out.println("A árvore está vazia.");
        return;
    }

    int altura = altura(raiz);
    int largura = (int) Math.pow(2, altura) - 1;

    // Inicializar matriz para armazenar os valores dos nós
    String[][] matriz = new String[altura][largura];
    for (String[] linha : matriz) {
        Arrays.fill(linha, "    ");
    }

    // Preencher a matriz com os valores dos nós
    preencherMatriz(matriz, raiz, 0, 0, largura / 2);

    // Imprimir a matriz
    for (String[] linha : matriz) {
        for (String valor : linha) {
            System.out.print(valor);
        }
        System.out.println();
    }
}

private void preencherMatriz(String[][] matriz, No no, int nivel, int inicio, int fim) {
    if (no != null) {
        int meio = (inicio + fim) / 2;
        matriz[nivel][meio] = String.valueOf(no.getChave());
        preencherMatriz(matriz, no.getFilhoEsquerdo(), nivel + 1, inicio, meio - 1);
        preencherMatriz(matriz, no.getFilhoDireito(), nivel + 1, meio + 1, fim);
    }
}

    public Iterator nos() {
        ArrayList<No> listaNos = new ArrayList<>();
        coletarNos(raiz, listaNos);
        return listaNos.iterator();
        
    }
    private void coletarNos(No no, ArrayList<No> listaNos) {
        if (no != null) {
            coletarNos(no.getFilhoEsquerdo(), listaNos);
            listaNos.add(no);
            coletarNos(no.getFilhoDireito(), listaNos);
        }
    }


   public Iterator<Object> elements() {
        ArrayList<Object> listaElementos = new ArrayList<>();
        coletarElementos(raiz, listaElementos);
        return listaElementos.iterator();
    }

    private void coletarElementos(No no, ArrayList<Object> listaElementos) {
        if (no != null) {
            coletarElementos(no.getFilhoEsquerdo(), listaElementos);
            listaElementos.add(no.getChave());
            coletarElementos(no.getFilhoDireito(), listaElementos);
        }
    }

    public int size() {
        return size;        
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
