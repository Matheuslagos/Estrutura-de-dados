public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa(new Comparador());
        abp.incluir(10);
        abp.incluir(5);
        abp.incluir(15);
        abp.incluir(44);
        abp.incluir(2);
        abp.incluir(7);
        abp.incluir(12);
        abp.incluir(20);
        abp.incluir(1);

        abp.mostrar();
        System.out.println("Removendo 5");
        abp.remover(5);
        abp.mostrar();

        System.out.println(abp.altura(abp.getRaiz()));

        System.out.println(abp.profundidade(abp.getRaiz()));

        System.out.println("Em ordem");
        abp.emOrdem(abp.getRaiz());
        System.out.println("Pré ordem");
        abp.preOrdem();
        System.out.println("Pós ordem");
        abp.posOrdem();
        System.out.println("Tamanho");
        System.out.println(abp.size());
    }
}
