package OOPMyPoint;

public class TestMyCircle {
	
	public static void main(String[] args) {
		//test constructors
		MyCircle circle1 = new MyCircle();
		MyCircle circle2 = new MyCircle(2, 2, 10);
		MyPoint c3center = new MyPoint(1, 1);
		MyCircle circle3 = new MyCircle(c3center, 5);
		System.out.println("Circle1: " + circle1);
		System.out.println("Circle2: " + circle2);
		System.out.println("Circle3: " + circle3);
		System.out.println();
		//test setters
		circle1.setCenterY(9);
		circle1.setCenterX(4);
		System.out.println("Circle 1: " + circle1);
		MyPoint c4center = new MyPoint(10, -10);
		MyCircle circle4 = new MyCircle();
		circle4.setCenter(c4center);
		System.out.println("Circle 4: " + circle4);
		circle3.setCenterXY(-2, -3);
		circle3.setRadius(3);
		System.out.println("Circle 3: " + circle3);
		// test getters
		System.out.println("Circle 2: Center:" + circle2.getCenter() + ",centerX:" + circle2.getCenterX() + ",centerY:" + circle2.getCenterY()); ;
		System.out.println("Circle 2: radius:" + circle2.getRadius() + ",centerXY from array:" + circle2.getCenterXY()[0] + "," + circle2.getCenterXY()[1]);
		// test methods
		System.out.println("Circle 2: Area" + circle2.getArea() + ",circumference:" + circle2.getCircumference());
		MyCircle circle5 = new MyCircle();
		System.out.println("Distance between C2 and C5:" + circle2.distance(circle5));
	}
}
