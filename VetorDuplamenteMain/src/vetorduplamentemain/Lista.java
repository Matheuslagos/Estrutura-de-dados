/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorduplamentemain;

/**
 *
 * @author 20211014040020
 */
public class Lista {
    private No inicio;
    private No fim;
    
    public Lista(){
        this.inicio = new No(null, null, null);
        this.fim = new No(inicio, null, null);
        inicio.setProximo(fim);
        
    }
    
    Object elemAtRank(int r){
        int i=0;
        No Noatual = inicio;
        while(r!=i & Noatual!=fim){
            Noatual = Noatual.getProximo();
            i++;
            
        }
        return Noatual.getElemento();
    }
    
    Object replaceAtRank(int r, Object o){
        int i=0;
        No Noatual = inicio;
        while(r!=i & Noatual!=fim){
            Noatual = Noatual.getProximo();
            i++;
            
        }
        Object temporario = Noatual.getElemento();
        Noatual.setElemento(o);
        return temporario;        
    }
    
    void insertAtRank(int r, Object o){
        int i=0;
        No Noatual = inicio;
        while(r!=i & Noatual!=fim){
            Noatual = Noatual.getProximo();
            i++;    
        }
        Noatual.setElemento(o);  
    }
    
    Object removeAtrank(int r){
        int i=0;
        No Noatual = inicio;
        while(r!=i & Noatual!=fim){
            Noatual = Noatual.getProximo();
            i++;    
        }
        Noatual.getAnterior().Noatual.setProximo();
        Noatual.setElemento(null);
    
    
    }
    
    
}
