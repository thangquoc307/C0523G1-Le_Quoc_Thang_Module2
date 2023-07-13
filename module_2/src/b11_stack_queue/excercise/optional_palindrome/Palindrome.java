package b11_stack_queue.excercise.optional_palindrome;

public class Palindrome {
    private Node head;
    private String string;

    public Palindrome(String str) {
        this.string = str;
        for(int i = 0; i < str.length(); i++){
            this.addLast(str.charAt(i));
        }
    }
    private void addLast(Character word){
        Node object = new Node(word);
        if(this.head == null){
            this.head = object;
        }else {
            Node element = head;
            while (element.next != null){
                element = element.next;
            }
            element.next = object;
        }
    }
    private String direct(){
        String str = "";
        Node object = head;
        while (object != null){
            str += object.data.toString();
            object = object.next;
        }
        return str;
    }
    private String reverse(){
        String str = "";
        Node object = head;
        while(object != null){
            str = object.data.toString() + str;
            object = object.next;
        }
        return str;
    }
    public void check(){
        System.out.println("Chuỗi đọc thuận : " + this.direct());
        System.out.println("Chuỗi đọc nghịch : " + this.reverse());
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (direct().toLowerCase().charAt(i) == reverse().toLowerCase().charAt(i)){
                count++;
            }
        }
        if (count == string.length()){
            System.out.println(string + " là chuỗi Palindrome");
        }else {
            System.out.println(string + " không phải là chuỗi Palindrome");
        }
    }

    private class Node{
        public Character data;
        private Node next;
        public Node(Character data) {
            this.data = data;
            this.next = null;
        }
    }
}
