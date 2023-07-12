package b11_stack_queue.excercise.reverse_item;

import java.util.LinkedList;

public class StackClass<T>{
    private LinkedList<T> stack;

    public StackClass() {
        stack = new LinkedList();
    }
    public void addArray(T[] array){
        for (int i = 0; i < array.length; i++){
            stack.addLast(array[i]);
        }
    }
    public void print(){
        for (int i = 0; i < stack.size(); i++){
            System.out.print(" " + stack.get(i));
        }
    }
    public void reverse(){
        LinkedList<T> stackTemp = new LinkedList();
        for (int i = 0; i < stack.size(); i++){
            stackTemp.addFirst(stack.get(i));
        }
        stack = stackTemp;
    }
}
