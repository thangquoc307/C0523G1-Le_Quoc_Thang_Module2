package b5_access_modifier_static_method_static_property.excercise.bt5_2read_only_class;

public class Bt5_2ReadOnlyClass {
    public static void main(String[] args) {
        Student testStudent = new Student();

        System.out.println(testStudent.getName());
        System.out.println(testStudent.getClasses());

        testStudent.setName("Thắng");
        testStudent.setClasses("C05");

        System.out.println(testStudent.getName());
        System.out.println(testStudent.getClasses());
    }
}
