package prac_7;

public class Rectangle implements Comparable, Scalable, Rotatable {

	double width;
	double height;

	
// Accessor (accessor methods return the value of a private variable)
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
// No argument constructor
	public Rectangle() {
		 width=1.0;
		 height=1.0;
		
	}
// Constructor with parameters
	
	public Rectangle(double width, double height) {
		super(); // Used to inherit the parent constructor
		this.width = width;
		this.height = height;
	}
// getArea method
	public double getArea()
	{
		return width * height;
	}
	
// getPermiter method
	public double getPermiter()
	{
		return 2 * (width + height); 
	}
	@Override // Annotation to tell the compiler
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

// Implementation of comparable interface/
	@Override // Annotation to tell the compiler
	public int compareTo(Rectangle t)
	{
		if (t.getArea() == getArea()) 
		return 1;
		else
		return 0;
	}

	
// Implementation of scalable interface method
	
	@Override // Annotation to tell the compiler
	public void scale(double factor) {
		// TODO Auto-generated method stub
		if (factor > 0)
		{
			width *= factor;
			height *= factor;
		}
	}

// Implementation of rotateable method
	
	@Override // Annotation to tell the compiler
public void rotate() {
	// TODO Auto-generated method stub
		double t;
		t = this.width;
		this.width = this.height;
		this.height = t;
		
		
}
	
}
