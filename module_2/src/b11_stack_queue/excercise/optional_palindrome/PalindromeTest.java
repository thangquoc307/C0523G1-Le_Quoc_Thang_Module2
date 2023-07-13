package b11_stack_queue.excercise.optional_palindrome;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome test1 = new Palindrome("sGnrhHGGGg");
        test1.check();
        System.out.println("");
        Palindrome test2 = new Palindrome("Able was I ere I saw Elba");
        test2.check();
    }
}
