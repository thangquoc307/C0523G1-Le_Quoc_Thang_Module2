package b6_inheritance.excercise;

public class Bt4Triangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1.toString());

        Triangle triangle2 = new Triangle(7,8,9);
        System.out.println(triangle2.toString());
    }
    public static class Triangle{
        double side1;
        double side2;
        double side3;
        public Triangle(){
            this(1, 1, 1);
        }
        public Triangle(double side1, double side2, double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public void setSide1(double side1) {
            this.side1 = side1;
        }
        public void setSide2(double side2) {
            this.side2 = side2;
        }
        public void setSide3(double side3) {
            this.side3 = side3;
        }
        public double getSide1() {
            return this.side1;
        }
        public double getSide2() {
            return this.side2;
        }
        public double getSide3() {
            return this.side3;
        }
        public double getPerimeter(){
            return this.side1 + this.side2 + this.side3;
        }
        public double getArea(){
            return Math.pow((this.getPerimeter()/2) *
                    ((this.getPerimeter()/2) - this.getSide1()) *
                    ((this.getPerimeter()/2) - this.getSide2()) *
                    ((this.getPerimeter()/2) - this.getSide3()), 0.5);
        }
        public String toString(){
            return "Triangle status : " +
                    "\n + length 1 : " + this.getSide1() + " m" +
                    "\n + length 2 : " + this.getSide2() + " m" +
                    "\n + length 3 : " + this.getSide3() + " m" +
                    "\n + Perimeter : " + this.getPerimeter() + " m" +
                    "\n + Area : " + this.getArea() + " m2";
        }
    }
}
