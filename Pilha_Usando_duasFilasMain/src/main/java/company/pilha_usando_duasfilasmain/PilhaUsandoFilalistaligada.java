/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.pilha_usando_duasfilasmain;

/**
 *
 * @author mathe
 */
public class PilhaUsandoFilalistaligada {
    Fila fila1 = new Fila();
    Fila fila2 = new Fila();
    
    public void push(Object elemento){  
        fila1.enqueue(elemento);
        if (fila1.getSize() >= 1){
             fila2.enqueue(fila1.dequeue());
        }
        
        
            
    }
    
    public Object pop(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }
        int tamanho = fila1.getSize();
        Fila filatemporaria = new Fila();
        for(int i=0; i < tamanho;i++){
            while(fila1.getSize() != 1){
            fila2.enqueue(fila1.dequeue());
            }filatemporaria.enqueue(fila1.dequeue());
            while(!fila2.isEmpty()){
                fila1.enqueue(fila2.dequeue());
            }
        }
        while(!filatemporaria.isEmpty()){
            fila1.enqueue(filatemporaria.dequeue());
        }  
        return fila1.dequeue();
        
    }
  
    public int size(){
        return fila1.getSize();
    }
    
   /* public Object top(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }
        if(fila2.isEmpty()){
            while(!fila1.isEmpty()){
                fila2.enqueue(fila1.dequeue());
            }
        }
        
        return ((Node) fila2.peek()).getData();
        
    }*/
    public Object top(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }
       
        return fila1.peek();
        
    }
    public boolean isEmpty(){
        return (fila1.getSize() + fila2.getSize())==0;
    }
    
    
}
