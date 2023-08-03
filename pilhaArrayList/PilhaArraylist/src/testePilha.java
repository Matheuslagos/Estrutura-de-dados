
public class testePilha {
    public static void main(String[] args) throws Exception {
        pilhaVector p = new pilhaVector();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        p.push(4);
        p.push(4);
        p.push(4);
        p.push(4);
        p.push(4);
        p.push(4);

        while (!p.isEmpty()) {
            int elemento = (int) p.pop();
            System.out.println("desempilhei" + elemento);
        }

    }
}
