package b7_abtract_class_and_interface.excercise.interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(20);

        System.out.println("Giá trị đầu hình tròn");
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        circle1.resize(1.1);
        circle2.resize(2);
        System.out.println("Giá trị sau sử dụng resize");
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println("");

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 40);

        System.out.println("Giá trị đầu hình chữ nhật");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

        rectangle1.resize(1.1);
        rectangle2.resize(2);
        System.out.println("Giá trị sau sử dụng resize");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println("");

        Square square1 = new Square();
        Square square2 = new Square(15);

        System.out.println("Giá trị đầu hình chữ vuông");
        System.out.println(square1.toString());
        System.out.println(square2.toString());

        square1.resize(1.1);
        square2.resize(2);
        System.out.println("Giá trị sau sử dụng resize");
        System.out.println(square1.toString());
        System.out.println(square2.toString());
        System.out.println("");
    }
}
