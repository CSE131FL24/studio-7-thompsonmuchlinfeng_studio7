package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		StdDraw.rectangle(1, 1, width, height);
		return 0;
	}
	
}
