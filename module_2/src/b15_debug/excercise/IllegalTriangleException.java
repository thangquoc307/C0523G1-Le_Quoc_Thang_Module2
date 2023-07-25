package b15_debug.excercise;

public class IllegalTriangleException extends Throwable {

    public IllegalTriangleException(String s) {
        System.out.println(s);
    }
}
