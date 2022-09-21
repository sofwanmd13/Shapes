public class Rectangle extends Shape{
	private double height;
	private double width;
	private String name;
	
	public Rectangle(double height, double width) {  //Constructor
		this.height = height;
		this.width = width;
		this.name = "Rectangle";
	}
	
	public double calculateArea() {  //Abstract methods from Shape class
		return height * width;
	}
	
	public double calculatePerimeter() {
		return 2*(height+width);
	}
	
	public String gettype() {  //getter method for shape type
		return this.name;
	}
	
	public double getHeight() {  //getter method for height
		return this.height;
	}
	
	public double getWidth() {  //getter method for width
		return this.width;
	}
	
	public void setHeight(double height) {  //setter method for height
		this.height = height;
	}
	
	public void setWidth(double width) {  //setter method for width
		this.width = width;
	}

}
