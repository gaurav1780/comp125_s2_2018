public class Rectangle {
    public double width;
    public double height;

    public double area() {
		return width * height;
    }

    public boolean isSquare() {
    	if(width == height)
    		return true;
    	else
    		return false;
    	//equally correct: 
    	//return width==height;
    }
}
