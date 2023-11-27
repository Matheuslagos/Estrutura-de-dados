import java.util.Iterator;
public class App {
    
    public static void main(String[] args) throws Exception {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa(new Comparador());
        abp.incluir(10);
        abp.incluir(5);
        abp.incluir(15);
        abp.incluir(4);
        abp.incluir(6);
        abp.incluir(16);
        abp.incluir(14);
        abp.incluir(13);
        abp.incluir(12);
        
        System.out.println("Profundidade: "+ abp.profundidade(abp.pesquisar(15)));
        
        
        System.out.println(abp.altura(abp.pesquisar(10)));
        System.out.println(abp.altura(abp.pesquisar(5)));
        System.out.println(abp.altura(abp.pesquisar(15)));
        System.out.println(abp.altura(abp.pesquisar(4)));
        System.out.println(abp.altura(abp.pesquisar(6)));

        /*System.out.println("Profundidade: "+ abp.profundidade(abp.pesquisar(4)));
        
        No noPesquisa = abp.pesquisar(6);
        if (noPesquisa != null) {
            System.out.println("Encontrou o nó com chave " + noPesquisa.getChave());
        }
        if (noPesquisa == null) {
            System.out.println("Não encontrou o nó com chave");
        }*/
        /*abp.emOrdem(abp.getRaiz());*/
        abp.mostrar();
        Iterator<No> iteratorNos = abp.nos();
        while (iteratorNos.hasNext()) {
        No no = iteratorNos.next();
        System.out.println("Chave do nó: " + no.getChave());
        }

        // Obter um iterador sobre os valores da árvore
        Iterator<Object> iteratorElementos = abp.elements();
        while (iteratorElementos.hasNext()) {
        Object elemento = iteratorElementos.next();
        System.out.println("Elemento da árvore: " + elemento);
        }
    }
}
