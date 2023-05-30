package geo;

public class Circle implements Shape {
 float  radius;
 Circle (float  length)
 {
	 //shapeName = "Circle";
	 radius = length;
	 //System.out.println("Shape Name is "+shapeName);
	 System.out.println("Inside Circle with radius"+length );
}
 public double area()
 {
	 double carea;
	 carea = 3.14 * radius * radius;
	 return carea;
 }
 
 public double perimeter()
 {
	 double peri ;
	 peri = 3.14 * 2 * radius;
	 return peri;
 }

 
}
