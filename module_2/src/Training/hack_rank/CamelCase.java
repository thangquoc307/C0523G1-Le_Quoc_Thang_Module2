package Training.hack_rank;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThree"));
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
    public static int camelcase(String s) {
        // Write your code here
        return s.split("[A-Z]").length;
    }
}
