import java.util.Scanner;

public class Bt1_1NameDislay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your Name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name);
    }
}
