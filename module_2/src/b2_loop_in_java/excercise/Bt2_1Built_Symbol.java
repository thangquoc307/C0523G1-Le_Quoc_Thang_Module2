package b2_loop_in_java.excercise;

public class Bt2_1Built_Symbol {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 7; j++){
                if (j == 6){
                    System.out.println("*");
                }else {
                    System.out.print("*");
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < i + 1; j++){
                if (j == i){
                    System.out.println("*");
                }else {
                    System.out.print("*");
                }
            }
        }
        System.out.println("");
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (j == i - 1){
                    System.out.println("*");
                }else {
                    System.out.print("*");
                }
            }
        }
        System.out.println("");
        int height = 5;
        for (int i = 0; i < height; i++){
            for (int j = 0; j < height * 2 - 1; j++){
                if(j > height - (i + 2) && j < height + i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
