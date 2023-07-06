package b4_class_and_object.excercise;

import java.util.Scanner;

public class Bt2StopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đại cái j vào đây xem mất bao lâu");
        String str = scanner.nextLine();

        watch.stop();
        System.out.println(watch.getElapsedtime());
    }
    public static class StopWatch{
        long startTime, endTime;
        private StopWatch(){
        }
        public long getStartTime(){
            return this.startTime;
        }
        public long getEndTime(){
            return this.endTime;
        }
        public void start(){
            this.startTime = System.currentTimeMillis();
        }
        public void stop(){
            this.endTime = System.currentTimeMillis();
        }
        public String getElapsedtime(){
            return "Thời gian thực thi của chương trình là " + (this.endTime - this.startTime) + "ms";
        }
    }
}
