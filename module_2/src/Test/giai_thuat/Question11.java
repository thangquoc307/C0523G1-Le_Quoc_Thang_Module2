package Test.giai_thuat;

public class Question11 {
    //Thầy Ba muốn có s cây bút để tặng cho học sinh của mình.
    //Ở cửa hàng bán bút CODEGYM đang có khuyến mãi như sau: Khi mua x cây bút sẽ được tặng y cây bút nữa.
    //Hãy đưa ra số bút tối thiểu mà Thầy Ba phải mua để thầy có đủ s cây bút.
    public static void main(String[] args) {

        System.out.println(promotion(2,1,6));
        System.out.println(promotion(3,2,11));
        System.out.println(promotion(3,2,5));
        System.out.println(promotion(4,2,11));
        System.out.println(promotion(5,2,10));
    }
    public static int promotion(int buy, int gift, int need){
        int totalBuyAndPrention = buy + gift;
        int mod = need % totalBuyAndPrention;
        int resultFloor = mod + Math.floorDiv(need, totalBuyAndPrention) * buy;

        int resultCeii = (Math.floorDiv(need, totalBuyAndPrention) + 1) * buy;

        if (resultCeii > resultFloor){
            return resultFloor;
        } else {
            return resultCeii;
        }
    }
}
