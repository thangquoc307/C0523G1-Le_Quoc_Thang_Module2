package b15_debug.excercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Mời nhập vào độ dài cạnh thứ 1");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời nhập vào độ dài cạnh thứ 2");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời nhập vào độ dài cạnh thứ 3");
            double c = Double.parseDouble(scanner.nextLine());

            CheckTriangle.checkTriangle(a, b, c);
            System.out.println("Tam giác OK á");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
