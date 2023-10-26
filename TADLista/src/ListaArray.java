public class ListaArray {

    private int size;
    private static final int capacidade = 10;
    private Object[] array;

    public ListaArray() {
        array = new Object[capacidade];
        size = 0;
    }

    // METODOS GENERICOS
    public Object size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // METODOS DE FILA#######
    public boolean isFirst(Object elemento) {
        if (isEmpty()) {
            return false;
        }
        return array[0].equals(elemento); // use equals() to compare an Object with another Object
    }

    public boolean isLast(Object elemento) {
        if (isEmpty()) {
            return false;
        }
        return array[size - 1] == elemento;
    }

    // METODOS DE ACESSO########
    public Object first() throws ArrayVazioException {
        if (isEmpty()) {
            throw new ArrayVazioException("Lista vazia");
        }
        return array[0];
    }

    public Object last() throws ArrayVazioException {
        if (isEmpty()) {
            throw new ArrayVazioException("Lista vazia");
        }
        return array[size - 1];
    }

    public Object before(Object elemento) {
        for (int indice = 1; indice < size; indice++) {
            if (array[indice].equals(elemento)) {
                return array[indice - 1];
            }
        }
        return null;
    }

    public Object after(Object elemento) {
        for (int indice = 0; indice < size; indice++) {
            if (array[indice].equals(elemento)) {
                return array[indice + 1];
            }
        }
        return null;
    }

    // METODOS PARA ATUALIZAR########
    public Object replaceElement(int indice, Object elemento) {
        if (isEmpty() || indice > size) {
            throw new IndexOutOfBoundsException("fora dos limites");
        }
        Object temp = array[indice];
        array[indice] = elemento;
        return temp;

    }

    public void swapElements(int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= array.length || indice2 < 0 || indice2 >= array.length) {
            throw new IndexOutOfBoundsException("Índice fora dos limites.");
        }
        Object temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }

    public int insertBefore(int elemento, int novoElemento) {
        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == elemento) {
                array[i] = novoElemento;
                break;
            }
        }

    }

    public int insertAfter(int elemento, int novoElemento) {
        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == elemento) {
                array[i] = novoElemento;
                break;
            }
        }
    }

    public void insertFirst(Object novoElemento) {
        if (size == 0) {
            array[0] = novoElemento;
        } else {
            for (int i = size; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = novoElemento;
        }
        size++;
    }

    public void insertLast(Object novoElemento) {
        if (size < array.length) {
            array[size] = novoElemento;
            size++;
        } else {
            resizeArray();
            array[size] = novoElemento;
            size++;
        }
    }

    public int remove(int elemento) {
        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == elemento) {
                array[i] = null;
                break;
            }
        }
    }

    // private void resizeArray() {
    // int newCapacity = array.length * 2;
    // Object[] newArray = new Object[newCapacity];
    //
    // for (int i = 0; i < size; i++) {
    // newArray[i] = array[i];
    // }

    // array = newArray;
    // }

}
