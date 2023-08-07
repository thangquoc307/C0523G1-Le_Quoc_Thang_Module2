package Training.hack_rank;

public class AppendAndDelete {
    public static void main(String[] args) {

        System.out.println(appendAndDelete("y", "yu", 2));

    }
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int minLength = s.length();
        if (s.length() > t.length()){
            minLength = t.length();
        }
        String[] sSplit = s.split("");
        String[] tSplit = t.split("");
        int indexDifferent = minLength;
        for (int i = 0; i < minLength; i++){
            if (!sSplit[i].equals(tSplit[i])){
                indexDifferent = i;
                break;
            }
        }
        int delete = s.length() - indexDifferent;
        int append = t.length() - indexDifferent;

        int action = delete + append;
        if (k >= action){
            return "Yes";
        } else {
            return "No";
        }
    }
}
