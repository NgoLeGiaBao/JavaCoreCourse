public class Point extends Shape {
	public Point(Coordinates coordinates) {
		super(coordinates);
	}

	@Override
	public double shapeArea() {
		return 1;
	}
}
