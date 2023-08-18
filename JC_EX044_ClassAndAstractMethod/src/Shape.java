public abstract class Shape {
	protected Coordinates coordinates;
	public Shape (Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	public abstract double shapeArea ();
}
