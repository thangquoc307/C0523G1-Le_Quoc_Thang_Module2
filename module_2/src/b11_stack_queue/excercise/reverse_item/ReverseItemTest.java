package b11_stack_queue.excercise.reverse_item;

import java.util.Queue;
import java.util.Stack;

public class ReverseItemTest {
    public static void main(String[] args) {
//        StackClass list1 = new StackClass(1235447885);
//        StackClass list2 = new StackClass("dfagbtrb gstbr");

//        list1.print();
//        list2.print();
//        list1.reverse();
//        list2.reverse();
//        list1.print();
//        list2.print();
        String[] string1 = "1235447885".split("");
        String[] string2 = "dfagbtrb gstbr".split("");

        Stack<String> list1 = new Stack<>();
        Stack<String> list2 = new Stack<>();

        for (int i = 0; i < string1.length; i++){
            System.out.print(list1.push(string1[i]));
        }
        System.out.println("");
        while (!list1.empty()){
            System.out.print(list1.pop());
        }
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < string2.length; i++){
            System.out.print(list2.push(string2[i]));
        }
        System.out.println("");
        while (!list2.empty()){
            System.out.print(list2.pop());
        }
    }
}
