public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.insertFisrt(1);
        lista.insertFisrt(2);
        System.out.println(lista.first());
        System.out.println(lista.last());
        lista.insertLast(3);
        System.out.println(lista.last());

        //########## COM ARRAY 
        System.out.println("LISTA USANDO ARRAY -->");
        ListaArray ListaArray = new ListaArray();
        System.out.println("tamanho do array " + ListaArray.size());
        ListaArray.insertFirst(9);
        System.out.println("tamanho do array " + ListaArray.size());
        
        ListaArray.insertFirst(7);
        ListaArray.showArray();
        ListaArray.insertAfter(1, 46);
        ListaArray.showArray();
        ListaArray.insertFirst(42);
        ListaArray.showArray();
        ListaArray.insertBefore(2, 32);
        ListaArray.showArray();
    }
}