package b4_class_and_object.excercise;

public class Bt4_3Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(3);
        fan2.setSpeed(2);

        fan1.setRadius(10);
        fan2.setRadius(5);

        fan1.setColor("Yellow");
        fan2.setColor("Blue");

        fan1.setOn(true);
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

    public static class Fan {
        int speed;
        boolean on;
        double radius;
        String color;

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
}
