package b10_dsa.excercise.linked_list;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        Node object = new Node(data);
            this.head = object;
        numNodes++;
    }

    public Node getHead() {
        return head;
    }

    public void addItem(int index, Object element){
        Node indexObject = this.head;
        for (int i = 1; indexObject.next != null && i < index; i++){
            indexObject = indexObject.next;
        }
        Node object = new Node(element);
        object.next = indexObject.next;
        indexObject.next = object;
        numNodes++;
    }
    public void printValue(){
        Node lastObject = this.head;
        for (int i = 0; lastObject != null; i++){
            System.out.println("index " + i + " : " + lastObject.getData());
            lastObject = lastObject.next;
        }
        System.out.println("List có " + this.numNodes + " phần tử");
    }
    public void addLast(Object element){
        Node object = new Node(element);
        Node lastObject = this.head;
        for (int i = 1; lastObject.next != null; i++){
            lastObject = lastObject.next;
        }
        lastObject.next = object;
        numNodes++;
    }
    public void addFirst(Object element){
        Node object = new Node(element);
        object.next = this.head;
        this.head = object;
        numNodes++;
    }
    public void removeItemAtIndex(int index){
        if(index < 0 || index >= numNodes){
            System.out.println("Nhập số lố rồi ba, làm gì có index đó mà xóa");
            return;
        }
        Node indexObject = this.head;
        for(int i = 1; i < index; i++){
            indexObject = indexObject.next;
        }
        indexObject.next = indexObject.next.next;
        numNodes--;
    }
    public void remove(Object element){
        Node object = this.head;
        int index = -1;
        for(int i = 1; i < numNodes; i++){
            object = object.next;
            if(object.getData() == element){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Không tìm thấy đối tượng cần xóa");
        }else {
            this.removeItemAtIndex(index);
        }
    }
    public Object getItemAtIndex(int index){
        Node object = this.head;
        for (int i = 0; i < index; i++){
            object = object.next;
        }
        return object.getData();
    }
    public int size(){
        return this.numNodes;
    }
    public void clone(MyLinkedList listOrigin){
        this.head = new Node(listOrigin.getItemAtIndex(0));
        for (int i = 1; i < listOrigin.size(); i++){
            this.addLast(listOrigin.getItemAtIndex(i));
        }
    }
    public boolean contain(Object element){
        Node object = this.head;
        for(int i = 1; object != null; i++){
            if (object.getData() == element){
                return true;
            }
            object = object.next;
        }
        return false;
    }
    public int indexOf(Object element){
        Node object = this.head;
        for(int i = 0; object != null; i++){
            if (object.getData() == element){
                return i;
            }
            object = object.next;
        }
        return -1;
    }
    private class Node {
        private Node next; //Đối tượng liền kề tiếp theo
        private Object data; // Dữ liệu của đối tượng
        public Node(Object data) {
            this.data = data; //Đổ dữ liệu vào đối tượng
        }
        public Object getData() {
            return this.data; //Lấy dữ liệu ra
        }
    }
}
