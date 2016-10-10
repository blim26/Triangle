package package1;

public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		this(1.0,1.0,1.0);
	}
	
	public Triangle(double first, double second, double third) {
		this.side1 = first;
		this.side2 = second;
		this.side3 = third;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		return Math.sqrt((.5 * this.getPerimeter())*((.5 * this.getPerimeter()) - this.getSide1())
				*((.5 * this.getPerimeter()) - this.getSide2())*((.5 * this.getPerimeter()) - this.getSide3()));
	}
	
	public double getPerimeter() {
		return (this.getSide1() + this.getSide2() + this.getSide3());
	}
	
	public String toString() {
		return String.format("%d/%d/%d",  side1,side2,side3);
	}
	

}



