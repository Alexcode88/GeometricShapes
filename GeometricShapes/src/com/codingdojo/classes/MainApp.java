package com.codingdojo.classes;

public class MainApp {
	public static void main( String args[] ) {
		Square square = new Square( 5.5 );
		
		double area, perimeter;
		
		area = square.area();
		perimeter = square.perimeter();
		
		System.out.println( "Area: " + area );
		System.out.println( "Perimeter: " + perimeter );
		
	}
}
