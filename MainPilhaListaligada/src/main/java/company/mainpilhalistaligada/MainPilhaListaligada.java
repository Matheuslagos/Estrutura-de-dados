/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package company.mainpilhalistaligada;

/**
 *
 * @author mathe
 */
public class MainPilhaListaligada {

    public static void main(String[] args) {
        No pilha = new No();
        
        System.out.println(pilha.size());
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(64);
        pilha.push(28);
        
        System.out.println(pilha.size());
        System.out.println(pilha.isEmpty());
        
        System.out.println(pilha.peek());
        
        System.out.println(pilha.pop());
        
        System.out.println(pilha.size());
        
        System.out.println(pilha.peek());
    }
}
