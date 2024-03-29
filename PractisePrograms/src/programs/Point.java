package programs;

public class Point {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	// Method to calculate distance between this Point and another //Point
	public double distance(Point point) {

		int xDiff = this.x - point.getX();
		int yDiff = this.y - point.getY();

		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	// Method to calculate distance between this Point and a //specified (x, y)

	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;

		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public static void main(String[] args) {
		Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2, 2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
	}

}
