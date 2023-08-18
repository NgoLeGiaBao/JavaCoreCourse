public class Circle extends Shape {
	private double r;
	public Circle(Coordinates coordinates, double r) {
		super(coordinates);
		this.r = r;
	}
	@Override
	public double shapeArea() {
		return Math.PI * this.r * this.r;
	}
}
