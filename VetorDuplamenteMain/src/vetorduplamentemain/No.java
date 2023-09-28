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
public class No {
    private Object elemento;
    private No anterior;
    private No proximo;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    public No(No anterior, No proximo, Object elemento){
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    
    }
    
}
