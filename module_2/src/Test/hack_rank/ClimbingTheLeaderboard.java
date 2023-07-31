package Test.hack_rank;

import java.util.*;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        List<Integer> ranker = new ArrayList<>();
        List<Integer> player = new ArrayList<>();
        ranker.add(100);
        ranker.add(100);
        ranker.add(50);
        ranker.add(40);
        ranker.add(40);
        ranker.add(20);
        ranker.add(10);

        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);

        System.out.println(climbingLeaderboard(ranker, player));
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Set<Integer> setUnique = new HashSet<>(ranked);
        List<Integer> uniqueList = new ArrayList<>(setUnique);
        Collections.sort(uniqueList);
        Collections.reverse(uniqueList);

        List<Integer> result = new ArrayList<>();
        for (Integer playerScore : player){
            for (int i = 0; i < uniqueList.size(); i++){
                if (uniqueList.get(i) <= playerScore){
                    result.add(i + 1);
                    break;
                }
                if (i == uniqueList.size() - 1){
                    result.add(uniqueList.size() + 1);
                }
            }
        }
        return result;
    }
}
