/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.fila_usando_duaspilhasmain;

/**
 *
 * @author mathe
 */
public class Pilha {
    int top;
    int capacity;
    int[] pilha;
    
    Pilha(){
        top=-1;
        capacity=10;
        pilha = new int[capacity];
        
    }
    public boolean isEmpty(){
        return top == -1;
    
    
    }
    public boolean isFull(){
        return top == capacity-1;
    
    
    }
    
    public int push(int data){
        if(isFull()){
          capacity = capacity*2;
        }
        return pilha[++top]=data;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("vazia");
        }
        return pilha[top--];
    
    }
    
    public int peek(){
        return pilha[top];
    }
    
    public int size(){
        return top+1;
    }
}
