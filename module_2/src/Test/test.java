package Test;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap hang");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap cot");
        int col = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap phan tu hang " + i + " cot " + j);
//                arr[i][j] = scanner.nextInt();
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang co dang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("ban muon tinh tong cot nao? 0 < column <= " + col);
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println(Sum(arr, choice));
    }

    public static int Sum(int arr[][], int choice) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][choice];
        }
        return sum;
    }
}