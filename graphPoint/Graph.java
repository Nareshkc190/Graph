package graphPoint;

public class Graph {

public static void main(String[] args) {
	
	Point point1 = new Point(2,4);
	Point point2 = new Point(-2,4);
	Point point3 = new Point(-4,-3);
	Point point4 = new Point(2,-7);
	
	System.out.println("Distance between Point1 and Point2 is " + point1.distance(point2));
	System.out.println("Distance between Point2 and Point3 is " + point2.distance(point3));
	System.out.println("Distance between Point3 and Point4 is " + point3.distance(point4));
	System.out.println("Distance between Point4 and Point1 is " + point4.distance(point1) + "\n");

	System.out.println("Point1 is in " + point1.quadrant());
	System.out.println("Point2 is in " + point2.quadrant());
	System.out.println("Point3 is in " + point3.quadrant());
	System.out.println("Point4 is in " + point4.quadrant() + "\n");

	point1.shift();
	point4.shift();
	
	System.out.println("Point1 after shift: " + point1);
	System.out.println("Point4 after shift:" + point4);	
	
	
	
}
}

