public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.insertFisrt(1);
        lista.insertFisrt(2);
        System.out.println(lista.first());
        System.out.println(lista.last());
        lista.insertLast(3);
        System.out.println(lista.last());
    }
}
