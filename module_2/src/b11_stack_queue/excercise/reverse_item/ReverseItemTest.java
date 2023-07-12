package b11_stack_queue.excercise.reverse_item;

public class ReverseItemTest {
    public static void main(String[] args) {
        StackClass list1 = new StackClass<Integer>();
        list1.addArray(new Integer[] {1,2,7,4,5,6,7,8});
        list1.print();
        System.out.println("");
        list1.reverse();
        list1.print();
        System.out.println("");
    }
}
