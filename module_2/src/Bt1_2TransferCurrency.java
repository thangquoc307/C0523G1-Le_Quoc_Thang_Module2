import java.util.Scanner;

public class Bt1_2TransferCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        Integer cur = scanner.nextInt();
        Integer trans = cur * 23000;
        System.out.printf("%d USD = %d VND", cur, trans);

    }
}
