package b11_stack_queue.excercise.reverse_item;

public class ReverseItemTest {
    public static void main(String[] args) {
        StackClass list1 = new StackClass(1235447885);
        StackClass list2 = new StackClass("dfagbtrb gstbr");
        list1.print();
        list2.print();
        list1.reverse();
        list2.reverse();
        list1.print();
        list2.print();
    }
}
