package com.lq.exercises;

public class BoxDriver {

	public static void main(String[] args) {
		
		Box box1 = new Box(5,6,7);
		Box box2 = new Box(10);
		
		System.out.println("Box 1 length is + "+box1.getLength());
		System.out.println("Box 1 width is + "+box1.getWidth());
		System.out.println("Box 1 height is + "+box1.getHeight());
		
		System.out.println("Box 2 length is + "+box2.getLength());
		System.out.println("Box 2 width is + "+box2.getWidth());
		System.out.println("Box 2 height is + "+box2.getHeight());
		
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		System.out.println(
				"Box box1 length is + "+box1.getLength()+", width is + "+box1.getWidth()
		+", height is + "+box1.getHeight());
		
		System.out.println("The Volume of Box box1 is "+box1.getVolume());
		System.out.println("The Surface area of Box box1 is "+box1.getSurfaceArea());
		
		box1.printBox();
		
		box1.setLength(-5);
		box1.printBox();
		box1.setHeight(-9);
		box1.setWidth(-7);
		box1.printBox();
		
		Box box3 = new Box(3, -1, 0);
		box3.printBox();
	}

}
