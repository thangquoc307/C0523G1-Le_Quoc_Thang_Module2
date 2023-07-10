package b10_dsa.excercise.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList <String> myList1 = new MyList<String>(3);
        MyList <Integer> myList2 = new MyList<Integer>();
        MyList <Integer> myList3 = new MyList<Integer>(3);

        myList1.setElements(new String[] {"Một", "Hai"});
        myList2.setElements(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        myList3.setElements(new Integer[] {11, 12, 13, 14});

        System.out.println(myList1.getValueInfo());
        myList1.add(1, "ba");
        System.out.println(myList2.getValueInfo());
        myList2.remove(7);

        System.out.println(myList1.getValueInfo());
        System.out.println(myList2.getValueInfo());
        System.out.println(myList3.getValueInfo());

        System.out.println("List 1 Contain 'Hai' " + myList1.isContain("Hai") + " Vị trí thứ " + myList1.indexOf("Hai"));
        System.out.println("List 1 Contain 'Năm' " + myList1.isContain("Năm"));
        System.out.println("Item at index 3 in list2 : " + myList2.getItemAtIndex(3));

    }
}
