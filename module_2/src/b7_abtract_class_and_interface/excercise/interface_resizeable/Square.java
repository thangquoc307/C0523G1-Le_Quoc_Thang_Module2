package b7_abtract_class_and_interface.excercise.interface_resizeable;

public class Square implements Resizeable{
    private double length;
    public Square() {
        this(5);
    }
    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public String toString(){
        return "Hình vuông có chiều cạnh " + this.getLength() + "m";
    }

    @Override
    public void resize(double scaleFactor) {
        this.length *= scaleFactor;
    }
}
