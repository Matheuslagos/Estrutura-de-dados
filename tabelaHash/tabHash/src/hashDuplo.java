import java.util.Arrays;
public class hashDuplo {
    

    private int[] arrayHash;
    private int capacidade = 13;
    private int tamanho = 0;

    public hashDuplo() {
        arrayHash = new int[capacidade];
        Arrays.fill(arrayHash, -1); // Inicializa o array com -1 (indicando posição vazia)
    }

    // Função de dispersão primária (hash function)
    private int dispersao(int chave) {
        return chave % capacidade;
    }

    // Função de dispersão secundária para hash duplo
    private int segundaDispersao(int chave) {
        // Pode ser uma função simples, como por exemplo um número primo menor que a capacidade da tabela
        return 7 - (chave % 7);
    }

    // Método para inserir um valor na tabela hash com hash duplo
    public void inserir(int valor) {
        if ((double) tamanho / capacidade >= 0.5) {
            capacidade = proximoPrimo(capacidade * 2);
            redimensionarArray();
        }

        int indice = dispersao(valor);

        // Hash duplo
        int passo = segundaDispersao(valor);
        int tentativa = 0;

        while (arrayHash[indice] != -1) {
            indice = (indice + tentativa * passo) % capacidade;
            tentativa++;
        }

        arrayHash[indice] = valor;
        tamanho++;
    }

    // Método para buscar um valor na tabela hash
    public boolean buscar(int valor) {
        int indice = dispersao(valor);
        int passo = segundaDispersao(valor);
        int tentativa = 0;

        while (arrayHash[indice] != -1) {
            if (arrayHash[indice] == valor) {
                return true; // Valor encontrado
            }
            indice = (indice + tentativa * passo) % capacidade;
            tentativa++;
        }

        return false; // Valor não encontrado
    }

    // Método para remover um valor da tabela hash
    public void remover(int valor) {
        int indice = dispersao(valor);
        int passo = segundaDispersao(valor);
        int tentativa = 0;

        while (arrayHash[indice] != -1) {
            if (arrayHash[indice] == valor) {
                arrayHash[indice] = 0; // Substitui por 0 para indicar posição vazia
                tamanho--;
                return; // Valor removido
            }
            indice = (indice + tentativa * passo) % capacidade;
            tentativa++;
        }
    }

    // Método para redimensionar o array quando necessário
    private void redimensionarArray() {
        int[] novoArrayHash = new int[capacidade];
        Arrays.fill(novoArrayHash, -1);

        for (int valor : arrayHash) {
            if (valor != -1) {
                int novoIndice = dispersao(valor);

                // Hash duplo para realocar valores
                int passo = segundaDispersao(valor);
                int tentativa = 0;

                while (novoArrayHash[novoIndice] != -1) {
                    novoIndice = (novoIndice + tentativa * passo) % capacidade;
                    tentativa++;
                }

                novoArrayHash[novoIndice] = valor;
            }
        }

        arrayHash = novoArrayHash;
    }

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

    // Método para imprimir o array
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
