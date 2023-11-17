public class Comparador {

    public int comparar(Object obj1, Object obj2) {
        int chave1 = converterParaInt(obj1);
        int chave2 = converterParaInt(obj2);

        if (chave1 > chave2) {
            return 1;
        } else if (chave1 < chave2) {
            return -1;
        } else {
            return 0;
        }
    }

    private int converterParaInt(Object obj) {
        if (obj instanceof Integer) {
            return (int) obj;
        } else {
            
            throw new IllegalArgumentException("A chave não é um Integer.");
        }
    }
}
