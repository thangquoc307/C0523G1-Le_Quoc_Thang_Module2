package b1_introduction_to_java.excercise;

import java.util.Scanner;

public class Bt2TransferCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        Integer cur = scanner.nextInt();
        Integer trans = cur * 23000;
        System.out.printf("%d USD = %d VND", cur, trans);

    }
}
