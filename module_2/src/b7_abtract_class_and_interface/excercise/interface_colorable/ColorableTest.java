package b7_abtract_class_and_interface.excercise.interface_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        SquareShape square1 = new SquareShape();
        SquareShape square2 = new SquareShape("Blue");
        System.out.println("Màu hình ban đầu");
        System.out.println(square1.info());
        System.out.println(square2.info());
        System.out.println("");

        square1.howToColor("BlackPink");
        square2.howToColor("PinkBlack");
        System.out.println("Màu hình sau khi đổi bằng interface");
        System.out.println(square1.info());
        System.out.println(square2.info());
    }
}
