/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package company.mainfilalistaligada;

/**
 *
 * @author mathe
 */
public class MainFilaListaligada {

    public static void main(String[] args) {
        Queue queue = new Queue();
        
        System.out.println(queue.getSize());
        
        queue.enqueue(2);
        queue.enqueue(4389);
        
        
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        
        System.out.println(queue.peek().getData()+ " o primeiro");
        
        System.out.println(queue.dequeue().getData()+" eliminado da fila");
        
        System.out.println(queue.getSize());
        
        System.out.println(queue.peek().getData()+ " o primeiro");
    }
}
