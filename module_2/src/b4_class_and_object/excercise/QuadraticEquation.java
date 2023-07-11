package b4_class_and_object.excercise;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return (-this.b + Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5))/(2 * this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5))/(2 * this.a);
    }
    public String getResult(){
        if (getDiscriminant() > 0){
            return "Phương trình có 2 nghiệm " + getRoot1() + " và " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "Phương trình có nghiệm kép " + getRoot1();
        } else {
            return "Phương trình vô nghiệm";
        }
    }
}
