package Training.hack_rank;

public class TaumAndBday {
    public static void main(String[] args) {
        System.out.println(taumBday(10,10,1,1,1));
        System.out.println(taumBday(5,9,2,3,4));
        System.out.println(taumBday(3,6,9,1,1));
        System.out.println(taumBday(7,7,4,2,1));
        System.out.println(taumBday(3,3,1,9,2));
        System.out.println(taumBday(27984,1402,619246,615589,247954));
    }
    public static long taumBday(long b, long w, long bc, long wc, long z) {
        // Write your code here
        long money;
        if (bc + z < wc){
            money = bc * (b + w) + w * z;
        } else if (wc + z < bc) {
            money = wc * (b + w) + b * z;
        } else {
            money = b * bc + w * wc;
        }
        return money;
    }
}
