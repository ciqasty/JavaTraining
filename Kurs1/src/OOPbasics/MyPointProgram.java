package OOPbasics;

public class MyPointProgram {

	public static void main(String[] args) {
		// create array and allocate 10 points with coordinates equal to (array index + 1)
		MyPoint[] points = new MyPoint[10];
		for (int index = 0; index<points.length; index++) {
			points[index] = new MyPoint(index+1, index+1);
		}
		// print coordinates to console
		for (MyPoint myPoint : points) {
			System.out.println("Point coordinates: " + myPoint.getX() + "," + myPoint.getY());
		}
	}

}
