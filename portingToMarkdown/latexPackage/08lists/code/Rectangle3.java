public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
	return width;
    }

    public double getHeight() {
	return height;
    }

    public void setWidth(double w) {
	width = Math.abs(w);
    }

    public void setHeight(double h) {
	height = Math.abs(h);
    }

    public Rectangle() { //default constructor
	setWidth(0);
	setHeight(0);
    }

    public Rectangle(double side) { //parameterized constructor for a square
	setWidth(side);
	setHeight(side);
    }

    public Rectangle(double w, double h) { //parameterized constructor - generic
	setWidth(w);
	setHeight(h);
    }

    public double area() {
	return width * height;
    }

    public double perimeter() {
	return 2*(width + height);
    }
}
