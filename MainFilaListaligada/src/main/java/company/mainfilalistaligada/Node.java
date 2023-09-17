/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.mainfilalistaligada;

/**
 *
 * @author mathe
 */
public class Node {
        private Object data;
        private Node next;
        
        public Node(Object data){
            this.data=data;
            next=null;
        }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
        
}
