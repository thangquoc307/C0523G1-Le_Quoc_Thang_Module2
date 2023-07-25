package b15_debug.excercise;

public class CheckTriangle {
    private double a;
    private double b;
    private double c;
    public CheckTriangle(double a, double b, double c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        this.checkTriangle();
    }

    public void checkTriangle() throws IllegalTriangleException {

        if (this.a <= 0 || this.b <= 0 || this.c <=0){
            throw new IllegalTriangleException("Độ dài cạnh phải số dương chớ ba");
        }
        if ((this.a + this.b) <= this.c || (this.a + this.c) <= this.b || (this.b + this.c) <= this.a){
            throw new IllegalTriangleException("1 cạnh lớn hơn tổng 2 cạnh rồi, làm gì có tam giác như rứa");
        }
    }
}
