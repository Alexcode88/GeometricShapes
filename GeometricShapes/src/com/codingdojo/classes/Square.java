package com.codingdojo.classes;
import com.codingdojo.abstracclassses.Shape;

public class Square extends Shape {
	private int numSides;
	private double length;
	
	public Square( double length ) {
		this.numSides = 4;
		this.length = length;
	}
	
	@Override
	public double area() {
		return this.length * this.length;
	}
	
	@Override
	public double perimeter() {
		return this.length * this.numSides;
	}
	
	@Override
	public void print() {
		System.out.println( "Num sides: " + this.numSides );
		System.out.println( "Length: " + this.length );
	}
}
