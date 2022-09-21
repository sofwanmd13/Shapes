public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;
	private String name;
	
	public Triangle(double side1, double side2, double side3, String name) {  //Constructor for Triangle
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.name = name;
	}

	public double calculateArea() {  //Abstract Area method from Shape Class, Using Heron's Formula so it works with all kinds of triangles
		double x = (side1+side2+side3)/2;
		return Math.pow((x*(x-side1)*(x-side2)*(x-side3)), 0.5);
	}
	
	public double calculatePerimeter() {  //Abstract Perimeter method from Shape Class
		return side1+side2+side3;
	}
	
	public String gettype() {  //getter method for name
		return this.name;
	}
	
	public double getside1() {  //getter method for side1
		return this.side1;
	}
	
	public double getside2() {  //getter method for side2
		return this.side2;
	}
	
	public double getside3() {  //getter method for side3
		return this.side3;
	}
	
	public void setside1(double side) {  //setter method for side1
		this.side1 = side;
	}
	
	public void setside2(double side) {  //setter method for side2
		this.side2 = side;
	}
	
	public void setside3(double side) {  //setter method for side3
		this.side3 = side;
	}
	
}
