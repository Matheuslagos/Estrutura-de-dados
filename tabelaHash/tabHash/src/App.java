public class App {
    public static void main(String[] args) throws Exception {
        hash tabela = new hash();
        hashDuplo tabelaDupla = new hashDuplo();

       
        tabela.inserir(5);
        tabela.inserir(18);
        tabela.inserir(3);
        tabela.inserir(123);
        
        

        
        System.out.println(tabela.buscar(5));
        System.out.println(tabela.buscar(10));
        System.out.println(tabela.buscar(123));

        tabela.printArray();

        System.out.println(tabela.size());
        

        tabelaDupla.inserir(5);
        tabelaDupla.inserir(18);
        tabelaDupla.inserir(3);
        tabelaDupla.inserir(123);
        
        

        
        System.out.println(tabelaDupla.buscar(5));
        System.out.println(tabelaDupla.buscar(10));
        System.out.println(tabelaDupla.buscar(123));

        tabelaDupla.printArray();

        System.out.println(tabelaDupla.size());
    }
}
