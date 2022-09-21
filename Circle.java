public class Circle extends Shape{
	private double radius;  //Private variable radius
	private String name;
	
	public Circle(double radius) {  //Constructor
		this.radius = radius;
		this.name = "Circle";
	}
	
	public String gettype() {  //getter method for shape type
		return this.name;
	}
	
	public double getRadius() {  //getter method
		return this.radius;
	}
	
	public void setRadius(double radius) {  //setter method
		this.radius = radius;
	}

	public double calculateArea() {  //implementation of calculateArea() method for this class
		return Math.PI*radius*radius;
	}
	
	public double calculatePerimeter() {  //implementation of calculatePerimeter() method for this class
		return Math.PI*radius*2;
	}
}
