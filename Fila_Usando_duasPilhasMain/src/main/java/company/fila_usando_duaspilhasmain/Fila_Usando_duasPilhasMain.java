/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package company.fila_usando_duaspilhasmain;

/**
 *
 * @author mathe
 */
public class Fila_Usando_duasPilhasMain {

       
    public static void main(String[] args) {
       Fila fila = new Fila();
        
       fila.enqueue(1);
       fila.enqueue(132);
       fila.enqueue(112);
       fila.enqueue(1234);
       fila.enqueue(11234);
       
       System.out.println(fila.size());
       
       fila.dequeue();
       
       System.out.println(fila.size());
      
       System.out.println(fila.first());
       
       
       
    }
}
