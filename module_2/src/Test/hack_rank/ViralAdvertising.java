package Test.hack_rank;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
        System.out.println(viralAdvertising(2));
    }
    public static int viralAdvertising(int n) {
        // Write your code here
        int person = 2;
        int personAdv = 2;
        for (int i = 1; i < n; i++){
            personAdv = Math.floorDiv(personAdv * 3, 2);
            person += personAdv;
        }
        return person;
    }
}
