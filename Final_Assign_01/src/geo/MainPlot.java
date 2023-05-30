package geo;

public class MainPlot {

	public static void main(String[] args) {
		
		Shape plotCircle =  new Circle((float)20.5);
		System.out.println("Area of Circular PLot is "+plotCircle.area());
		System.out.println("Perimeter of Circular PLOT IS "+plotCircle.perimeter());
		
		Shape plotTriangle = new Triangle(8,6);
		System.out.println("Perimeter of Triangular PLOT IS "+plotTriangle.perimeter());
		System.out.println("Perimeter of Triangular PLOT IS "+plotTriangle.perimeter());
	}

}
