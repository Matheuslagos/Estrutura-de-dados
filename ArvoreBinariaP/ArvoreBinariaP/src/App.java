public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa(new Comparador());
        abp.incluir(10);
        abp.incluir(5);
        abp.incluir(15);
        abp.emOrdem(abp.getRaiz());
        No noPesquisa = abp.pesquisar(7);
        if (noPesquisa != null) {
            System.out.println("Encontrou o nó com chave " + noPesquisa.getChave());
        }
        if (noPesquisa == null) {
            System.out.println("Não encontrou o nó com chave");
        }
    }
}
