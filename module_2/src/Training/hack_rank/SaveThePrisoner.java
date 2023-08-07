package Training.hack_rank;

public class SaveThePrisoner {
    public static void main(String[] args) {
        saveThePrisoner(4,6,2);
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int index = s;
        for (int i = s - 1; i < s + m - 1; i++){
             index = i % n + 1;
        }
        return index;
    }

}
