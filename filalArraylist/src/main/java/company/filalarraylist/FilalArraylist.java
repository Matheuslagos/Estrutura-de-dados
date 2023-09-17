/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package company.filalarraylist;

/**
 *
 * @author mathe
 */
public class FilalArraylist {

    public static void main(String[] args) {
       filametodos fila = new filametodos();
       
       fila.enqueue("1");
       fila.enqueue("4");
       fila.enqueue("2");
       
       System.out.println("Tamanho da fila: " + fila.size());
       
       System.out.println("A fila está vazia? " + fila.IsEmpty());
       
       System.out.println("Primeiro elemento da fila: " + fila.first());
        
       fila.dequeue();
       fila.dequeue();
       fila.dequeue();
       
       System.out.println("Tamanho da fila: " + fila.size());
       
       System.out.println("A fila está vazia? " + fila.IsEmpty());
        
    }
}
