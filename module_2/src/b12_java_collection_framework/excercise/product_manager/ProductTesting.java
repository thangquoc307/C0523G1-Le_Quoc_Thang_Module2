package b12_java_collection_framework.excercise.product_manager;

public class ProductTesting {
    public static void main(String[] args) {
        //Linked List
        System.out.println("Test LinkedList");

        LinkedListProduct.addItem(6, "Apple1", 33000);
        LinkedListProduct.addItem(7, "apple2", 30000);
        LinkedListProduct.addItem(10, "mango", 25000);
        LinkedListProduct.addItem(2, "orange", 40000);
        LinkedListProduct.addItem(15, "banana", 35000);
        LinkedListProduct.addItem(3, "spicy", 5000);

        LinkedListProduct.showAllItem();
        System.out.println("");

        LinkedListProduct.removeItem(100);
        System.out.println("");

        LinkedListProduct.removeItem(2);
        System.out.println("");

        LinkedListProduct.showAllItem();
        System.out.println("");

        LinkedListProduct.searchByName("abc");
        System.out.println("");

        LinkedListProduct.searchByName("aPpLe");
        System.out.println("");

        LinkedListProduct.editItemAtId(10);
        System.out.println("");
        LinkedListProduct.showAllItem();
        System.out.println("");

        LinkedListProduct.ascendingOrder();
        System.out.println("");
        LinkedListProduct.descendingOrder();


        //Array List
        System.out.println("Test ArrayList");


        ArrayListProduct.addItem(6, "Apple1", 33000);
        ArrayListProduct.addItem(7, "apple2", 30000);
        ArrayListProduct.addItem(10, "mango", 25000);
        ArrayListProduct.addItem(2, "orange", 40000);
        ArrayListProduct.addItem(15, "banana", 35000);
        ArrayListProduct.addItem(3, "spicy", 5000);

        ArrayListProduct.showAllItem();
        System.out.println("");

        ArrayListProduct.removeItem(100);
        System.out.println("");

        ArrayListProduct.removeItem(2);
        System.out.println("");

        ArrayListProduct.showAllItem();
        System.out.println("");

        ArrayListProduct.searchByName("abc");
        System.out.println("");

        ArrayListProduct.searchByName("aPpLe");
        System.out.println("");

        ArrayListProduct.editItemAtId(10);
        System.out.println("");
        ArrayListProduct.showAllItem();
        System.out.println("");

        ArrayListProduct.ascendingOrder();
        System.out.println("");
        ArrayListProduct.descendingOrder();
    }
}
