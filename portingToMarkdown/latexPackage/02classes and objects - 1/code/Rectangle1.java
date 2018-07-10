public class Rectangle {
    private double width;
    private double height;

    public double area() {
	return width * height;
    }

    public boolean isSquare() {
		return (width==height);
    }
}
