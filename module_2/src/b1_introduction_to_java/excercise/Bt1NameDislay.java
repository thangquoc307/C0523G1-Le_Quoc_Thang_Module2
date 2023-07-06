package b1_introduction_to_java.excercise;

import java.util.Scanner;

public class Bt1NameDislay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your Name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name);
    }
}
