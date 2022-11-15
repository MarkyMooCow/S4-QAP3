package Question2;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        super();
        side = 1.0;
    }
    public Square(double x) {
        super(x, x);
        side = x;
    }
    public Square(double x, String c, boolean f) {
        super(x, x, c, f);
        side = x;
    }

    @Override
    public double setLength(double l) {
        return super.setLength(l) + super.setWidth(l);
    }
    @Override
    public double setWidth(double w) {
        return super.setWidth(w) + super.setLength(w);
    }
    @Override
    public double getArea() {
        return super.getArea();
    }
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
