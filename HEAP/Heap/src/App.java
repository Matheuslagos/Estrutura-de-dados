import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayHeap heap = new ArrayHeap(2, 2);
        heap.insert(1, 1);
        heap.insert(2, 2);
        heap.insert(3, 3);

        heap.remove(2);
        heap.remove(1);
        System.out.println(heap.size());
        heap.show();
    }
}
