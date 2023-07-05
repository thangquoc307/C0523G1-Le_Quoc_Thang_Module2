package b5_access_modifier_static_method_static_property.practice;

public class static_property {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
    public static class Car {
        private String name;
        private String engine;
        public static int numberOfCars;
        private Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCars++;
        }
    }
}
