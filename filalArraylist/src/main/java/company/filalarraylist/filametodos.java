/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.filalarraylist;
import java.util.*;
/**
 *
 * @author mathe
 */
public class filametodos {
    int i=0;
    ArrayList f = new ArrayList();
    
    //public filametodos(int N, int incremento){
        //O=new Object[N];
        //this.N=N;
        //this.incremento=incremento;
    //}
        
        public void enqueue(Object o){
            f.add(o);
        }
        
                 
	public Object dequeue(){
             return f.remove(i);
        }
        
        
	public Object first(){
            return f.get(0);
        }
        
        
	public int size(){
            return f.size();
        }
        
        
	public boolean IsEmpty(){
            return f.isEmpty();
        }
    
}