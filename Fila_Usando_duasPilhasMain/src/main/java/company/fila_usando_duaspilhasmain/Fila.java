/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.fila_usando_duaspilhasmain;

/**
 *
 * @author mathe
 */
public class Fila {
    Pilha pilha1 = new Pilha();
    Pilha pilha2 = new Pilha();
    
    public void enqueue(int data){
        pilha1.push(data);
    }
    
    public Object dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("fila vazia");
        }
        if (pilha2.isEmpty()){
            while(!pilha1.isEmpty()){
                pilha2.push(pilha1.pop());
            }
        }
        return pilha2.pop();
        
    }
    public boolean isEmpty() {
        return pilha1.isEmpty() && pilha2.isEmpty();
    }
    
    public int size() {
        return pilha1.size() + pilha2.size();
    }
    
    public int first(){
        if(isEmpty()){
            throw new IllegalStateException("fila vazia");
        }
        if (pilha2.isEmpty()) {
        while (!pilha1.isEmpty()) {
            pilha2.push(pilha1.pop());
        }
    }
        return pilha2.peek();
    }
    
    
    
}
