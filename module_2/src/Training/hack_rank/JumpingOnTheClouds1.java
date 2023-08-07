package Training.hack_rank;

public class JumpingOnTheClouds1 {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0,0,1,0,0,1,1,0}, 2));
    }
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int position = 0;
        while (energy >= 0){
            energy--;
            position = (position + k) % c.length;
            if (c[position] == 1){
                energy -= 2;
            }
            if (position == 0){
                return energy;
            }
        }
        return energy;
    }

}
