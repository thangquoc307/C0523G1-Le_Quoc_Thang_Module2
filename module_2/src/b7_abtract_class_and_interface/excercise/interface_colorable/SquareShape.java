package b7_abtract_class_and_interface.excercise.interface_colorable;

public class SquareShape implements Colorable{
    private String color;
    public SquareShape() {
        this("White");
    }
    public SquareShape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String info(){
        return "Hình vuông có màu " + this.color;
    }
    @Override
    public void howToColor(String color) {
        setColor(color);
    }
}
