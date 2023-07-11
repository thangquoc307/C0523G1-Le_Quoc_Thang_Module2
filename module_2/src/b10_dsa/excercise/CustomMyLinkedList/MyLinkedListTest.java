package b10_dsa.excercise.CustomMyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList<String>("Phần tử đầu tiên");
        list1.printList();
        System.out.println("----------");
        list1.add(3, "Phần tử add index 3");
        list1.add(2, "Phần tử add index 2");
        list1.add(1, "Phần tử add index 1");
        list1.printList();
        System.out.println("----------");
        list1.addFirst("Phần tử add First");
        list1.printList();
        System.out.println("----------");


    }
}
