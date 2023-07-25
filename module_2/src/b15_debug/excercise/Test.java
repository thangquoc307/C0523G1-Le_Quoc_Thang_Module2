package b15_debug.excercise;

import java.util.Scanner;

public class Test {
    private static void illegalTriangleException(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Nhập cái cạnh nhỏ hơn 0 rồi");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Tổng 2 cạnh lớn hơn cạnh còn lại rồi ba");
        }
    }

    public static void main(String[] args) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập vào cạnh a:");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào cạnh b:");
                int b = scanner.nextInt();
                System.out.println("Nhập vào cạnh c:");
                int c = scanner.nextInt();
                illegalTriangleException(a, b, c);
                System.out.println("à ờ ok");
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("1 lỗi thần kỳ nào đó không biết");
            }
        } while (true);
    }
}