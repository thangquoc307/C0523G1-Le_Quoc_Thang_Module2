package b6_inheritance.excercise;

public class Bt1CircleAndCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10, "White");

        System.out.println(circle1.getStatus());
        System.out.println(circle2.getStatus());

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(18, 15, "Brown");

        System.out.println(cylinder1.getStatus());
        System.out.println(cylinder2.getStatus());


    }
    public static class Circle{
        int radius;
        String colour;
        public Circle(){
            this(5, "Green");
        }
        public Circle(int radius, String colour){
            this.colour = colour;
            this.radius = radius;
        }
        public int getRadius() {
            return this.radius;
        }
        public String getColour() {
            return this.colour;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }
        public void setColour(String colour) {
            this.colour = colour;
        }
        public double getArea(){
            return Math.PI * Math.pow(this.radius, 2);
        }
        public String getStatus(){
            return "A circle has "
                    + "\n  + radius : " + this.getRadius()
                    + "\n  + colour : " + this.getColour()
                    + "\n  + area : " + this.getArea();
        }
    }
    public static class Cylinder extends Circle {
        private int height;
        public Cylinder(){
            this.height = 6;
        }
        public Cylinder(int radius, int height, String colour){
            this.radius = radius;
            this.height = height;
            this.colour = colour;
        }
        public int getHeight() {
            return this.height;
        }
        public void setHeight(int height) {
            this.height = height;
        }

        public double getVolume() {
            return this.getArea() * this.getHeight();
        }

        @Override
        public String getStatus() {
            return "A cylinder has "
                    + "\n  + radius : " + this.getRadius()
                    + "\n  + height : " + this.getHeight()
                    + "\n  + colour : " + this.getColour()
                    + "\n  + volume : " + this.getVolume();
        }
    }
}
