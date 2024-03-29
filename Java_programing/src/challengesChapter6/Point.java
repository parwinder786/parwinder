package challengesChapter6;

public class Point {

	private int x, y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() {
		return Math.sqrt((getX() - 0.0) * (getX() - 0.0) + (getY() - 0.0) * (getY() - 0.0));

	}

	public double distance(int x, int y) {
		return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));

	}
	public double distance(Point xy) {
		return Math.sqrt((xy.x - this.x) * (xy.x - this.x) + (xy.y - this.y) * (xy.y - this.y));

	}
	

}
