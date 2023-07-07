package b6_inheritance.excercise;

public class Bt2Point2dAndPoint3d {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(10, 99);

        Point3D point3 = new Point3D();
        Point3D point4 = new Point3D(1000, 2000, 3000);
        Point3D point5 = new Point3D(777);

        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(point3.toString());
        System.out.println(point4.toString());
        System.out.println(point5.toString());

    }
    public static class Point2D{
        float x;
        float y;
        public Point2D(){
            this(0.0f, 0.0f);
        }
        public Point2D(float x, float y){
            this.x = x;
            this.y = y;
        }
        public float getX() {
            return this.x;
        }
        public float getY() {
            return this.y;
        }
        public float[] getXY(){
            return new float[] {this.x, this.y};
        }
        public void setX(float x) {
            this.x = x;
        }
        public void setY(float y) {
            this.y = y;
        }
        public void setXY(float x, float y){
            this.x = x;
            this.y = y;
        }
        public String toString(){
            return "Tọa độ điểm x = " + this.x + " y = " + this.y;
        }
    }
    public static class Point3D extends Point2D{
        private float z;
        public Point3D(){
            this.z = 0.0f;
        }
        public Point3D(float x, float y, float z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public Point3D(float z){
            this.z = z;
        }

        public String toString(){
            return "Tọa độ điểm x = " + this.x + " y = " + this.y + " z = " + this.z;
        }
    }
}
