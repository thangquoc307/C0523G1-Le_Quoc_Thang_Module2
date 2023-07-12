package b11_stack_queue.excercise.keyword_frequency;

public class KeywordFrequencyTest {
    public static void main(String[] args) {
        Keyword string = new Keyword("thắng thắng thua thua thua");
        System.out.println(string.getStr());
        string.countWord();
        System.out.println("");
        string.setStr("black pink pink black blue Blue BLUE");
        string.countWord();

    }
}
