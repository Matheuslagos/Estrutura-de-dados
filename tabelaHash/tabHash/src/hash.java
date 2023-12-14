import java.util.Arrays;

class hash{

    int[] arrayHash;
    int capacidade = 13;
    int tamanho = 0;

    public hash(){
        arrayHash = new int[capacidade];
        Arrays.fill(arrayHash, -1);
    }

    // Função de dispersão (hash function)
    private int dispersao(int chave) {
        return chave % capacidade;
    }

    // Método para inserir um valor na tabela hash
    public void inserir(int valor) {
        if((double) tamanho/capacidade >= 0.5){
            capacidade = proximoPrimo(capacidade * 2);
            redimensionarArray();
        }

        int indice = dispersao(valor);
        //TRATANDO COLISAO COM SONDAGEM LINEAR
        while(arrayHash[indice] != -1){
            indice = (indice+1) % capacidade;
        }

        arrayHash[indice] = valor;
        tamanho++;
    }

    public boolean buscar(int valor) {
        int indice = dispersao(valor);

        // Sondagem linear para procurar o valor
        while (arrayHash[indice] != -1) {
            if (arrayHash[indice] == valor) {
                return true; // Valor encontrado
            }
            indice = (indice + 1) % capacidade; // Avança para a próxima posição
        }

        return false; // Valor não encontrado
    }

    public void remover(int valor) {
        int indice = dispersao(valor);

        // Sondagem linear para encontrar o valor a ser removido
        while (arrayHash[indice] != -1) {
            if (arrayHash[indice] == valor) {
                arrayHash[indice] = 0; // Substitui por 0 para indicar posição vazia
                tamanho--;
                return; // Valor removido
            }
            indice = (indice + 1) % capacidade; // Avança para a próxima posição
        }
    }

    private void redimensionarArray() {
        int[] novoArrayHash = new int[capacidade];
        Arrays.fill(novoArrayHash, -1);

        for (int valor : arrayHash) {
            if (valor != -1) {
                int novoIndice = dispersao(valor);

                // Sondagem linear para realocar valores
                while (novoArrayHash[novoIndice] != -1) {
                    novoIndice = (novoIndice + 1) % capacidade;
                }

                novoArrayHash[novoIndice] = valor;
            }
        }

        arrayHash = novoArrayHash;
    }

     // Método para encontrar o próximo número primo
     private int proximoPrimo(int numero) {
        while (!ePrimo(numero)) {
            numero++;
        }
        return numero;
    }

    private boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printArray() {
        System.out.println("Array da Tabela Hash:");
        for (int i = 0; i < capacidade; i++) {
            System.out.println("Índice " + i + ": " + arrayHash[i]);
        }
        System.out.println();
    }

    public int size(){
        return tamanho;
    }




}