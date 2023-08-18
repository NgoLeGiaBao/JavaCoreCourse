public class Main_EX044_ClassAndAbstractMethod {
	public static void main(String[] args) {
		Coordinates cdn = new Coordinates(3, 3);
		Shape shp1 = new Point(cdn);
		Shape shp2 = new Rectangle(cdn, 10, 4);
		Shape shp3 = new Circle(cdn, 3.5);		
	
		System.out.println("Point's area is: " + shp1.shapeArea());
		System.out.println("Rectangle's area is: " + shp2.shapeArea());
		System.out.println("Circle's area is: " + shp3.shapeArea());
	}
}
