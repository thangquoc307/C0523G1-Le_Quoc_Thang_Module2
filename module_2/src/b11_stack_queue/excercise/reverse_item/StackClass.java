package b11_stack_queue.excercise.reverse_item;

import java.util.LinkedList;

public class StackClass{
    private LinkedList stack = new LinkedList<Character>();
    private String data;

    public StackClass(Integer element){
        data = element.toString();
    }
    public StackClass(String element){
        this.data = element;
    }
    public void reverse(){
        String textTemp = "";
        for (int i = this.data.length() - 1; i >= 0; i--){
            textTemp += this.data.charAt(i);
        }
        this.data = textTemp;
    }
    public void print(){
        System.out.println(data);
    }
}
