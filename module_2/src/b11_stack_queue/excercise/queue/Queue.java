package b11_stack_queue.excercise.queue;

public class Queue {
    int size = 0;
    Node head;

    public Queue() {
    }
    private Node front(){
        return this.head;
    }
    private Node rear(){
        Node rearElement = this.head;
        while(rearElement.next != null){
            rearElement = rearElement.next;
        }
        return rearElement;
    }
    public void enQueue(Object element){
        Node object = new Node(element);
        if (size == 0){
            this.head = object;
        }else {
            this.rear().next = object;
        }
        size++;
    }
    public void deQueue(){
        if (size == 0){
            System.out.println("List rỗng rồi xóa chi ba");
        }else {
            this.head = this.head.next;
        }
    }
    public void dislayQueue(){
        Node element = this.head;
        if (element == null){
            System.out.println("List rỗng");
        }else {
            while (element != null) {
                System.out.println(element.object);
                element = element.next;
            }
        }
    }
}
