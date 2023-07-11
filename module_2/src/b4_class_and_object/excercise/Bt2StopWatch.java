package b4_class_and_object.excercise;

import java.util.Scanner;

public class Bt2StopWatch {
    public static void main(String[] args) {
//        StopWatch watch = new StopWatch();
//        watch.start();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập đại cái j vào đây xem mất bao lâu");
//        String str = scanner.nextLine();
//
//        watch.stop();
//        System.out.println(watch.getElapsedtime());

        StopWatch watch1 = new StopWatch();
        watch1.start();

        for(int i = 0; i <= 10000; i++){
            System.out.println(i);
        }
        watch1.stop();
        System.out.println(watch1.getElapsedtime());
    }
}
