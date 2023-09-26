/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.pilha_usando_duasfilasmain;

/**
 *
 * @author mathe
 */
public class Fila {
    private Node ultimo;
    private Node primeiro;
    private int size;
    
    public Fila(){
        primeiro = null;
        ultimo = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;  
    }
    
    public void enqueue(Object elemento){
        Node node = new Node(elemento);
        
        if(primeiro == null){
            ultimo = node;
            primeiro = node;
            size++;
        }else{
            ultimo.setNext(node);
            ultimo = node;
            size++;
            
        }   
    }    
    
    public Node dequeue(){
        Node response = null;
        if (primeiro != null){
            if(primeiro.getNext() != null){
                response = new Node(primeiro.getData());
                primeiro = primeiro.getNext();
                size--;
            }else{
                response = new Node(primeiro.getData());
                primeiro = null;
                ultimo = null;
                size--;
                
            }
        }
        return response; 
    }
    
      public Object peek(){
        Node response = null;
        if(!isEmpty()){
            response = new Node(primeiro.getData());
        }
        return response.getData();
    }
    
    public int getSize(){
        return size;
    }
}
    
