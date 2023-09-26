/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package company.pilha_usando_duasfilasmain;

/**
 *
 * @author mathe
 */
public class Pilha_Usando_duasFilasMain {

    public static void main(String[] args) {
       PilhaUsandoFilalistaligada Pilha = new PilhaUsandoFilalistaligada();
        
       Pilha.push(1);
       Pilha.push(2);
       Pilha.push(3);
       Pilha.push(4);
       Pilha.push(5); /* primeiro a ser removido*/
       
       System.out.println(Pilha.size());
       
       Pilha.pop();
       
       System.out.println(Pilha.size());
       System.out.println(Pilha.isEmpty());
       System.out.println("o  elemento do topo da  pilha é :  "+ Pilha.top()); 
       
       
       System.out.println(Pilha.isEmpty());
    }
}
