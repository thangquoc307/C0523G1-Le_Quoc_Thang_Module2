package b18_threading.excercise.simple_thread;

public class SimpleThread {
    public static void main(String[] args) {
        NumberGenerator t1 = new NumberGenerator("Thread 11111");
        NumberGenerator t2 = new NumberGenerator("Thread 2");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
