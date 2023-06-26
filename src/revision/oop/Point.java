package revision.oop;

public class Point {

    private double x;
    private double y;

    // default constructor
    public Point() {

    }

    // parametrized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    // Getters
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
