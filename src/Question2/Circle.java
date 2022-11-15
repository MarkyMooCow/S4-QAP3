package Question2;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();
        radius = 1.0;
    }
    public Circle(double r) {
        super();
        radius = 1.0;
    }
    public Circle(String c, boolean f) {
        super(c, f);
        radius = 1.0;
    }
    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double setRadius(double r) {
        return radius = r;
    }
    public double getArea() {
        return 3.14 * (radius * radius);
    }
    @Override
    public String toString() {
        return "A Circle with a radius of " + getRadius() + " which is a subclass of " + super.toString();
    }
}