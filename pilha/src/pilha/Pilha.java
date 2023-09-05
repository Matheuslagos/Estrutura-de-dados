package pilha;


public class Pilha implements Ipilha{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    Pilha(){
    top = -1;
    }    
    
    public boolean isEmpty(){
        if(top != -1){
            return true;
        }
        else{
            return false;
        }
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
        }
    }

    public int size(){
        if (top < 0){
            System.out.println("Pilha vazia");
            return 0;
        }
        else {
            return this.top + 1;
        }
    }

    public Object top(){
        if (isEmpty() == true)
            return null;
        else {
            return this.a[this.top];
        }
    }

    public void adicionaPilha(Pilha a){
       
        


    }
}
