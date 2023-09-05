/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author 20211014040020
 */
public class Pilha implements Ipilha{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    Pilha(){
    top = -1;
    }
    
    
    public boolean isEmpty(){
        return (top<0);
    }

    public Object pop(){
        if (top<0){
            System.out.println("pilha vazia");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    public void push(int x){
        if (top >= (MAX-1)){
            System.out.println("estourou");
        }
        else{
            a[++top] = x;
            return true;
        }
        
        
    }

    public int size(){
        if (top < 0){
            System.out.println("Pilha vazia");
            return 0;
        }
        else {
            return a[top];
        }
    }

    public Object top(){
        return null;
    }
}

   
    
    

