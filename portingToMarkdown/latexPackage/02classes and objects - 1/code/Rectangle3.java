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

    //default constructor
    public Rectangle() { 
	setWidth(0);
	setHeight(0);
    }

    //parameterized constructor for a square
    public Rectangle(double side) { 
	setWidth(side);
	setHeight(side);
    }

    //parameterized constructor - generic
    public Rectangle(double w, double h) { 
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
