package b10_dsa.excercise.CustomMyLinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNode;

    public MyLinkedList(E data) {
        numNode = 1;
        head = new Node(data);
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }



    //    class Node
    public class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }
}
