package Training.hack_rank;

public class CountingValleys {
    public static void main(String[] args) {
        int count = countingValleys(8, "UDDDUDUU");
        System.out.println(count);
    }
    public static int countingValleys(int steps, String path) {
        int count = 0;
        int countDown = 0;
        int move = 0;
        for (int i = 0; i < path.length(); i++){

            if (path.charAt(i) == 'D'){
                move--;
            } else {
                move++;
            }
            if (move < 0){
                countDown = 1;
            }
            if (move >= 0 && countDown == 1){
                countDown = 0;
                count++;
            }
        }
        return count;
    }
}
