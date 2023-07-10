package b10_dsa.excercise.array_list;
public class MyList<E>{
    private int size;
    private final static int DEFAULT_CAPACITY = 10;
    private E[] elements;
    public MyList() {
        this(DEFAULT_CAPACITY);
    }
    public MyList(int capacity) {
        this.elements = (E[]) new Object[capacity];
        this.size = capacity;
    }
    public void setElements(E[] newElements) {
        int maxI;
        if (this.size > newElements.length){
            maxI = newElements.length;
        }else {
            maxI = this.size;
        }

        for(int i = 0; i < maxI; i++){
            elements[i] = newElements[i];
        }
    }
    public void add(int index, E element){
            E[] newArr = (E[]) new Object[this.size + 1];
        int i = 0;
        for(; i < index; i++){
            newArr[i] = this.elements[i];
        }
        newArr[index] = element;
        for(i = index; i < this.size; i++){
            newArr[i + 1] = this.elements[i];
        }
        this.elements = newArr;
    }
    public void remove(int index){
        E[] newArr = (E[]) new Object[this.size - 1];
        int i = 0;
        for(; i < index; i++){
            newArr[i] = this.elements[i];
        }
        for(i = index; i < this.size - 1; i++){
            newArr[i] = this.elements[i + 1];
        }
        this.elements = newArr;
    }
    public String getValueInfo(){
        String data = "";
        for(int i = 0; i < elements.length; i++){
            data += "index : " + i + " - value : " + elements[i] + "\n";
        }
        return data;
    }
    public int getSize(){
        return this.size;
    }
    public E[] clone(){
        return this.elements;
    }
    public boolean isContain(E element){
        boolean isContain = false;
        for(int i = 0; i < size; i++){
            if (this.elements[i] == element){
                isContain = true;
            }
        }
        return isContain;
    }
    public int indexOf(E element){
        int index = -1;
        for(int i = 0; i < this.size; i++){
            if(element == this.elements[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public E getItemAtIndex(int index){
        if (index < this.size) {
            return this.elements[index];
        }
        return null;
    }
    public void clear(){
        this.elements = null;
        this.size = 0;
    }
}