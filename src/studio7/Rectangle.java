package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle{
	private int length;
	private int width;

	
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
		StdDraw.rectangle(0.5, 0.5, l, w);
	
		 
	}
	public int area() {
		return length *width;
	}
	public int perimeter() {
		return 2*(length+width);
	}
	public String toString() {
		return "The perimeter is " + perimeter() + ". The area is " + area() + " .";
	}
}
