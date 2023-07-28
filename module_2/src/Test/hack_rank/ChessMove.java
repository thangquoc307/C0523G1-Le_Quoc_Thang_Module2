package Test.hack_rank;

import java.util.ArrayList;
import java.util.List;

//Cho 1 bàn cờ và vị trí quân hậu
//Cho vị trí các chướng ngại vật
//Tính coi con hậu có thể có bao nhiêu phương án di chuyển
public class ChessMove {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int q = queensAttack(4, 0, 4, 4, list);
        System.out.println(q);
    }
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        ArrayList<String> dataObstacles = convertDataObstacles(obstacles);
        int sum = 0;
        for (int vectorX = -1; vectorX <= 1; vectorX++){
            for (int vectorY = -1; vectorY <= 1; vectorY++){
                if (vectorX == 0 && vectorY == 0){
                    continue;
                }
                sum += moveAvailable(n, r_q, c_q, vectorX, vectorY, dataObstacles);
            }
        }
        return sum;
    }
    public static ArrayList<String> convertDataObstacles(List<List<Integer>> obstacles){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < obstacles.size(); i++){
            data.add(obstacles.get(i).get(0) + "-" + obstacles.get(i).get(1));
        }
        return data;
    }
    public static int moveAvailable(int n, int r_q, int c_q, int vectorX, int vectorY, ArrayList<String> dataObstacles){
        int count = 0;
        String check = "";
        while (true){
            r_q += vectorX;
            c_q += vectorY;
            check = r_q + "-" + c_q;
            if (dataObstacles.contains(check) || r_q > n || r_q < 1 || c_q > n || c_q < 1){
                return count;
            } else {
                count++;
            }
        }
    }
}
