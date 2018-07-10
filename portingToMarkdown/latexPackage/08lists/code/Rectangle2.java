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

    public double area() {
	return width * height;
    }

    public double perimeter() {
	return 2*(width + height);
    }
}
