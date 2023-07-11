package b10_dsa.excercise.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList("aaa");
        list1.addItem(4,4);
        list1.addItem(1,"vvvvv");
        list1.addItem(1,6);
        list1.addItem(2,"bbb");
        list1.addLast("last");
        list1.addLast("last last");
        list1.addFirst("first");
        list1.addFirst("super first");

        list1.printValue();
        System.out.println("");
        list1.removeItemAtIndex(3);
        list1.printValue();

        System.out.println("");
        list1.removeItemAtIndex(20);

        System.out.println("");
        list1.remove("bbb");
        list1.printValue();
        System.out.println("");
        list1.remove("cccc");

        System.out.println(list1.getItemAtIndex(0));
        System.out.println(list1.getItemAtIndex(1));
        System.out.println(list1.getItemAtIndex(2));
        System.out.println(list1.getItemAtIndex(3));
        System.out.println("");
        System.out.println(list1.size());

        MyLinkedList list2 = new MyLinkedList("bbb");
        list2.clone(list1);
        System.out.println("");

        list2.printValue();
        System.out.println(list1.contain("last last"));
        System.out.println(list1.contain("last"));
        System.out.println(list1.contain("super first"));
        System.out.println(list1.contain("àhthent"));

        System.out.println("");
        System.out.println(list1.indexOf(4));
        System.out.println(list1.indexOf(5));
        System.out.println(list1.indexOf("super first"));

    }
}
