package OOPbasics;

public class TestCircle {

	public static void main(String[] args) {
		// constructor tests
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(3.0, "blue");
		// getters test
		System.out.println("Circle 1, radius: " + c1.getRadius() + ", area: " + c1.getArea() + ", color: " + c1.getColor());
		System.out.println("Circle 2, radius: " + c2.getRadius() + ", area: " + c2.getArea() + ", color: " + c2.getColor());
		System.out.println("Circle 3, radius: " + c3.getRadius() + ", area: " + c3.getArea() + ", color: " + c3.getColor());
		// setter tests
		Circle c4 = new Circle();
		c4.setRadius(2.5);
		c4.setColor("magenta");
		// toString method tests
		System.out.println(c4);
	}

}
