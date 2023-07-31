package Test.hack_rank;

import java.util.ArrayList;

public class ElectronicShop {
    public static void main(String[] args) {
        int[] keyboards = {40,50,60};
        int[] drives = {5,8,12};
        System.out.println(getMoneySpent(keyboards, drives, 60));

    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        ArrayList<Integer> moneyList = new ArrayList<>();
        int money = 0;
        for (int i = 0; i < keyboards.length; i++){
            for (int j = 0; j < drives.length; j++){
                money = keyboards[i] + drives[j];
                moneyList.add(money);
            }
        }
        int maxMoney = -1;
        for (Integer integer : moneyList){
            if (maxMoney < integer && integer <= b){
                maxMoney = integer;
            }
        }
        return maxMoney;
    }
}
