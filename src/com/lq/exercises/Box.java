package com.lq.exercises;

public class Box {
	private double length = 1;
	private double width = 1;
	private double height = 1;
	
	public Box() {}
	/**
	 * @param length
	 * @param width
	 * @param height
	 */
	public Box(double length, double width, double height) {
		super();
		if(length > 0) {
			this.length = length;
		}
		if(width > 0 ) {
			this.width = width;
		}
		if(height > 0) {
			this.height = height;
		}
	}
	
	public Box(double side) {
		this(side,side,side);
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		if(length > 0) {
			this.length = length;
		}
		else {
			System.out.println("Length must be greater than 0");
		}
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		if(width > 0) {
			this.width = width;
		}
		else {
			System.out.println("Width must be greater than 0");
		}
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		if(height > 0) {
			this.height = height;
		}
		else {
			System.out.println("Height must be greater than 0");
		}
	}

	public double getVolume() {
		return (length*width*height);
	}
	public double getSurfaceArea() {
		return (length*width + width*height + height*length)*2;
	}
	public void printBox() {
		if(height <= 0 || width <= 0 || length <= 0) {
			System.out.println("The box contains invalid properties");
		}
		else {
			System.out.println("Length = "+length);
			System.out.println("Width = "+width);
			System.out.println("Height = "+height);
			System.out.println("Volume = "+getVolume());
			System.out.println("Surface Area = "+getSurfaceArea());
		}
	}

}
