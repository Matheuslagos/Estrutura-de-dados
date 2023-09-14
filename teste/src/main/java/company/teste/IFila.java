/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package company.teste;

/**
 *
 * @author mathe
 */
public interface IFila {
	    public abstract void enqueue(Object o);
	    public abstract Object dequeue();
	    public Object first();
	    public abstract int size();
	    public abstract boolean isEmpty();
}