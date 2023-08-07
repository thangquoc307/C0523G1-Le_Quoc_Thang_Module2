package Training.giai_thuat;

public class Question10 {
    //Bình đang có n VNĐ và bằng cách nào đó Bình biết trước được giá mua và giá bán của 1 đô-la của các ngày tiếp theo. Biết giá mua và giá bán đô-la tại 1 ngày là như nhau. Bình muốn tìm cách mua và bán đô-la hợp lý nhất để vào ngày cuối cùng số VNĐ Bình có là lớn nhất biết Bình chỉ có thể mua đô-la tại đúng 1 ngày và bán cũng vậy.
    //Hãy viết hàm trả về số đô-la tối đa có thể thu được vào ngày cuối cùng
    public static void main(String[] args) {
        System.out.println(exchangeMoney(new int[]{3,7}, 4));
        System.out.println(exchangeMoney(new int[]{3,2,1}, 10));
        System.out.println(exchangeMoney(new int[]{3,2,1,8}, 5));
        System.out.println(exchangeMoney(new int[]{3,5,2,7,1}, 7));
    }
    public static int exchangeMoney(int[] chart, int money){
        for (int i = 0; i < chart.length - 1; i++){
            if (chart[i] < chart[i + 1]){
                int usdCanBuy = Math.floorDiv(money, chart[i]);
                money += usdCanBuy * (chart[i + 1] - chart[i]);
            }
        }
        return money;
    }
}
