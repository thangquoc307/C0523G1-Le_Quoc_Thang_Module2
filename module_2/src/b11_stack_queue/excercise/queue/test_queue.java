package b11_stack_queue.excercise.queue;

public class test_queue {
    public static void main(String[] args) {
        Queue list = new Queue();
        list.dislayQueue();
        System.out.println("");
        System.out.println(list.deQueue());
        System.out.println("");

        list.enQueue(5555);
        list.enQueue("àdbafbb");
        list.enQueue("àdbtttttttbb");
        list.dislayQueue();
        System.out.println("");
        System.out.println(list.deQueue());
        System.out.println("");


    }
}
