package b11_stack_queue.excercise.keyword_frequency;

public class KeywordFrequencyTest {
    public static void main(String[] args) {
        Keyword string = new Keyword("sdqqqqitb/j ưy9pmotagfds");
        System.out.println(string.getStr());
        string.countWord();
        System.out.println("");
        string.setStr("sgbgggggggg");
        string.countWord();

    }
}
