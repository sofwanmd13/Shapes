public class Rectangle extends Shape{
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {  //Constructor
		this.height = height;
		this.width = width;
	}
	
	public double calculateArea() {  //Abstract method from Shape class
		return height * width;
	}
	
	public double calculateCircumference() {
		return 2*(height+width);
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
