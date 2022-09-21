public class Circle extends Shape{
	private double radius;  //Private variable radius
	
	public Circle(double radius) {  //Constructor
		this.radius = radius;
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
	
	public double calculateCircumference() {  //implementation of calculateCircumference() method for this class
		return Math.PI*radius*2;
	}
}
