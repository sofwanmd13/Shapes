public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) {  //Constructor for Triangle
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double calculateArea() {  //Abstract Area method from Shape Class, Using Heron's Formula so it works with all kinds of triangles
		double x = (side1+side2+side3)/2;
		return Math.pow((x*(x-side1)*(x-side2)*(x-side3)), 0.5);
	}
	
	public double calculatePerimeter() {  //Abstract Perimeter method from Shape Class
		return side1+side2+side3;
	}
	
	public double getHeight() {  //getter method for height
		return this.height;
	}
	
	public double getBase() {  //getter method for base
		return this.base;
	}
	
	public void setHeight(double height) {  //setter method for height
		this.height = height;
	}
	
	public void setBase(double base) {  //setter method for base
		this.base = base;
	}
	
	

}


