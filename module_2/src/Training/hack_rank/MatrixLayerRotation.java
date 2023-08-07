package Training.hack_rank;
import java.util.*;

public class MatrixLayerRotation {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int sizeY = matrix.size();
        int sizeX = matrix.get(0).size();
        int min = Math.min(sizeX, sizeY);

        for (int i = 0; i < min/2; i++){
            List<Integer> extendList = new ArrayList<>();
            for (int j = 0 + i; j < sizeX - i;j++){
                extendList.add(matrix.get(i).get(j));
            }
            for (int j = 1 + i; j < sizeY - i; j++){
                extendList.add(matrix.get(j).get(sizeX - 1 - i));
            }
            for (int j = sizeX - 2 - i; j >= i; j--){
                extendList.add(matrix.get(sizeY - 1 - i).get(j));
            }
            for (int j = sizeY - 2 - i; j >= i + 1; j--){
                extendList.add(matrix.get(j).get(i));
            }
            extendList = rotation(extendList, r);
            Queue<Integer> queue = new LinkedList<>();
            for (Integer integer : extendList){
                queue.add(integer);
            }

            for (int j = 0 + i; j < sizeX - i;j++){
                matrix.get(i).set(j, queue.poll());
            }
            for (int j = 1 + i; j < sizeY - i; j++){
                matrix.get(j).set(sizeX - 1 - i, queue.poll());
            }
            for (int j = sizeX - 2 - i; j >= i; j--){
                matrix.get(sizeY - 1 - i).set(j, queue.poll());
            }
            for (int j = sizeY - 2 - i; j >= i + 1; j--){
                matrix.get(j).set(i, queue.poll());
            }

        }

        for (int i = 0; i < sizeY; i++){
            for (int j = 0; j < sizeX; j++){
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }
    public static List<Integer> rotation(List<Integer> list, int r) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            Integer element = (i + r)% list.size();
            if (element < 0){
                element += list.size();
            }
            newList.add(element);
        }
        for (int i = 0; i < newList.size(); i++){
            newList.set(i, list.get(newList.get(i)));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        list3.add(9);
        list3.add(10);
        list3.add(11);
        list3.add(12);

        list4.add(13);
        list4.add(14);
        list4.add(15);
        list4.add(16);

        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        matrix.add(list4);

        matrixRotation(matrix, 2);
    }
}
