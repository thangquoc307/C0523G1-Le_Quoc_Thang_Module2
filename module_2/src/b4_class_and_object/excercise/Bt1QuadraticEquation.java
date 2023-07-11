package b4_class_and_object.excercise;

import java.util.Scanner;

public class Bt1QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A x^2 + B x + C = 0");
        System.out.print("Nhập vào biến A : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập vào biến B : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập vào biến C : ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println(quadraticEquation.getResult());

    }
}
