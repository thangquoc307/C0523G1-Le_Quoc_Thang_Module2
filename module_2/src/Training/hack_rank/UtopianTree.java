package Training.hack_rank;

public class UtopianTree {
    public static void main(String[] args) {

        System.out.println(utopianTree(0));
        System.out.println(utopianTree(1));
        System.out.println(utopianTree(4));
    }
    public static int utopianTree(int n) {
        // Write your code here
        int height = 1;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                height += 1;
            } else {
                height *= 2;
            }
        }
        return height;
    }

}
