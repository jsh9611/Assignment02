package equalsMethod;

public class Point {
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object a) {
		if (!(a instanceof Point))
			return false;
		Point p = (Point) a;
		return p.x == x && p.y == y;
	}

}
 