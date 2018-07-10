public class Rectangle {
    private double width, height;
    
    //getters and setters

    public Rectangle() { //default constructor

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
    //rest of the code
}
