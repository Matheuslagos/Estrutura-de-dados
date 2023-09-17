/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.mainpilhalistaligada;

import java.util.EmptyStackException;

/**
 *
 * @author mathe
 */
public class No {
    private Node top;
    private int size;
    
    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data = data;
            this.next = null;
            
        }

    }
    public void push(Object data){
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
        
       size++;
    }
    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object result = top.data;
        top = top.next;
        size--;
        return result;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public Object peek(){
        if(isEmpty()){
            throw new EmptyStackException();
            
        }
        return top.data;
    }
    
    public void displayStack(){
        Node current = top;
        while (current != null){
            System.out.print(current.data+" ");
            
            current = current.next;
        }
    }
    
}
