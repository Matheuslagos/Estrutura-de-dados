/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.mainfilalistaligada;

/**
 *
 * @author mathe
 */
public class Queue {
    private Node ultimo;
    private Node primeiro;
    private int size;
    
    public Queue(){
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
    
    public Node peek(){
        Node response = null;
        if(!isEmpty()){
            response = new Node(primeiro.getData());
        }
        return response;
    }
    public Object getSize(){
        return size;
    }
}
    
    

