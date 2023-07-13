package b11_stack_queue.excercise.optional_round_brackets;

public class CheckRoundBracketTest {
    public static void main(String[] args) {
        CheckRoundBracket.checkRoundBracket("s * (s – a) * (s – b) * (s – c)  ");
        CheckRoundBracket.checkRoundBracket("(– b + (b2 – 4*a*c)^0.5) / 2*a");
        CheckRoundBracket.checkRoundBracket("s * (s – a) * (s – b * (s – c) ");
        CheckRoundBracket.checkRoundBracket("s * (s – a) * s – b) * (s – c)  ");
        CheckRoundBracket.checkRoundBracket("(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ");
        CheckRoundBracket.checkRoundBracket("((((()))))))))))");
    }
}
