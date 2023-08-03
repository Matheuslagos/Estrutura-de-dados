public class ArrayHeap {
    private Item[] heap;
    private int index = 2;

    public ArrayHeap(int key, Object value){
        heap = new Item[3];
        heap[1] = new Item(key, value);
    }
    public void remove(int key){
        int i = 1;
        while(i < index){
            if(heap[i].getKey() == key){
                heap[i] = heap[index-1];
                heap[index-1] = null;
                index--;
                downheap(i);
                return;
            }
            i++;
        }
        
    }
    private downheap(int i){
        int left = 2*i;
        int right = 2*i+1;
        if(left >= index){
            return;
        }
        if(right >= index){
            if(heap[i].getKey() > heap[left].getKey()){
                swap(i, left);
                downheap(left);
            }
            return;
        }
        if(heap[i].getKey() > heap[left].getKey() || heap[i].getKey() > heap[right].getKey()){
            if(heap[left].getKey() < heap[right].getKey()){
                swap(i, left);
                downheap(left);
            }else{
                swap(i, right);
                downheap(right);
            }
        }
    }
    public void insert(int key, Object value){
        if(index == heap.length){
            Item[] temp = new Item[heap.length*2];
            for(int i = 0; i < heap.length; i++){
                temp[i] = heap[i];
            }
            heap = temp;
        }
        heap[index] = new Item(key, value);
        upheap(index);
        index++;
    }
    private void swap(int i, int j){
        Item temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public int min(){
        return heap[1].getKey();
    }
    public int size(){
        return index-1;
    }
    public boolean isEmpty(){
        return index == 1;
    }
    public void show(){
        for(int i = 1; i < index; i++){
            System.out.println(heap[i].getKey());
        }
    }
    class Item{ 
        private int key;
        private Object value;
        public Item(int key, Object value){
            this.key = key;
            this.value = value;
        }
        public int compareTo(Item item){
            if(this.key < item.key){
                return -1;
            }else if(this.key > item.key){
                return 1;
            }else{
                return 0;
            }
            public int key(){
                return key;
            }
            public Object value(){
                return value;
            }
        }
    }

    









}
