package OOPbasics;

public class Circle {

	private double radius;
	private String color;
	
	// constructors
	public Circle(){
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	//methods: getters and setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// methods: compute area and toString()
	public double getArea() {
		 return radius*radius*Math.PI;
	}
	public String toString() {
		return "Cirlce[radius=" + radius + " ,color=" + color + "]";
	}
}
