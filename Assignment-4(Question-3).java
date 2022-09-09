class Shape{
	int r;
	int s;
	double pi;
	double area;
	
	public Shape(double pi, int r) {
		this.pi = pi;
		this.r = r;
	}
	public Shape(int s) {
		this.s = s;
	}
}
class Circle extends Shape{

	public Circle(double pi, int r) {
		super(pi, r);
	}
	
	public double getArea() {
		area = pi * r * r;
		return area;
	}
}
class Square extends Shape{

	public Square(int s) {
		super(s);
	}	
	public double getArea() {
		area = s * s;
		return area;
	}
}
public class Q3 {

	public static void main(String[] args) {
	Circle c = new Circle(3.14d,2);
	System.out.println("Area of Circle is: " + c.getArea());
	
	Square s = new Square(4);
	System.out.println("Area of Square is: " + s.getArea());
	}

}
