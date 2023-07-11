package b4_class_and_object.excercise;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public String getSpeed(){
        if (this.speed == 1){
            return "SLOW";
        } else if (this.speed == 2) {
            return "MEDIUM";
        } else {
            return "FAST";
        }
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public String getOn(){
        if (this.on){
            return "This fan is ON";
        }else {
            return "This fan is OFF";
        }
    }
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String toString(){
        if (this.on){
            return "FanSpeed : " + this.getSpeed() + " FanColor : " + this.getColor();
        }else {
            return getOn();
        }
    }
}
