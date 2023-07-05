package Test;

public class GiaiThuat1 {
    public static void main(String[] args) {
        int maxI = 8;
        int maxJ = 10;
        for(int i = 0; i <= maxI; i++){
            for (int j = 0; j <= maxJ; j++){
                if (j == Math.abs(maxJ/2 - i - 1) || j == maxJ/2 + i + 1 || j + i == maxI + maxJ/2 + 1) {
                    System.out.print(Math.abs(j - maxJ/2));
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
