/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.teste;

/**
 *
 * @author mathe
 */
public class fila implements IFila {
    int i=0, f=0, N, incremento;
    Object O[];
    
    public fila(int N, int incremento){
        O=new Object[N];
        this.N=N;
        this.incremento=incremento;
    }
        @Override
        public void enqueue(Object o){
            if(size()==N-1){
                int novoTam;
                if (incremento==0) 
                    novoTam=N*2;
                else 
                    novoTam=N+incremento;
                Object[] b=new Object[novoTam];
                 int ii=i;
                for (int ff=0;ff<size();ff++){
                    b[ff]=O[ii];
                    ii=(ii+1)%N;
                    
                }
                f=size();
                i=0;
                N=novoTam;
                O=b;
                
            }
            O[f]=o;
            f=(f+1)%N;
            
        }
        
        @Override         
	public Object dequeue(){
        if(isEmpty())
            throw new FilaVaziaException("vazia");
            Object temp = O[i];
            i=(i+1)%N;
            return temp;
            
        }
        
        @Override
	public Object first(){
            if(f==i){
            throw new FilaVaziaException("vazia");
            }
            else return i;
        }
        
        @Override
	public int size(){
            return (N-i+f)%N;        
        }
        
        @Override
	public boolean isEmpty(){
            return f==i;
        }
    
}
