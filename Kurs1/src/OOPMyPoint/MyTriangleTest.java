package OOPMyPoint;

public class MyTriangleTest {

	public static void main(String[] args) {
		MyTriangle t1 = new MyTriangle(1, 1, 2, 2, 3, 3);
		MyPoint p1 = new MyPoint(4, 3);
		MyPoint p2 = new MyPoint(0, 0);
		MyPoint p3 = new MyPoint(0, 3);
		MyTriangle t2 = new MyTriangle(p1, p2, p3);
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println("T1 perimeter: " + t1.getPerimeter());
		System.out.println("T2 perimeter: " + t2.getPerimeter());
		
		System.out.println("T1 type: " + t1.getType());
		System.out.println("T2 type: " + t2.getType());
	}

}
