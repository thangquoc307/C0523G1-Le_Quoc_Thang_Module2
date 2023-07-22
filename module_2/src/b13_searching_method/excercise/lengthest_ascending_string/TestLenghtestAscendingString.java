package b13_searching_method.excercise.lengthest_ascending_string;

public class TestLenghtestAscendingString {
    public static void main(String[] args) {
        String str1 = "Welcome";
        System.out.println("String : " + str1);
        AnalyzeString.lengthestAcsendingString(str1);
        System.out.println("");

        String str2 = "012121268109aaa";
        System.out.println("String : " + str2);
        AnalyzeString.lengthestAcsendingString(str2);
        System.out.println("");

        String str3 = "aabbbcccddssspppiiizzzAAA";
        System.out.println("String : " + str3);
        AnalyzeString.lengthestAcsendingString(str3);
        System.out.println("");


        String str4 = "ghijabcdef";
        System.out.println("String : " + str4);
        AnalyzeString.lengthestAcsendingString(str4);
    }
}
