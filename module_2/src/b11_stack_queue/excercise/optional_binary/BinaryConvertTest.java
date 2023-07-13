package b11_stack_queue.excercise.optional_binary;

public class BinaryConvertTest {
    public static void main(String[] args) {
        BinaryConvert number = new BinaryConvert(30);
        System.out.println("Mã Binary của 30 : " + number.convert());
        BinaryConvert number1 = new BinaryConvert(111);
        System.out.println("Mã Binary của 111 : " + number1.convert());
    }
}
