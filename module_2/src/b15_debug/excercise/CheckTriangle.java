package b15_debug.excercise;

public class CheckTriangle {
    public static void checkTriangle(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <=0){
            throw new Exception("Độ dài cạnh phải số dương chớ ba");
        }
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a){
            throw new Exception("1 cạnh lớn hơn tổng 2 cạnh rồi, làm gì có tam giác như rứa");
        }
    }
}
