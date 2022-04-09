package prac_7;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r[]= new Rectangle [5];
		r[0] = new Rectangle(3,1);
		r[1] = new Rectangle(9,4);
		r[2] = new Rectangle(2,1);
		r[3] = new Rectangle(11,19);
		r[4] = new Rectangle(1,2);
		

// Scaling all the rectangles 
		
	for ( int i = 0 ; i < 5 ; i++) {
		r[i].scale(2.0);
		System.out.println("The width of the rectangle "+i+" = "+r[i].getWidth());
		System.out.println("The height of the rectangle "+i+" = "+r[i].getHeight());
		System.out.println("The area of the rectangle "+i+" = "+r[i].getArea());
		System.out.println("The perimeter of the rectangle "+i+" = "+r[i].getPermiter());
	}
	
// Rotation of rectangles 
	
	for ( int i = 0 ; i < 5 ; i++)
	{
		r[i].rotate();
		System.out.println("After the rotation of the width of rectangle "+i+" = "+r[i].getWidth());
		System.out.println("After the rotation of the height of rectangle "+i+" = "+r[i].getHeight());
		System.out.println("After the rotation of the area of rectangle "+i+" = "+r[i].getArea());
		System.out.println("After the rotation of the perimeter of rectangle "+i+" = "+r[i].getPermiter());
	}
// Comparison of first two rectangles and display the result of comparison
		
		int comp_result= r[0].compareTo(r[1]);
		if(comp_result == 0)
			System.out.println("Rectangle 1 and 2 are not equal");
		else
			System.out.println("Both rectangle are equal");
	}
}