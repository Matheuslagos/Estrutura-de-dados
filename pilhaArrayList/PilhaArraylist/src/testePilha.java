
public class testePilha {
    public static void main(String[] args) throws Exception {
        pilhaVector pilhaVector = new pilhaVector();
        System.out.println("Hello, World!");

        for (int i = 0; i < 20; i++) {
            pilhaVector.push(12);
        }

        pilhaVector.top();

        System.out.println(pilhaVector.toString());
        pilhaVector.size();

    }
}
