package b7_abtract_class_and_interface.excercise.interface_resizeable;

public class Circle implements Resizeable{
    private double r;
    public Circle() {
        this(5);
    }
    public Circle(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public String toString(){
        return "Hình tròn bán kính : " + this.getR() + "m";
    }
    @Override
    public void resize(double scaleFactor) {
        this.r *= scaleFactor;
    }
}
