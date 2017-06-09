package OOPMyPoint;

public class TestMyPoint {

	public static void main(String[] args) {
		// constructors test, toString test
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(5, 3);
		System.out.println(p1);
		System.out.println(p2);
		// test setters and getters
		p1.setX(2);
		p1.setY(6);
		p2.setXY(10, 12);
		System.out.println("P1 x: " + p1.getX());
		System.out.println("P1 y: " + p1.getY());
		System.out.println("P2 x: " + p2.getXY()[0]);
		System.out.println("P2 y: " + p2.getXY()[1]);
		// distance methods test
		System.out.println("Distance between P1 and P2: " + p1.distance(p2));
		System.out.println("Distance between P2 and P1: " + p2.distance(p1));
		System.out.println("Distance between P1 and 3,5: " + p1.distance(3, 5));
		System.out.println("Distance between P2 and 0,0: " + p2.distance());
	}
}
