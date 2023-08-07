package Training.hack_rank;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(minimumNumber(5,"2bbbb"));
        System.out.println(minimumNumber(5, "2bb#A"));
    }
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        int lengthNeed = 6 - password.length();
        int digit = password.matches(".*[0-9].*") ? 0 : 1;
        int lower = password.matches(".*[a-z].*") ? 0 : 1;
        int upper = password.matches(".*[A-Z].*") ? 0 : 1;
        int special = password.matches(".*[^A-Za-z0-9].*") ? 0 : 1;

        if (lengthNeed > digit + lower + upper + special){
            return lengthNeed;
        } else {
            return digit + lower + upper + special;
        }
    }
}
