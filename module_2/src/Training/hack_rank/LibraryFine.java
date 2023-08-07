package Training.hack_rank;

public class LibraryFine {
    public static void main(String[] args) {

        System.out.println(libraryFine(14,7,2018,5,7,2018));
        System.out.println(libraryFine(9,6,2015,6,6,2015));
    }
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int fee = 0;
        if (y1 > y2){
            fee = 10000;
        } else if (y1 == y2){
            if (m1 > m2){
                fee = (m1 - m2) * 500;
            } else if (m1 == m2) {
                if (d1 > d2){
                    fee = (d1 - d2) * 15;
                }
            }
        }
        return fee;
    }
}
