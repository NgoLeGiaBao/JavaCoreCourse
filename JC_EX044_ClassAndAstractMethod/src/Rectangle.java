public class Rectangle extends Shape {
	private double height;
	private double wide;
	public Rectangle(Coordinates coordinates, double height, double wide) {
		super(coordinates);
		this.height = height;
		this.wide = wide;
	}
	public double shapeArea() {
		return this.height * this.wide;
	}
}
