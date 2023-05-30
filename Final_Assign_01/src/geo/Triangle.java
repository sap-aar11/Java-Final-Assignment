package geo;

public class Triangle implements Shape {
	float base, height;
	
	Triangle(float length, float ht)
	{
		base = length;
		height = ht;
	}
	
	public double area() {
		double tarea;
		tarea = 0.5 * base * height;
		return tarea;
	}

	
	public double perimeter() {
		double peri;
		//assuming right angled  triangle
		peri = 3 * base;
		return peri;
	}

}
