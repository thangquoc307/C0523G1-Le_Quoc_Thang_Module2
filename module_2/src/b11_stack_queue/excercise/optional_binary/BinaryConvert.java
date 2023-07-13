package b11_stack_queue.excercise.optional_binary;

public class BinaryConvert {
    private Node head = null;

    public BinaryConvert(int number) {
        while (number != 0){
            this.addFirst(number%2);
            number = number/2;
        }
    }
    public int convert(){
        String str = "";
        Node element = head;
        while (element != null){
            str += element.number.toString();
            element = element.next;
        }
//        System.out.println(str);
        return Integer.parseInt(str);
    }
    private void addFirst(int num){
        Node number = new Node(num);
        if (this.head == null){
            this.head = number;
        }else {
            number.next = this.head;
            this.head = number;
        }
    }

    private class Node{
        private Integer number;
        private Node next;

        public Node(int number) {
            this.number = number;
            this.next = null;
        }
    }
}
