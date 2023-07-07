package b7_abtract_class_and_interface.excercise.interface_resizeable;

public class Rectangle implements Resizeable{
    private double height;
    private double width;
    public Rectangle() {
        this(10, 5);
    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String toString(){
        return "Hình chữ nhật có chiều dài " + this.width + " m, chiều rộng " + this.height + " m";
    }

    @Override
    public void resize(double scaleFactor) {
        this.width *= scaleFactor;
        this.height *= scaleFactor;
    }
}
