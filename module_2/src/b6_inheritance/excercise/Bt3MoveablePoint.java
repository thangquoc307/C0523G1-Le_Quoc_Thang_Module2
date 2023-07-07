package b6_inheritance.excercise;

public class Bt3MoveablePoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(1561, 1611);
        MovablePoint point3 = new MovablePoint();
        MovablePoint point4 = new MovablePoint(25,26);

        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(point3.toString());
        System.out.println(point4.toString());

        System.out.println("Test");
        System.out.println(point4.toString());
        point4.move();
        System.out.println(point4.toString());
        point4.move();
        System.out.println(point4.toString());
    }
    public static class Point{
        float x;
        float y;
        public Point(){
            this(0.0f, 0.0f);
        }
        public Point(float x, float y){
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
    public static class MovablePoint extends Point{
        float xSpeed;
        float ySpeed;
        public MovablePoint(){
            this(0.0f, 0.0f);
        }
        public MovablePoint(float xSpeed, float ySpeed){
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public MovablePoint(float x, float y, float xSpeed, float ySpeed){
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
            this.x = x;
            this.y = y;
        }
        public float getxSpeed() {
            return this.xSpeed;
        }
        public float getySpeed() {
            return this.ySpeed;
        }
        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }
        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }
        public float[] getXYSpeed() {
            return new float[] {this.xSpeed, this.ySpeed};
        }
        public void move(){
            this.x += this.xSpeed;
            this.y += this.ySpeed;
        }

        public String toString(){
            return "Point x = " + this.x + " y = " + this.y + " / Speed " + this.xSpeed + " - " + this.ySpeed;
        }
    }
}
