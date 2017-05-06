package OOPbasics;

public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint() {	
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] coords = new int[2];
		coords[0] = this.x;
		coords[1] = this.y;
		return coords;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "\"(" + x + "," + y + ")\"";
	}
	
	public double distance(int x, int y) {
		int xdifference = this.x - x;
		int ydifference = this.y - y;
		return Math.sqrt(xdifference * xdifference + ydifference * ydifference);
	}
	
	public double distance(MyPoint another) {
		int xdifference = this.x - another.x;
		int ydifference = this.y - another.y;
		return Math.sqrt(xdifference * xdifference + ydifference * ydifference);
	}
	
	public double distance() {
		return Math.sqrt(x * x + y * y);
	}
}
