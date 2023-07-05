package b5_access_modifier_static_method_static_property.excercise.bt5_1access_modifier;

public class Circle {
    private double radius;
    private String color;
    private Circle(){
    }
    public Circle(double r){
        this.radius = r;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
