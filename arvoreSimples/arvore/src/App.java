import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        ArvoreSimples arvoresimples = new ArvoreSimples(2);
        arvoresimples.addChild(1);
        arvoresimples.addChild(2);
        arvoresimples.addChild(3);
        arvoresimples.addChild(4);

        Iterator Childs = arvoresimples.children(arvoresimples.root());
        while (Childs.hasNext()) {
            ArvoreSimples.No x = (ArvoreSimples.No) Childs.next();
            int y = (int) x.element();
            System.out.println(y);
        }
        System.out.println(arvoresimples.root().element());

    }
}
