package Question2;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
        super();
        width = 0;
        length = 0;
    }
    public Rectangle(double wy) {
        super();
        width = wy;
        length = wy;
    }
    public Rectangle(double w, double y) {
        super();
        width = w;
        length = y;
    }
    public Rectangle(double w, double y, String c, boolean f) {
        super(c, f);
        width = w;
        length = y;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double setLength(double l) {
        return length = l;
    }
    public double setWidth(double w) {
        return width = w;
    }

    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return width + width + length + length;
    }

    @Override
    public String toString() {
        if (width != length) {
            return "A Rectangle with a width of " + getWidth() + " and a length of " + getLength() + " which is a subclass of " + super.toString();
    } else {
            return "A Square with a length and width of " + getWidth() + " which is a subclass of " + super.toString();
        }
    }
}
