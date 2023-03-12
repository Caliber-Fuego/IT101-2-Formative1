package Formative1;

import java.util.Scanner;

public class AreaCircumferenceCircle {
	
	public static double circleArea (double radius) {
		double Area = (Math.PI*Math.pow(radius, 2));
		return Area;
	}
	public static double circleCircumference(double radius) {
		double Circ = (2*Math.PI)*(radius);
		return Circ;
	}
	
	public static void main (String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius:");
		double radius = input.nextDouble();
		
		double area = circleArea(radius);
		double circ = circleCircumference(radius);
		
		System.out.println("The area of a circle is:"+area+"\n"
						 + "The circumference of a circle is:"+circ);
	}
}
